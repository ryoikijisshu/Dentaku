package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value : Int = 0 //値を格納
        var clear : Boolean = false //true時に数字ボタンが押された時に計算結果をクリア
        var calc : Boolean = false //true時にのみ計算ボタンが押された時に計算処理を行う
        var operator : String? = null //演算子を格納

        num0.setOnClickListener {

            result_text += "0"
            result.text =
                if(result.text.toString() != "0" && clear == false){
                    result.text.toString() + "0"
                } else {
                clear = false
                "0"
                }
            calc = true
        }

        num1.setOnClickListener {

            result_text += "1"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "1"
            } else {
                clear = false
                "1"
            }

            calc = true
        }

        num2.setOnClickListener {

            result_text += "2"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "2"
            } else {
                clear = false
                "2"
            }
            calc = true

        }

        num3.setOnClickListener {

            result_text += "3"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "3"
            } else {
                clear = false
                "3"
            }
            calc = true

        }

        num4.setOnClickListener {

            result_text += "4"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "4"
            } else {
                clear = false
                "4"
            }
            calc = true

        }

        num5.setOnClickListener {

            result_text += "5"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "5"
            } else {
                clear = false
                "5"
            }
            calc = true

        }

        num6.setOnClickListener {

            result_text += "6"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "6"
            } else {
                clear = false
                "6"
            }
            calc = true

        }

        num7.setOnClickListener {

            result_text += "7"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "7"
            } else {
                clear = false
                "7"
            }
            calc = true

        }

        num8.setOnClickListener {

            result_text += "8"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "8"
            } else {
                clear = false
                "8"
            }
            calc = true

        }

        num9.setOnClickListener {

            result_text += "9"
            result.text =if(result.text.toString() != "0" && clear == false){
                result.text.toString() + "9"
            } else {
                clear = false
                "9"
            }
            calc = true

        }

        fun calculation(op : String?) :Int {
            return if (op == "+") {
                value + result.text.toString().toInt()
            } else if (op == "-") {
                value - result.text.toString().toInt()
            } else if (op == "*") {
                value * result.text.toString().toInt()
            } else if (op == "/") {
                value / result.text.toString().toInt()
            } else {
                result.text.toString().toInt()
            }
        }

        fun calcBottunAction(op : String?) {
            if (calc == true) {
                value = calculation(operator)
                clear = true
                calc = false
                result.text = value.toString()
            }
            operator = op
        }


        func_c.setOnClickListener {
            result.text ="0"
            value = 0
            operator = null
            clear = false
            calc = false

        }

        func_eq.setOnClickListener {

            if (calc == true) {
                value = calculation(operator)
                calc = false
                clear = true
                result.text = value.toString()
                operator = null
            }
        }

        func_pls.setOnClickListener {

            calcBottunAction("+")

        }

        func_min.setOnClickListener {

            calcBottunAction("-")
        }

        func_mul.setOnClickListener {

            calcBottunAction("*")
        }

        func_div.setOnClickListener {

            calcBottunAction("/")
        }
    }
}
