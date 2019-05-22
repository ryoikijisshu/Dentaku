package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //var x_bar = IntArray(100)
    var x = 0
    var str : String = ""
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {
            x = 0
            str += x.toString()
            result.text = str
        }

        num1.setOnClickListener {
            x = 1
            str += x.toString()
            result.text = str
        }

        num2.setOnClickListener {
            x= 2
            str += x.toString()
            result.text = str
        }

        num3.setOnClickListener {
            x = 3
            str += x.toString()
            result.text = str
        }

        num4.setOnClickListener {
            x = 4
            str += x.toString()
            result.text = str
        }

        num5.setOnClickListener {
            x = 5
            str += x.toString()
            result.text = str
        }

        num6.setOnClickListener {
            x = 6
            str += x.toString()
            result.text = str
        }

        num7.setOnClickListener {
            x = 7
            str += x.toString()
            result.text = str
        }

        num8.setOnClickListener {
            x = 8
            str += x.toString()
            result.text = str
        }

        num9.setOnClickListener {
            x = 9
            str += x.toString()
            result.text = str
        }

        func_eq.setOnClickListener {
            str += "="
            result.text = str
        }

        func_pls.setOnClickListener {
            str += "+"
            result.text = str
        }

        func_min.setOnClickListener {
            str += "-"
            result.text = str
        }

        func_mul.setOnClickListener {
            str += "*"
            result.text = str
        }

        func_div.setOnClickListener {
            str += "/"
            result.text = str
        }

        func_c.setOnClickListener {
            str = ""
            result.text = str
        }
    }
}
