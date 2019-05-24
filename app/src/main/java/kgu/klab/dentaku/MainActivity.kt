package kgu.klab.dentaku

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

    var n : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        num0.setOnClickListener {
            textd.text = "${textd.text}0"
            n += "0"
        }

        num1.setOnClickListener {
            textd.text = "${textd.text}1"
            n += "1"
        }

        num2.setOnClickListener {
            textd.text = "${textd.text}2"
            n += "2"
        }

        num3.setOnClickListener {
            textd.text = "${textd.text}3"
            n += "3"
        }

        num4.setOnClickListener {
            textd.text = "${textd.text}4"
            n += "4"
        }

        num5.setOnClickListener {
            textd.text = "${textd.text}5"
            n += "5"
        }

        num6.setOnClickListener {
            textd.text = "${textd.text}6"
            n += "6"
        }

        num7.setOnClickListener {
            textd.text = "${textd.text}7"
            n += "7"
        }

        num8.setOnClickListener {
            textd.text = "${textd.text}8"
            n += "8"
        }

        num9.setOnClickListener {
            textd.text = "${textd.text}9"
            n += "9"
        }

        func_div.setOnClickListener {
            textd.text = "${textd.text}/"
            n += "/"
        }

        func_mul.setOnClickListener {
            textd.text = "${textd.text}*"
            n += "*"
        }

        func_min.setOnClickListener {
            textd.text = "${textd.text}-"
            n += "-"
        }

        func_pls.setOnClickListener {
            textd.text = "${textd.text}+"
            n += "+"
        }

        func_eq.setOnClickListener {
            textd.text = "${textd.text}="
            n += "="
        }

        func_c.setOnClickListener {
            textd.text = ""
            n = ""

        }


    }



}
