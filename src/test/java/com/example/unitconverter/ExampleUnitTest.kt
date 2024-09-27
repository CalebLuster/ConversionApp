package com.example.unitconverter

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val unitConverter = UnitConverter()

    @Test
    fun testCelsiusToFahrenheit() {
        val result = unitConverter.celsiusToFahrenheit(0.0)
        assertEquals(32.0, result, 0.001)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = unitConverter.fahrenheitToCelsius(32.0)
        assertEquals(0.0, result, 0.001)
    }

    @Test
    fun testInchesToFeet() {
        val result = unitConverter.inchesToFeet(12.0)
        assertEquals(1.0, result, 0.001)
    }

    @Test
    fun testFeetToInches() {
        val result = unitConverter.feetToInches(1.0)
        assertEquals(12.0, result, 0.001)
    }

    @Test
    fun testPoundsToKilograms() {
        val result = unitConverter.poundsToKilograms(1.0)
        assertEquals(0.453592, result, 0.001)
    }

    @Test
    fun testKilogramsToPounds() {
        val result = unitConverter.kilogramsToPounds(0.453592)
        assertEquals(1.0, result, 0.001)
    }
}