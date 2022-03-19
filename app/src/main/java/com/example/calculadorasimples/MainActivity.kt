package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var addition: Button
    private lateinit var multiplication: Button
    private lateinit var division: Button
    private lateinit var subtraction: Button
    private lateinit var viewResult: TextView
    private lateinit var numberOne: EditText
    private lateinit var numberTwo: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition = findViewById(R.id.buttonOfSum)
        multiplication = findViewById(R.id.buttonOfMultiplication)
        division = findViewById(R.id.buttonOfDivision)
        subtraction = findViewById(R.id.buttonOfSubtraction)

        viewResult = findViewById(R.id.viewResult)
        numberOne = findViewById(R.id.firstNumber)
        numberTwo = findViewById(R.id.secondNumber)


    }
}