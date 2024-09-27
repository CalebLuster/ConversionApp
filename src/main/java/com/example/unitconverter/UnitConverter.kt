package com.example.unitconverter

class UnitConverter {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 9/5 + 32
    }

    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32) * 5/9
    }

    fun inchesToFeet(inches: Double): Double {
        return inches / 12
    }

    fun feetToInches(feet: Double): Double {
        return feet * 12
    }

    fun poundsToKilograms(pounds: Double): Double {
        return pounds * 0.453592
    }

    fun kilogramsToPounds(kilograms: Double): Double {
        return kilograms / 0.453592
    }
}
