package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = ""

    //数値入力
    var num = IntArray(100)
    var count = 0

    //四則演算の判別
    var point = IntArray(100)

    //結果表示
    var res = 0

    //結果表示後の数値入力時
    var key = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num0.setOnClickListener {
            if(key > 0) del()
            result_text += "0"
            result.text = result_text
        }

        num1.setOnClickListener {
            if(key > 0) del()
            result_text += "1"
            result.text = result_text
        }

        num2.setOnClickListener {
            if(key > 0) del()
            result_text += "2"
            result.text =result_text
        }

        num3.setOnClickListener {
            if(key > 0) del()
            result_text += "3"
            result.text =result_text
        }

        num4.setOnClickListener {
            if(key > 0) del()
            result_text += "4"
            result.text =result_text
        }

        num5.setOnClickListener {
            if(key > 0) del()
            result_text += "5"
            result.text =result_text
        }

        num6.setOnClickListener {
            if(key > 0) del()
            result_text += "6"
            result.text =result_text
        }

        num7.setOnClickListener {
            if(key > 0) del()
            result_text += "7"
            result.text =result_text
        }

        num8.setOnClickListener {
            if(key > 0) del()
            result_text += "8"
            result.text =result_text
        }

        num9.setOnClickListener {
            if(key > 0) del()
            result_text += "9"
            result.text =result_text
        }

        func_c.setOnClickListener {
            del()
            result.text =result_text
        }

        func_eq.setOnClickListener {
            if(result_text == "") result_text ="0"

            num[count] = result_text.toInt()
            res = num[0]
            for (i in 0 until count) {
                if (point[i] == 1) {
                    res = res + num[i + 1]
                } else if (point[i] == 2) {
                    res = res - num[i + 1]
                } else if (point[i] == 3) {
                    res = res * num[i + 1]
                } else if (point[i] == 4) {
                    try {
                        res = res / num[i+1]
                    }catch (e:ArithmeticException){
                        res = 0
                    }
                } else {
                    break
                }
            }
            result.text = res.toString()
            key++;
        }

        func_pls.setOnClickListener {
            point[count] = 1
            result.text = "+"
            push()
        }

        func_min.setOnClickListener {
            point[count] = 2
            result.text = "-"
            push()
        }

        func_mul.setOnClickListener {
            point[count] = 3
            result.text = "*"
            push()
        }

        func_div.setOnClickListener {
            point[count] = 4
            result.text = "/"
            push()
        }
    }

    fun del(){
        for (i in 0..count){
            num[i] = 0
            point[i] = 0
        }
        count = 0
        res = 0
        key = 0
        result_text = ""
    }

    fun push(){
        if(key > 0) key = 0
        if(result_text == "") result_text = "0"
        num[count] = result_text.toInt()
        result_text = ""
        count++;
    }
}
