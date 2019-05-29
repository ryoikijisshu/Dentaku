package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text: String = ""
    var num_text: Double = 0.0
    var num2_text: Double = 0.0
    var Identifier:Int = 0
    var signal:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


                        num0.setOnClickListener {
                            if( result_text == "0")
                            {

                            }
                            else{
                                result_text += "0"
                            }

                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "0"
                            }
                            result.text = result_text
                        }

                        num1.setOnClickListener {

                            result_text += "1"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "1"
                            }
                            result.text = result_text

                        }

                        num2.setOnClickListener {

                            result_text += "2"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "2"
                            }
                            result.text = result_text

                        }

                        num3.setOnClickListener {

                            result_text += "3"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "3"
                            }
                            result.text = result_text

                        }

                        num4.setOnClickListener {

                            result_text += "4"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "4"
                            }
                            result.text = result_text

                        }

                        num5.setOnClickListener {

                            result_text += "5"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "5"
                            }
                            result.text = result_text

                        }

                        num6.setOnClickListener {

                            result_text += "6"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "6"
                            }
                            result.text = result_text

                        }

                        num7.setOnClickListener {

                            result_text += "7"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "7"
                            }
                            result.text = result_text

                        }

                        num8.setOnClickListener {

                            result_text += "8"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "8"
                            }
                            result.text = result_text

                        }

                        num9.setOnClickListener {

                            result_text += "9"
                            if( signal == 1) {
                                result_text = ""
                                signal = 0
                                result_text += "9"
                            }
                            result.text = result_text

                        }

        func_c.setOnClickListener {

            result_text = ""
            result.text =result_text

        }

        func_eq.setOnClickListener {
            num2_text = result_text.toDouble()
            if( Identifier == 1){
                num2_text = num_text + num2_text
            }
            if( Identifier == 2){
                num2_text = num_text - num2_text
            }
            if( Identifier == 3){
                num2_text = num_text * num2_text
            }
            if( Identifier == 4){
                num2_text = num_text / num2_text
            }
            result_text = num2_text.toString()
            result.text = result_text
            signal = 1
        }

        func_pls.setOnClickListener {
            num_text = result_text.toDouble()
            result_text += "+"
            result.text =result_text
            result_text = ""
            Identifier = 1
            signal = 0
        }

        func_min.setOnClickListener {
            num_text = result_text.toDouble()
            result_text += "-"
            result.text =result_text
            result_text = ""
            Identifier = 2
            signal = 0
        }

        func_mul.setOnClickListener {
            num_text = result_text.toDouble()
            result_text += "*"
            result.text =result_text
            result_text = ""
            Identifier = 3
            signal = 0
        }

        func_div.setOnClickListener {
            num_text = result_text.toDouble()
            result_text += "/"
            result.text =result_text
            result_text = ""
            Identifier = 4
            signal = 0
        }

    }
}
