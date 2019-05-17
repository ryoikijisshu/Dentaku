package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var nStr : String = ""
    val nList = ArrayList<Double>() // 数式に含まれる数を保持する配列

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener{
            fomula.text = "${fomula.text}0"
            nStr += "0"
        }

        num1.setOnClickListener{
            fomula.text = "${fomula.text}1"
            nStr += "1"
        }

        num2.setOnClickListener{
            fomula.text = "${fomula.text}2"
            nStr += "2"
        }

        num3.setOnClickListener{
            fomula.text = "${fomula.text}3"
            nStr += "3"
        }

        num4.setOnClickListener{
            fomula.text = "${fomula.text}4"
            nStr += "4"
        }

        num5.setOnClickListener{
            fomula.text = "${fomula.text}5"
            nStr += "5"
        }

        num6.setOnClickListener{
            fomula.text = "${fomula.text}6"
            nStr += "6"
        }

        num7.setOnClickListener{
            fomula.text = "${fomula.text}7"
            nStr += "7"
        }

        num8.setOnClickListener{
            fomula.text = "${fomula.text}8"
            nStr += "8"
        }

        num9.setOnClickListener{
            fomula.text = "${fomula.text}9"
            nStr += "9"
        }

        func_eq.setOnClickListener{
            fomula.text = "${fomula.text}="
            nStr += "="
        }

        func_pls.setOnClickListener{
            fomula.text = "${fomula.text}+"
            nStr += "+"
        }

        func_min.setOnClickListener{
            fomula.text = "${fomula.text}-"
            nStr += "-"
        }

        func_div.setOnClickListener{
            fomula.text = "${fomula.text}/"
            nStr += "/"
        }

        func_mul.setOnClickListener{
            fomula.text = "${fomula.text}*"
            nStr += "*"
        }

        func_c.setOnClickListener{
            fomula.text = ""
            nStr += ""
        }

    }
}
