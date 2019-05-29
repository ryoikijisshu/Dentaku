package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = "" //テキスト表示用
    var number1: String = "" //△+◇の△部分
    var number2: String = "" //△+◇の◇部分
    var func = 0 //四則演算判断用


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {

            result_text += "0"
            result.text = result_text

            if(func == 0){//演算記号まだ＆1つ目の数字

                number1 += "0"

            }
            else if(func != 0){//演算記号入力＆2つ目の数字

                number2 += "0"

            }
        }

        num1.setOnClickListener {

            result_text += "1"
            result.text = result_text

            if(func == 0){

                number1 += "1"

            }
            else if(func != 0){

                number2 += "1"

            }

        }

        num2.setOnClickListener {

            result_text += "2"
            result.text = result_text

            if(func == 0){

                number1 += "2"

            }
            else if(func != 0){

                number2 += "2"

            }

        }

        num3.setOnClickListener {

            result_text += "3"
            result.text = result_text

           if(func == 0){

                number1 += "3"

            }
            else if(func != 0){

                number2 += "3"

            }

        }

        num4.setOnClickListener {

            result_text += "4"
            result.text = result_text

            if(func == 0){

                number1 += "4"

            }
            else if(func != 0){

                number2 += "4"

            }

        }

        num5.setOnClickListener {

            result_text += "5"
            result.text = result_text


            if(func == 0){

                number1 += "5"

            }
            else if(func != 0){

                number2 += "5"

            }

        }

        num6.setOnClickListener {

            result_text += "6"
            result.text = result_text

            if(func == 0){

                number1 += "6"

            }
            else if(func != 0){

                number2 += "6"

            }

        }

        num7.setOnClickListener {

            result_text += "7"
            result.text = result_text

            if(func == 0){

                number1 += "7"

            }
            else if(func != 0){

                number2 += "7"

            }

        }

        num8.setOnClickListener {

            result_text += "8"
            result.text = result_text

            if(func == 0){

                number1 += "8"

            }
            else if(func != 0){

                number2 += "8"

            }

        }

        num9.setOnClickListener {

            result_text += "9"
            result.text = result_text

            if(func == 0){

                number1 += "9"

            }
            else if(func != 0){

                number2 += "9"

            }

        }

        func_c.setOnClickListener {

            result_text = ""
            result.text =result_text
            number1=""
            number2 =""
            func = 0

        }

        func_eq.setOnClickListener {

            if(func == 1) {

                result_text = (number1.toInt() + number2.toInt()).toString()
                result.text = result_text
                number1 = result_text

            }
            else if (func == 2) {

                result_text = (number1.toInt() - number2.toInt()).toString()
                result.text = result_text
                number1 = result_text

            }
            else if (func == 3) {

                result_text = (number1.toInt() * number2.toInt()).toString()
                result.text = result_text
                number1 = result_text

            }
            else if (func == 4) {

                result_text = (number1.toInt() / number2.toInt()).toString()
                result.text = result_text
                number1 = result_text

            }

            number2 = ""
            func = 0

        }


        func_pls.setOnClickListener {

            result_text += "+"
            result.text =result_text
            func = 1

        }

        func_min.setOnClickListener {

            result_text += "-"
            result.text =result_text
            func = 2

        }

        func_mul.setOnClickListener {

            result_text += "*"
            result.text =result_text
            func = 3

        }

        func_div.setOnClickListener {

            result_text += "/"
            result.text =result_text
            func = 4

        }
    }
}
