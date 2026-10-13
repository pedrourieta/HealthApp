package com.healthapp.login

object LoginValidator {
    fun isValidEmail(email: String): Boolean =
        Regex("^[\\w.+-]+@[\\w-]+\\.[\\w.]+$").matches(email)

    fun isValidPassword(password: String): Boolean = password.length >= 8
}