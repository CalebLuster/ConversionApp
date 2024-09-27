package com.example.unitconverter

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    private lateinit var inputCelsius: EditText
    private lateinit var inputFahrenheit: EditText
    private lateinit var inputInches: EditText
    private lateinit var inputFeet: EditText
    private lateinit var inputPounds: EditText
    private lateinit var inputKilograms: EditText

    private val unitConverter = UnitConverter()

    // Flag to avoid infinite loop
    private var isUpdating = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize EditText fields
        inputCelsius = findViewById(R.id.inputCelsius)
        inputFahrenheit = findViewById(R.id.inputFahrenheit)
        inputInches = findViewById(R.id.inputInches)
        inputFeet = findViewById(R.id.inputFeet)
        inputPounds = findViewById(R.id.inputPounds)
        inputKilograms = findViewById(R.id.inputKilograms)

        // Set up text change listeners
        setupTextListeners()
    }

    private fun setupTextListeners() {
        // Celsius to Fahrenheit conversion
        inputCelsius.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (isUpdating) return // Skip if updating

                val input = s.toString()
                if (input.isNotEmpty()) {
                    isUpdating = true // Set flag to true
                    val celsius = input.toDouble()
                    val fahrenheit = unitConverter.celsiusToFahrenheit(celsius)
                    inputFahrenheit.setText(fahrenheit.toString())
                    isUpdating = false // Reset flag
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // Fahrenheit to Celsius conversion
        inputFahrenheit.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (isUpdating) return // Skip if updating

                val input = s.toString()
                if (input.isNotEmpty()) {
                    isUpdating = true
                    val fahrenheit = input.toDouble()
                    val celsius = unitConverter.fahrenheitToCelsius(fahrenheit)
                    inputCelsius.setText(celsius.toString())
                    isUpdating = false
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // Inches to Feet conversion
        inputInches.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (isUpdating) return

                val input = s.toString()
                if (input.isNotEmpty()) {
                    isUpdating = true
                    val inches = input.toDouble()
                    val feet = unitConverter.inchesToFeet(inches)
                    inputFeet.setText(feet.toString())
                    isUpdating = false
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // Feet to Inches conversion
        inputFeet.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (isUpdating) return

                val input = s.toString()
                if (input.isNotEmpty()) {
                    isUpdating = true
                    val feet = input.toDouble()
                    val inches = unitConverter.feetToInches(feet)
                    inputInches.setText(inches.toString())
                    isUpdating = false
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // Pounds to Kilograms conversion
        inputPounds.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (isUpdating) return

                val input = s.toString()
                if (input.isNotEmpty()) {
                    isUpdating = true
                    val pounds = input.toDouble()
                    val kilograms = unitConverter.poundsToKilograms(pounds)
                    inputKilograms.setText(kilograms.toString())
                    isUpdating = false
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        // Kilograms to Pounds conversion
        inputKilograms.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                if (isUpdating) return

                val input = s.toString()
                if (input.isNotEmpty()) {
                    isUpdating = true
                    val kilograms = input.toDouble()
                    val pounds = unitConverter.kilogramsToPounds(kilograms)
                    inputPounds.setText(pounds.toString())
                    isUpdating = false
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
}