package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = ""
    var value1 : Double = 0.0
    var value2 : Double = 0.0
    var value3 : Int = 0
    var value4 : Int = 0
    var value5 : Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "0"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "0"
                result.text =result_text
            }
            value5 = 1

        }

        num1.setOnClickListener {
            if(value4 == 0)
            {
                result_text += "1"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "1"
                result.text =result_text
            }
            value5 = 1



        }

        num2.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "2"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "2"
                result.text =result_text
            }
            value5 = 1

        }

        num3.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "3"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "3"
                result.text =result_text
            }
            value5 = 1
        }

        num4.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "4"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "4"
                result.text =result_text
            }
            value5 = 1
        }

        num5.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "5"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "5"
                result.text =result_text
            }
            value5 = 1
        }

        num6.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "6"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "6"
                result.text =result_text
            }
            value5 = 1

        }

        num7.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "7"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "7"
                result.text =result_text
            }
            value5 = 1
        }

        num8.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "8"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "8"
                result.text =result_text
            }
            value5 = 1

        }

        num9.setOnClickListener {

            if(value4 == 0)
            {
                result_text += "9"
                result.text =result_text
            }
            else
            {
                value4 = 0
                result_text = ""
                result_text += "9"
                result.text =result_text
            }
            value5 = 1
        }

        func_c.setOnClickListener {

            result_text = ""
            result.text =result_text
            value5 = 0

        }

        func_eq.setOnClickListener {
            if(value5 == 0) {
            }
            else {


                value2 = result_text.toDouble()
                if (value3 == 1) {
                    value2 = value1 + value2
                }
                if (value3 == 2) {
                    value2 = value1 - value2
                }
                if (value3 == 3) {
                    value2 = value1 * value2
                }
                if (value3 == 4) {
                    value2 = value1 / value2
                }

                value4 = 1

                result_text = value2.toString()
                result.text = result_text
            }


        }

        func_pls.setOnClickListener {
            if(value5 == 0) {
            }
            else {
                value1 = result_text.toDouble()
                result_text += "+"
                result.text = result_text
                result_text = ""
                value3 = 1
                value5 = 0
            }

        }

        func_min.setOnClickListener {

            if(value5 == 0) {
            }
            else {
                value1 = result_text.toDouble()
                result_text += "-"
                result.text = result_text
                result_text = ""
                value3 = 2
                value5 = 0
            }
        }

        func_mul.setOnClickListener {

            if(value5 == 0) {
            }
            else {
                value1 = result_text.toDouble()
                result_text += "*"
                result.text = result_text
                result_text = ""
                value3 = 3
                value5 = 0
            }
        }

        func_div.setOnClickListener {

            if(value5 == 0) {
            }
            else {
                value1 = result_text.toDouble()
                result_text += "/"
                result.text = result_text
                result_text = ""
                value3 = 4
                value5 = 0
            }
        }
    }
}
