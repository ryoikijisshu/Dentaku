package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text = "" //テキスト表示用
    var number1 = "" //△+◇の△部分
    var number2 = "" //△+◇の◇部分
    var func = 0
    var func_tmp = 0
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {

            result_text += "0"
            result.text = result_text

            if(count == 0){

                number1 += "0"

            }
            else{

                number2 += "0"

            }

        }

        num1.setOnClickListener {

            result_text += "1"
            result.text = result_text

            if(count == 0){

                number1 += "1"

            }
            else{

                number2 += "1"

            }

        }

        num2.setOnClickListener {

            result_text += "2"
            result.text = result_text

            if(count == 0){

                number1 += "2"

            }
            else{

                number2 += "2"

            }

        }

        num3.setOnClickListener {

            result_text += "3"
            result.text = result_text

            if(count == 0){

                number1 += "3"

            }
            else{

                number2 += "3"

            }

        }

        num4.setOnClickListener {

            result_text += "4"
            result.text = result_text

            if(count == 0){

                number1 += "4"

            }
            else{

                number2 += "4"

            }

        }

        num5.setOnClickListener {

            result_text += "5"
            result.text = result_text


            if(count == 0){

                number1 += "5"

            }
            else{

                number2 += "5"

            }

        }

        num6.setOnClickListener {

            result_text += "6"
            result.text = result_text

            if(count == 0){

                number1 += "6"

            }
            else{

                number2 += "6"

            }

        }

        num7.setOnClickListener {

            result_text += "7"
            result.text = result_text

            if(count == 0){

                number1 += "7"

            }
            else{

                number2 += "7"

            }

        }

        num8.setOnClickListener {

            result_text += "8"
            result.text = result_text

            if(count == 0){

                number1 += "8"

            }
            else{

                number2 += "8"

            }

        }

        num9.setOnClickListener {

            result_text += "9"
            result.text = result_text

            if(count == 0){

                number1 += "9"

            }
            else{

                number2 += "9"

            }

        }

        func_c.setOnClickListener {

            result_text = ""
            result.text =result_text
            number1=""
            number2 =""
            count = 0
            func = 0
            func_tmp = 0

        }

        func_eq.setOnClickListener {

            func_tmp = func

            calculate()

            result.text = number1

            number1 = ""
            number2 = ""
            func = 0
            result_text =""
            count = 0
            func_tmp = 0

        }


        func_pls.setOnClickListener {

            result_text += "+"
            result.text =result_text

            if(func != 0){

                func_tmp = func

            }

            func = 1

            count++

            calculate()

            if(count >= 2){

                number2 =""

            }

        }

        func_min.setOnClickListener {

            result_text += "-"
            result.text =result_text


            if(func != 0){

                func_tmp = func

            }

            func = 2

            count++

            calculate()

            if(count >= 2){

                number2 =""

            }

        }

        func_mul.setOnClickListener {

            result_text += "*"
            result.text =result_text

            if(func != 0){

                func_tmp = func

            }

            func = 3

            count++

            calculate()

            if(count >= 2){

                number2 =""

            }

        }

        func_div.setOnClickListener {

            result_text += "/"
            result.text =result_text

            if(func != 0){

                func_tmp = func

            }

            func = 4

            count++

            calculate()

            if(count >= 2){

                number2 =""

            }

        }

    }


    fun calculate() {

        if (number2 != "") {

            if (func_tmp == 1) {

                number1 = (number1.toInt() + number2.toInt()).toString()
            }
            else if (func_tmp == 2) {

                number1 = (number1.toInt() - number2.toInt()).toString()

            }
            else if (func_tmp == 3) {

                number1 = (number1.toInt() * number2.toInt()).toString()

            }
            else if (func_tmp == 4) {

                number1 = (number1.toInt() / number2.toInt()).toString()
            }
            else { }

        }

    }
}
