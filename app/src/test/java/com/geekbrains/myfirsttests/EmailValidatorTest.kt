package com.geekbrains.myfirsttests

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        val correctUserName = EmailValidator.isValidEmail("gmail.com")
        assertFalse("Error is here", correctUserName)
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_NoDomain_ReturnFalse() {
        val exampleNoDomain = EmailValidator.isValidEmail("someName@.com")
        assertFalse("No domain in the email", exampleNoDomain)
        assertFalse(EmailValidator.isValidEmail("someName@.com"))
    }

    @Test
    fun emailValidator_NoAtSymbol_ReturnFalse() {
        val exampleAtSymbol = EmailValidator.isValidEmail("someName.com")
        assertFalse("No @ in the email", exampleAtSymbol)
        assertFalse(EmailValidator.isValidEmail("someName.com"))
    }
}
