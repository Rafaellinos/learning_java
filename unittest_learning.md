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
