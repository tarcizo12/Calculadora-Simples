package com.example.calculadorasimples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var addition: Button
    private lateinit var multiplication: Button
    private lateinit var division: Button
    private lateinit var subtraction: Button
    private lateinit var viewResult: TextView
    private lateinit var numberOne: EditText
    private lateinit var numberTwo: EditText
    var valueNumberOne = 0
    var valueNumberTwo = 0


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
        val alertException = AlertDialog.Builder(this)
        alertException.setTitle("Erro na operação")
        alertException.setMessage("Digite um número válido")

        try{
        valueNumberOne = Integer.parseInt(numberOne.text.toString())
        valueNumberTwo = Integer.parseInt(numberTwo.text.toString())
        }catch (e: NumberFormatException){

            Log.i("app", "dado invalido")
            alertException.show()
        }

        val totalValue = when(buttonSelection?.id){
            R.id.buttonOfSum -> operationSum()
            R.id.buttonOfSubtraction -> operationSubtraction()
            R.id.buttonOfMultiplication -> operationMultiplication()
            R.id.buttonOfDivision -> operationDivison()
            else -> 0
        }

        Log.i("app", "$totalValue")
        viewResult.text = "$totalValue"


    }

    private fun operationSum() = valueNumberOne + valueNumberTwo

    private fun operationSubtraction() = valueNumberOne - valueNumberTwo

    private fun operationMultiplication() = valueNumberOne * valueNumberTwo

    private fun operationDivison() = valueNumberOne.toDouble()/valueNumberTwo.toDouble()
      
        




}