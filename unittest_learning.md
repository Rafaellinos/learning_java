# unit test

## First principle:

- F = unit test run fast | no db communication or http, etc
- I = independent of others
- R = repeatable = produce same result every time
- S = Self-validating = validate the result for itself
- T = Thorough & Timely = Cover edge cases

## Test code Isolation

- isolate from other classes, not call other dependencies
- inject mock in objects, dependency injection helps with that matter
- instead of instantiate the object within the method, put it as a parameter

## Testing pyramid

3 - End to end and UI testing = testing feature
2 - integration tests = database, http requests
1 - unittest (pyramid base) = with fakes and mocks, fastest

## Junit 5

- junit platform
  - foundation for testing with jvm
- junit jupiter
  - writing unit test, assertions
- junit vintage
  - testing engine, can run junit 3 and 4

## Surefire plugin maven

- mvn test -> use plugin to execute tests on build and mvn test command
- mvn backage -Dmaven.test.skip=true

## Assertions and assertion message

- AssertEquals(2, expectedResult, "The result should be something")

## Assertions types

- notEquals, assertTrue, AssertFalse, AssertNull
- AssertThrow

## Lazy error messages

- use lambda for error messages like: () -> "Some Error Messsage"

## Lifecycle

- Order | annotation | description
- 1st @BeforeAll setup() = can be used to start a database | must be static
- 2nd @BeforeEach = when u need to create same object
- 3rd @AfterEach = can be used to close database connection
- 4rd @AfterAll cleanup() = delete database | must be static

## Disable unit test

- comment @Test annotation
- @Disabled("wip")

## Test method parameters

- @ParameterizedTest and @MethodSource
- @MethodSource return input params 
  - return a stream of arguments, each item of the stream is a test run
- @CsvSource( {"arg1, arg2, arg3", "arg4, arg 5, arg6"} ) | '' for empty value | for null, just comma
- @CsvFileSource(resources = "/path")
- @ValueSource = single parameter
  - @ValueSource(strings = {"value1", "value2", "value3"})
  - in e.g. above call 3 times for each str

## Repeated tests

- @RepeatedTest(3) = repeat same test 3 times
  - receive the parameter RepetitionInfo to get total repetition and current
- receive parameter TestInfo to get infos like method name or display name
- @RepeatedTest(value=3, name="{displayName}, Repetition {currentRepetition} of {totalRepetitions}")
  - it's possible to edit the display info of each repetition with the example above

## Method order

- annotate the test class with @TestMethodOrder(MethodOrderer.<ORDER>)
- MethodOrderer.Random.class = random order for all methods for class
- MethodOrderer.MethodName.class = sort by method name like methodA->methodB->methodC->...
- MethodOrderer.OrderAnnotation.class = @Order(INDEX) test will be executed in order ASC

## Class call order

- Use annotation in class @Order(INDEX) for classes executions in order
- junit-platform.properties = junit.jupiter.testclass.order.default=org.junit.jupiter.api.ClassOrder.OrderAnnotation
- can change the classes order by this configuration

## Changing lifecycle

- by default is per instance
- @TestInstance(Lifecycle.PER_CLASS) all test within the class will share same instance
  - helpful for integration tests
- PER_CLASS make the tests dependable of each other
- Use case: First test create user, second update and last delete for same user (H2)


# TDD Test-Driven Development

- write unit test first
- Red -> Green -> Refactor -> Repeat
- Red = write unit test and fails (stop and fix the issue as soon as the test fails)
- Green = Write application code for unit test pass
- Refactor = Clean up. Improve unit and app code
- Repeat = repeat all steps above until de feat is ready

# Mockito

- Open source testing framework to test double
- test double? R: Mock, Fake, Spy, Stub - Replace object
- useful to avoid dealing with external dependencies, like a database
- doCallRealMethod().when... for calling the real method

# Test report

- Use maven surefire report to generate report on /target/site/surefire-report.html

## Dependencies for generate report:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.1.2</version>
            <configuration>
                <!-- generate report even with fail test -->
                <testFailureIgnore>true</testFailureIgnore>
            </configuration>
        </plugin>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-report-plugin</artifactId>
            <version>3.1.2</version>
            <executions>
                <execution>
                    <phase>test</phase>
                    <goals>
                        <goal>report</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

## Generate test code report with coverage

- jacoco maven plugin (java code coverage)
- execute mvn clean test
- look for target/site/jacoco/index.html

```xml
<plugin>
  <groupId>org.jacoco</groupId>
  <artifactId>jacoco-maven-plugin</artifactId>
  <version>0.8.10</version>
  <executions>
    <execution>
      <id>prepare-agent</id>
      <goals>
        <goal>prepare-agent</goal>
      </goals>
    </execution>
    <execution>
      <id>report</id>
      <phase>test</phase>
      <goals>
        <goal>report</goal>
      </goals>
    </execution>
  </executions>
</plugin>
```

# Unit test Spring boot

- integration test between RestController -> Service -> Repository
- Integration test with Spring framework (mock service but not Spring)
- Acceptance test all layers, end to end, not mock for any layer
- @SpringBootTest -> do not start web server
- spring-boot-starter-test includes mockito and junit jupiter
- for spring security, add spring-security-test