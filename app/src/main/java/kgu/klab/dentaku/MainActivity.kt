package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = ""
    var num1_text: Double = 0.0
    var num2_text: Double = 0.0
    var x: Int = 0
    var result_num:Double = 0.0

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

            result_text = ""
            result.text =result_text

        }

        func_eq.setOnClickListener {

            num2_text = result_text.toDouble()

            if (x==1){
                result_num=num1_text+num2_text
            }

            if (x==2){
                result_num=num1_text-num2_text
            }

            if (x==3){
                result_num=num1_text*num2_text
            }

            if (x==4){
                result_num=num1_text/num2_text
            }

            result_text = result_num.toString()
            result.text = result_text
        }

        func_pls.setOnClickListener {

            num1_text = result_text.toDouble()
            result_text = ""
            result.text ="+"
            x=1
        }

        func_min.setOnClickListener {

            num1_text = result_text.toDouble()
            result_text = ""
            result.text ="-"
            x=2
        }

        func_mul.setOnClickListener {

            num1_text = result_text.toDouble()
            result_text = ""
            result.text ="*"
            x=3
        }

        func_div.setOnClickListener {

            num1_text = result_text.toDouble()
            result_text = ""
            result.text ="/"
            x=4
        }
    }
}
