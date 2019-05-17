package kgu.klab.dentaku

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText: String = textView.text.toString()

        val num0:Button = findViewById(R.id.num0)
        val num1:Button = findViewById(R.id.num1)
        val num2:Button = findViewById(R.id.num2)
        val num3:Button = findViewById(R.id.num3)
        val num4:Button = findViewById(R.id.num4)
        val num5:Button = findViewById(R.id.num5)
        val num6:Button = findViewById(R.id.num6)
        val num7:Button = findViewById(R.id.num7)
        val num8:Button = findViewById(R.id.num8)
        val num9:Button = findViewById(R.id.num9)
        val func_plus:Button = findViewById(R.id.func_pls)
        val func_min:Button = findViewById(R.id.func_min)
        val func_mul:Button = findViewById(R.id.func_mul)
        val func_div:Button = findViewById(R.id.func_div)
        val func_eq:Button = findViewById(R.id.func_eq)
        val func_c:Button = findViewById(R.id.func_c)

        num0.setOnClickListener{
            editText += "0"
            textView.text =editText
        }

        num1.setOnClickListener{
            editText += "1"
            textView.text =editText
        }

        num2.setOnClickListener{
            editText += "2"
            textView.text =editText
        }

        num3.setOnClickListener{
            editText += "3"
            textView.text =editText
        }

        num4.setOnClickListener{
            editText += "4"
            textView.text =editText
        }

        num5.setOnClickListener{
            editText += "5"
            textView.text =editText
        }

        num6.setOnClickListener{
            editText += "6"
            textView.text =editText
        }

        num7.setOnClickListener{
            editText += "7"
            textView.text =editText
        }

        num8.setOnClickListener{
            editText += "8"
            textView.text =editText
        }

        num9.setOnClickListener{
            editText += "9"
            textView.text =editText
        }

        func_plus.setOnClickListener{
            editText += "+"
            textView.text =editText
        }

        func_min.setOnClickListener{
            editText += "-"
            textView.text =editText
        }

        func_mul.setOnClickListener{
            editText += "*"
            textView.text =editText
        }

        func_div.setOnClickListener{
            editText += "/"
            textView.text =editText
        }

        func_eq.setOnClickListener{
            editText += "="
            textView.text =editText
        }

        func_c.setOnClickListener{
            textView.text = ""
            editText=""
        }
    }
}
