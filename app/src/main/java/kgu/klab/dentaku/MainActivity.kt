package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a: String = ""

        num1.setOnClickListener {
            a=a+1
            textView.text = a
        }

        num2.setOnClickListener {
            a=a+2
            textView.text = a
        }

        num3.setOnClickListener {
            a=a+3
            textView.text = a
        }

        num4.setOnClickListener {
            a=a+4
            textView.text = a
        }

        num5.setOnClickListener {
            a=a+5
            textView.text = a
        }

        num6.setOnClickListener {
            a=a+6
            textView.text = a
        }

        num7.setOnClickListener {
            a=a+7
            textView.text = a
        }

        num8.setOnClickListener {
            a=a+8
            textView.text = a
        }

        num9.setOnClickListener {
            a=a+9
            textView.text = a
        }

        num0.setOnClickListener {
            a=a+0
            textView.text = a
        }

        func_c.setOnClickListener {
            a=""
            textView.text = a
        }

        func_eq.setOnClickListener {
            a=a+"="
            textView.text = a
        }

        func_div.setOnClickListener {
            a=a+"/"
            textView.text = a
        }

        func_mul.setOnClickListener {
            a=a+"*"
            textView.text = a
        }

        func_min.setOnClickListener {
            a=a+"-"
            textView.text = a
        }

        func_pls.setOnClickListener {
            a=a+"+"
            textView.text = a
        }

    }
}
