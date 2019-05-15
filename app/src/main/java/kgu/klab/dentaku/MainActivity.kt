package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var x_bar = IntArray(100)
    var count = 0

    //結果表示後に入力したら
    var a = 0

    //計算判定
    var point = IntArray(100)

    //計算結果
    var kekka = 0
    //var a_kekka : Double = 0.0


    //表示させる文字列
    var str: String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 1
            str = x_bar[count].toString()
            textView.text = str
        }

        two.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 2
            str = x_bar[count].toString()
            textView.text = str
        }

        three.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 3
            str = x_bar[count].toString()
            textView.text = str
        }

        four.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 4
            str = x_bar[count].toString()
            textView.text = str
        }

        five.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 5
            str = x_bar[count].toString()
            textView.text = str
        }

        six.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 6
            str = x_bar[count].toString()
            textView.text = str
        }

        seven.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 7
            str = x_bar[count].toString()
            textView.text = str
        }

        eight.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 8
            str = x_bar[count].toString()
            textView.text = str
        }

        nine.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 9
            str = x_bar[count].toString()
            textView.text = str
        }

        zero.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                kekka = 0
                count = 0
                a = 0
            }
            x_bar[count] = x_bar[count] * 10
            x_bar[count] = x_bar[count] + 0
            str = x_bar[count].toString()
            textView.text = str
        }

        clear.setOnClickListener {
            for (i in 0..count) {
                x_bar[i] = 0
                point[i] = 0
            }
            kekka = 0
            count = 0
            textView.text = ""
            res.text = ""
        }

        plus.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                count = 0
                a = 0
                x_bar[count] = kekka
            }
            str = x_bar[count].toString()
            textView.text = ""
            res.text = "+"
            point[count] = 1
            count++
        }

        minus.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                count = 0
                a = 0
                x_bar[count] = kekka
            }
            str = x_bar[count].toString()
            textView.text = ""
            res.text = "-"
            point[count] = 2
            count++
        }

        mul.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                count = 0
                a = 0
                x_bar[count] = kekka
            }
            str = x_bar[count].toString()
            textView.text = ""
            res.text = "*"
            point[count] = 3
            count++
        }

        div.setOnClickListener {
            if(a>0){
                for (i in 0..count) {
                    x_bar[i] = 0
                    point[i] = 0
                }
                count = 0
                a = 0
                x_bar[count] = kekka
            }
            str = x_bar[count].toString()
            textView.text = ""
            res.text = "/"
            point[count] = 4
            count++
        }

        equal.setOnClickListener {
            kekka = x_bar[0]
            for (i in 0 until count) {
                if (point[i] == 1) {
                    kekka = kekka + x_bar[i + 1]
                } else if (point[i] == 2) {
                    kekka = kekka - x_bar[i + 1]
                } else if (point[i] == 3) {
                    kekka = kekka * x_bar[i + 1]
                } else if (point[i] == 4) {
                    kekka = kekka / x_bar[i + 1]
                } else {
                    kekka = x_bar[count]
                    break
                }
            }
            str = kekka.toString()
            textView.text = str
            res.text = "="
            a++;
        }
    }
}
