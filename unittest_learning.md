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
