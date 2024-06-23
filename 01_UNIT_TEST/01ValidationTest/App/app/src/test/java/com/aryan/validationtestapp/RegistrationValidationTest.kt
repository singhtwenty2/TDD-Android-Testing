package com.aryan.validationtestapp

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationValidationTest {

    @Test
    fun `password and confirm password match name is valid and email is valid return true`() {
        val result = RegistrationValidation.validateRegistration(
            name = "Dogesh Kumar",
            email = "cse@gmail.com",
            password = "12345",
            confirmPassword = "12345"
        )

        // Expected true for the above test case
        assertThat(result).isTrue()
    }
    @Test
    fun `password and confirm password do not match return false`() {
        val result = RegistrationValidation.validateRegistration(
            name = "Dogesh Kumar",
            email = "cse@gmail.com",
            password = "1234",
            confirmPassword = "12345"
        )

        // Expected false for the above test case
        assertThat(result).isFalse()
    }

    @Test
    fun `password is less than 3 characters return false`() {
        val result = RegistrationValidation.validateRegistration(
            name = "Dogesh Kumar",
            email = "cse@gmail.com",
            password = "12",
            confirmPassword = "12"
        )

        // Expected false for the above test case
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits return false`() {
        val result = RegistrationValidation.validateRegistration(
            name = "Dogesh Kumar",
            email = "cse@gmail.com",
            password = "1pass",
            confirmPassword = "1pass"
        )

        // Expected false for the above test case
        assertThat(result).isFalse()
    }

    @Test
    fun `email is not in the correct format return false`() {
        val result = RegistrationValidation.validateRegistration(
            name = "Dogesh Kumar",
            email = "12378gjh",
            password = "12345",
            confirmPassword = "12345"
        )

        // Expected false for the above test case
        assertThat(result).isFalse()
    }

    @Test
    fun `email is already taken return false`() {
        val result = RegistrationValidation.validateRegistration(
            name = "Dogesh Kumar",
            email = "amaryan@example.com",
            password = "12345",
            confirmPassword = "12345"
        )

        // Expected false for the above test case
        assertThat(result).isFalse()
    }

    @Test
    fun `name is empty return false`() {
        val result = RegistrationValidation.validateRegistration(
            name = "",
            email = "amaryan@example.com",
            password = "12345",
            confirmPassword = "12345"
        )

        // Expected false for the above test case
        assertThat(result).isFalse()
    }

    @Test
    fun `name contains more than 20 characters return false`() {
        val result = RegistrationValidation.validateRegistration(
            name = "Muttu Swami Chinna Swami Santosh Reddy Swami Dogesh Kumar Iyer",
            email = "amaryan@example.com",
            password = "12345",
            confirmPassword = "12345"
        )

        // Expected false for the above test case
        assertThat(result).isFalse()
    }
}