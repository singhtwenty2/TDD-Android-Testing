# Learning Notes on Testing in Android

## 1. Testing Definition and Why We Need Testing

### What is Testing?
Testing is the process of evaluating and verifying that a software application or system meets the specified requirements and works as expected. It involves running the software under various conditions to identify any defects or issues.

### Why Do We Need Testing?
- **Ensure Quality:** Testing helps to ensure that the software is of high quality and free of bugs.
- **Detect Issues Early:** Early testing can catch defects before they become more difficult and costly to fix.
- **Improve Performance:** Testing can identify performance bottlenecks and ensure the software runs efficiently.
- **Enhance Security:** Testing can uncover security vulnerabilities, ensuring the application is safe for users.
- **User Satisfaction:** Well-tested software provides a better user experience, leading to higher user satisfaction.

## 2. Types of Testing in Android

### Unit Test
- Tests individual units or components of the software.
- Ensures that each part of the code works correctly in isolation.

### Integration Test
- Tests the interactions between different units or components.
- Ensures that combined parts of the application work together as expected.

### UI Test
- Tests the user interface of the application.
- Ensures that the app's user interface behaves correctly from the user's perspective.

### Instrumentation Test
- Tests the application in a real or simulated Android environment.
- Includes both UI tests and integration tests that run on actual devices or emulators.

## 3. In-Depth About the Types of Tests

### Unit Tests
- Focus on individual methods or functions.
- Use frameworks like JUnit to write and run tests.
- Mock external dependencies using libraries like Mockito.

### Integration Tests
- Test the flow of data between modules.
- Ensure that different parts of the application work together seamlessly.
- May use Android's Instrumentation framework for more complex integration scenarios.

### UI Tests
- Automate user interactions to test the UI.
- Use frameworks like Espresso for Android UI testing.
- Validate UI elements, user flows, and interactions.

### Instrumentation Tests
- Run on actual devices or emulators to test real-world scenarios.
- Use Android's Instrumentation framework or UI Automator for testing.
- Can include both UI tests and broader integration tests.

## 4. Frameworks and Libraries Used in Testing of Android

### JUnit
- A widely-used testing framework for Java.
- Used for writing and running unit tests.

### Mockito
- A mocking framework for Java.
- Allows creating mock objects for testing dependencies.

### Espresso
- A UI testing framework for Android.
- Provides APIs to simulate user interactions and validate UI elements.

### Robolectric
- A framework that allows running Android tests on the JVM.
- Speeds up testing by eliminating the need for an emulator.

### AndroidJUnitRunner
- A test runner for executing JUnit tests on Android devices.
- Integrates with Android's testing framework for running instrumentation tests.

## 5. Basics of TDD and Its Principle

### What is TDD?
Test-Driven Development (TDD) is a software development approach where tests are written before writing the actual code. It follows a repetitive cycle of writing a test, implementing the code to pass the test, and then refactoring the code.

### TDD Principle
1. **Write a Test:** Start by writing a test for a new feature or functionality.
2. **Run the Test:** Run the test to see it fail, confirming that the feature is not yet implemented.
3. **Write the Code:** Write the minimal code needed to pass the test.
4. **Run the Test Again:** Run the test to ensure it passes.
5. **Refactor:** Refactor the code to improve its structure while ensuring the test still passes.
6. **Repeat:** Repeat the cycle for each new feature or functionality.

## 6. What Makes a Good Unit Test

### Scope
- A good unit test should have a narrow scope, focusing on a small part of the code.
- It should test only one aspect or functionality of the unit.

### Speed
- Unit tests should be fast to execute.
- Quick tests facilitate frequent and efficient testing during development.

### Fidelity
- Unit tests should provide reliable and accurate results.
- They should consistently pass or fail based on the correctness of the code.

---

![Test scopes in a typical application](https://developer.android.com/static/training/testing/fundamentals/test-scopes.png)
![Different types of tests depending on where they run](https://developer.android.com/static/training/testing/fundamentals/instru-vs-local.png)
![Unit Testing Diagram](https://cms-cdn.katalon.com/number_of_tests_in_unit_testing_integration_testing_and_acceptance_testing_88a3245529.png)
![TDD Cycle](https://images.spiceworks.com/wp-content/uploads/2022/09/29095630/How-TDD-Works.png)

