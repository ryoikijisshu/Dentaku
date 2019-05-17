package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text =""
        num0.setOnClickListener {
            text = text + "0"
            textView.text = text
        }
        num1.setOnClickListener {
            text = text + "1"
            textView.text = text
        }
        num2.setOnClickListener {
            text = text + "2"
            textView.text = text
        }
        num3.setOnClickListener {
            text = text + "3"
            textView.text = text
        }
        num4.setOnClickListener {
            text = text + "4"
            textView.text = text
        }
        num5.setOnClickListener {
            text = text + "5"
            textView.text = text
        }
        num6.setOnClickListener {
            text = text + "6"
            textView.text = text
        }
        num7.setOnClickListener {
            text = text + "7"
            textView.text = text
        }
        num8.setOnClickListener {
            text = text + "8"
            textView.text = text
        }
        num9.setOnClickListener {
            text = text + "9"
            textView.text = text
        }
        func_c.setOnClickListener {
            text = ""
            textView.text = text
        }
        func_pls.setOnClickListener {
            text = text + "+"
            textView.text = text
        }
        func_min.setOnClickListener {
            text = text + "-"
            textView.text = text
        }
        func_mul.setOnClickListener {
            text = text + "*"
            textView.text = text
        }
        func_div.setOnClickListener {
            text = text + "/"
            textView.text = text
        }
        func_eq.setOnClickListener {
            text = text + "="
            textView.text = text
        }
    }
}
