package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
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

        addition.setOnClickListener(this)
        multiplication.setOnClickListener(this)
        division.setOnClickListener(this)
        subtraction.setOnClickListener(this)

    }

    override fun onClick(buttonSelection: View?) {
        when(buttonSelection?.id){
            R.id.buttonOfSum -> operationSum()
            R.id.buttonOfSubtraction -> operationSubtraction()
            R.id.buttonOfMultiplication -> operationMultiplication()
            R.id.buttonOfDivision -> operationDivison()
        }
    }

    private fun operationDivison() {
        TODO("Not yet implemented")
    }

    private fun operationMultiplication() {
        TODO("Not yet implemented")
    }

    private fun operationSubtraction() {
        TODO("Not yet implemented")
    }

    private fun operationSum() {
        TODO("Not yet implemented")
    }


}