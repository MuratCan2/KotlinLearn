package com.example.kotlinsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    lateinit var myString : String
    //lateinit ınt ve double da çalışmaz vey bazı durumlarda çalışır
    //null olduğunu belirtmeden değerimizin null olduğunu belirtmemize sağlar
    //programa daha sonra bir değer atayacağımızı söylerek boş bir değeri kullanabiliriz böylelikle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun mySum(view : View){
         number1 = editText.text.toString().toIntOrNull()
         number2 = editText2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){
            resultText.text = "Error!"
        }else{
            val result = number1!! + number2!!
            resultText.text = "Result: $result"
        }
        myString = ""

    }

    fun mySub(view: View){
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            resultText.text = "Error!"
        }else{
            val result = number1!! - number2!!
            resultText.text = "Result : $result"
        }

    }
    fun myMultiply(view: View){
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null){
            resultText.text = "Error!"
        }else{
            val result = number1!! * number2!!
            resultText.text = "Result : $result"
        }

    }

    fun myDiv(view: View){
        number1 = editText.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){
            resultText.text = "Error"
        }else{
            val result = number1!! / number2!!
            resultText.text = "Result : $result"
        }

    }

}
