package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = ""
    var numText1: Int = 0
    var numText2: Int = 0
    var funcID: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {

            result_text += "0"
            result.text =result_text
            numText1 = numText1 * 10 + 0
        }

        num1.setOnClickListener {

            result_text += "1"
            result.text =result_text
            numText1 = numText1 * 10 + 1
        }

        num2.setOnClickListener {

            result_text += "2"
            result.text =result_text
            numText1 = numText1 * 10 + 2
        }

        num3.setOnClickListener {

            result_text += "3"
            result.text =result_text
            numText1 = numText1 * 10 + 3
        }

        num4.setOnClickListener {

            result_text += "4"
            result.text =result_text
            numText1 = numText1 * 10 + 4
        }

        num5.setOnClickListener {

            result_text += "5"
            result.text =result_text
            numText1 = numText1 * 10 + 5
        }

        num6.setOnClickListener {

            result_text += "6"
            result.text =result_text
            numText1 = numText1 * 10 + 6
        }

        num7.setOnClickListener {

            result_text += "7"
            result.text =result_text
            numText1 = numText1 * 10 + 7
        }

        num8.setOnClickListener {

            result_text += "8"
            result.text =result_text
            numText1 = numText1 * 10 + 8
        }

        num9.setOnClickListener {

            result_text += "9"
            result.text =result_text
            numText1 = numText1 * 10 + 9
        }

        func_c.setOnClickListener {

            result_text = ""
            result.text =result_text
            funcID = 0
            numText1 = 0
            numText2 = 0
        }

        func_eq.setOnClickListener {

//            result_text += "="
//            result.text =result_text
            numText2 = calc(numText1,numText2,funcID)
            funcID = 0
            result_text = numText2.toString()
            result.text =result_text
            numText1 = 0
            result_text = ""
        }

        func_pls.setOnClickListener {

            if(funcID != 0){
                numText2 = calc(numText1, numText2, funcID)
                result_text = numText2.toString()
                result_text += "+"
                result.text =result_text
                funcID = 1
                numText1 = 0
            }
            else{
                result_text += "+"
                result.text =result_text
                funcID = 1
                numText2 = numText1
                numText1 = 0
            }
        }

        func_min.setOnClickListener {

            if(funcID != 0){
                numText2 = calc(numText1, numText2, funcID)
                result_text = numText2.toString()
                result_text += "-"
                result.text =result_text
                funcID = 2
                numText1 = 0
            }
            else{
                result_text += "-"
                result.text =result_text
                funcID = 2
                numText2 = numText1
                numText1 = 0
            }
        }

        func_mul.setOnClickListener {

            if(funcID != 0){
                numText2 = calc(numText1, numText2, funcID)
                result_text = numText2.toString()
                result_text += "*"
                result.text =result_text
                funcID = 3
                numText1 = 0
            }
            else{
                result_text += "*"
                result.text =result_text
                funcID = 3
                numText2 = numText1
                numText1 = 0
            }
        }

        func_div.setOnClickListener {

            if(funcID != 0){
                numText2 = calc(numText1, numText2, funcID)
                result_text = numText2.toString()
                result_text += "/"
                result.text =result_text
                funcID = 4
                numText1 = 0
            }
            else{
                result_text += "/"
                result.text =result_text
                funcID = 4
                numText2 = numText1
                numText1 = 0
            }
        }
    }

    fun calc(numText1: Int, numText2: Int, funcID: Int): Int {
        var CalcResult: Int = 0
        if(funcID == 1) CalcResult = numText2 + numText1
        else if(funcID == 2) CalcResult = numText2 - numText1
        else if(funcID == 3) CalcResult = numText2 * numText1
        else if(funcID == 4) CalcResult = numText2 / numText1
        return CalcResult
    }
}
