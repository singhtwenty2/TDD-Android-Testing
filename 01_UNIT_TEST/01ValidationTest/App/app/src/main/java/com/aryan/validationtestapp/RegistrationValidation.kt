package com.aryan.validationtestapp

object RegistrationValidation {

    /*
        A Registration is invalid if:
        1. password and confirm password do not match
        2. password is less than 3 characters
        3. password contains less than 2 digits
        4. email is not in the correct format
        5. email is already taken
        6. name is empty
        7. name contains more than 20 characters
     */

    // Simulating a DB
    private val userEmails = listOf(
        "amaryan@example.com",
        "rimshab.moody@example.com",
        "amaresh@example.com",
        "vimdhayk@example.com"
    )

    fun validateRegistration(
        name: String,
        email: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        val isValidName = name.isNotEmpty() && name.length <= 20
        val isValidEmail = email.contains("@") && email.contains(".") && email.endsWith("com") && !userEmails.contains(email)
        val isValidPassword = password.length >= 3 && password.count { it.isDigit() } >= 2
        val isValidConfirmPassword = password == confirmPassword
        return isValidName && isValidEmail && isValidPassword && isValidConfirmPassword

    }
}