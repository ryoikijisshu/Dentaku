package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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

            result_text = ""
            result.text =result_text

        }

        func_eq.setOnClickListener {

            result_text += "="
            result.text =result_text
        }

        func_pls.setOnClickListener {

            result_text += "+"
            result.text =result_text
        }

        func_min.setOnClickListener {

            result_text += "-"
            result.text =result_text
        }

        func_mul.setOnClickListener {

            result_text += "*"
            result.text =result_text
        }

        func_div.setOnClickListener {

            result_text += "/"
            result.text =result_text
        }
    }
}
