package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = ""
    var firstNumber =0.0
    var nextNumber = 0.0
    var flag = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {

            result_text += "0"
            result.text = result_text
        }

        num1.setOnClickListener {

            result_text += "1"
            result.text = result_text

        }

        num2.setOnClickListener {

            result_text += "2"
            result.text = result_text

        }

        num3.setOnClickListener {

            result_text += "3"
            result.text = result_text

        }

        num4.setOnClickListener {

            result_text += "4"
            result.text = result_text

        }

        num5.setOnClickListener {

            result_text += "5"
            result.text = result_text

        }

        num6.setOnClickListener {

            result_text += "6"
            result.text = result_text

        }

        num7.setOnClickListener {

            result_text += "7"
            result.text = result_text

        }

        num8.setOnClickListener {

            result_text += "8"
            result.text = result_text

        }

        num9.setOnClickListener {

            result_text += "9"
            result.text = result_text

        }

        func_c.setOnClickListener {

            result_text = ""
            result.text = result_text
            firstNumber=0.0
            nextNumber=0.0

        }



        func_pls.setOnClickListener {

            flag = "+"
            enter(result_text)
            result.text ="+"
            result_text = ""

        }

        func_min.setOnClickListener {
            flag = "-"
            enter(result_text)
            result.text = "-"
            result_text = ""
        }

        func_mul.setOnClickListener {
            flag = "*"
            enter(result_text)
            result.text = "*"
            result_text = ""
        }

        func_div.setOnClickListener {
            flag = "/"
            enter(result_text)
            result.text = "/"
            result_text = ""
        }
        func_eq.setOnClickListener {

            enter(result_text)
            when (flag) {
                "+" -> {
                    result_text = (firstNumber + nextNumber).toString()
                    firstNumber=result_text.toDouble()
                    nextNumber=0.0

                }
                "-" ->{ result_text = (firstNumber - nextNumber).toString()
                    firstNumber=result_text.toDouble()
                    nextNumber=0.0}
                "*" -> {result_text = (firstNumber * nextNumber).toString()
                    firstNumber=result_text.toDouble()
                    nextNumber=0.0}
                "/" -> {
                    result_text = (firstNumber / nextNumber).toString()
                    firstNumber=result_text.toDouble()
                    nextNumber=0.0
                }
            }
            result.text=result_text;

        }

    }fun enter(text: String){
        if(firstNumber==0.0){
            firstNumber=text.toDouble()
        }else {
            nextNumber=text.toDouble()
        }
    }
}

