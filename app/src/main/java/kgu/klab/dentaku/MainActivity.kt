package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value : String = ""

        num0.setOnClickListener {
           value=value+0
            textView.text = value
        }
        num1.setOnClickListener {
            value=value+1
            textView.text = value
        }
        num2.setOnClickListener {
            value=value+2
            textView.text = value
        }
        num3.setOnClickListener {
            value=value+3
            textView.text = value
        }
        num4.setOnClickListener {
            value=value+4
            textView.text = value
        }
        num5.setOnClickListener {
            value=value+5
            textView.text = value
        }
        num6.setOnClickListener {
            value=value+6
            textView.text = value
        }
        num7.setOnClickListener {
            value=value+7
            textView.text = value
        }
        num8.setOnClickListener {
            value=value+8
            textView.text = value
        }
        num9.setOnClickListener {
            value=value+9
            textView.text = value
        }
        func_c.setOnClickListener {
            value=""
            textView.text = value
        }
        func_eq.setOnClickListener {
            value=value+"="
            textView.text = value
        }
        func_pls.setOnClickListener {
            value=value+"+"
            textView.text = value
        }
        func_min.setOnClickListener {
            value=value+"-"
            textView.text = value
        }
        func_mul.setOnClickListener {
            value=value+"*"
            textView.text = value
        }
        func_div.setOnClickListener {
            value=value+"/"
            textView.text = value
        }

    }
}
