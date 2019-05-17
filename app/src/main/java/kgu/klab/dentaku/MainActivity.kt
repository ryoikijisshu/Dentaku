package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nStr: String = ""
    val nList = ArrayList<Double>()
    val oList = ArrayList<Double>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num0.setOnClickListener {
            formula.text = "${formula.text}0"
            nStr += "0"
        }
        num1.setOnClickListener {
            formula.text = "${formula.text}1"
            nStr += "1"
        }
        num2.setOnClickListener {
            formula.text = "${formula.text}2"
            nStr += "2"
        }
        num3.setOnClickListener {
            formula.text = "${formula.text}3 "
            nStr += "3"
        }
        num4.setOnClickListener {
            formula.text = "${formula.text}4"
            nStr += "4"
        }
        num5.setOnClickListener {
            formula.text = "${formula.text}5"
            nStr += "5"
        }
        num6.setOnClickListener {
            formula.text = "${formula.text}6"
            nStr += "6"
        }
        num7.setOnClickListener {
            formula.text = "${formula.text}7"
            nStr += "7"
        }
        num8.setOnClickListener {
            formula.text = "${formula.text}8"
            nStr += "8"
        }
        num9.setOnClickListener {
            formula.text = "${formula.text}9"
            nStr += "9"
        }
        func_pls.setOnClickListener {
            formula.text = "${formula.text}+"

        }
        func_min.setOnClickListener {
            formula.text = "${formula.text}-"

        }
        func_mul.setOnClickListener {
            formula.text = "${formula.text}*"

        }
        func_div.setOnClickListener {
            formula.text = "${formula.text}/"

        }

        func_c.setOnClickListener {
            formula.text = ""
            nStr = ""
            nList.clear()
            oList.clear()
        }
    }


}