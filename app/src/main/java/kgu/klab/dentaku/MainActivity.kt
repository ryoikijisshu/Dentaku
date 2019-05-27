package kgu.klab.dentaku

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numA: Int=0
    var numB: Int=0
    var mathSymbol: String=""
    var result_text: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {

            result_text += "0"
            result.text =result_text
        }

        num1.setOnClickListener {

            result_text += "1"
            result.text =result_text

        }

        num2.setOnClickListener {

            result_text += "2"
            result.text =result_text

        }

        num3.setOnClickListener {

            result_text += "3"
            result.text =result_text

        }

        num4.setOnClickListener {

            result_text += "4"
            result.text =result_text

        }

        num5.setOnClickListener {

            result_text += "5"
            result.text =result_text

        }

        num6.setOnClickListener {

            result_text += "6"
            result.text =result_text

        }

        num7.setOnClickListener {

            result_text += "7"
            result.text =result_text

        }

        num8.setOnClickListener {

            result_text += "8"
            result.text =result_text

        }

        num9.setOnClickListener {

            result_text += "9"
            result.text =result_text

        }

        func_c.setOnClickListener {

            numA=0
            numB=0
            result_text = ""
            result.text =result_text

        }

        func_eq.setOnClickListener {

            inputNum(result_text)

            when(mathSymbol){
                "+" -> {
                    result_text=(numA+numB).toString()
                    numA=numA+numB
                    numB=0
                    System.out.println()
                }

                "-" -> {
                    result_text=(numA-numB).toString()
                    numA=numA-numB
                    numB=0
                }

                "*" -> {
                    result_text=(numA*numB).toString()
                    numA=numA*numB
                    numB=0
                }

                "/" -> {
                    result_text=(numA/numB).toString()
                    numA=numA/numB
                    numB=0
                }

                else ->{
                    result_text="err"
                }
            }

            result.text =result_text
        }

        func_pls.setOnClickListener {

            inputNum(result_text)
            mathSymbol="+"
            result.text ="+"
            result_text = ""
        }

        func_min.setOnClickListener {

            inputNum(result_text)
            mathSymbol="-"
            result.text ="-"
            result_text = ""
        }

        func_mul.setOnClickListener {

            inputNum(result_text)
            mathSymbol="*"
            result.text ="*"
            result_text = ""
        }

        func_div.setOnClickListener {

            inputNum(result_text)
            mathSymbol="/"
            result.text ="/"
            result_text = ""
        }

    }

    fun inputNum(text: String){
        if(numA==0){
            numA=text.toInt()
        }else {
            numB = text.toInt()
        }
    }
}
