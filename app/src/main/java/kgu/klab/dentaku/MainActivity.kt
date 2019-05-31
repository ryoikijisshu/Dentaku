package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = 0.0
        var b = 0.0
        var c = 0
        var result_text: String = "0"

        num0.setOnClickListener {
            if (result_text == "0"){
                result_text = "0"
            }
            else{
                result_text += "0"
            }
            result.text = result_text

        }

        num1.setOnClickListener {
            if (result_text == "0"){
                result_text = "1"
            }
            else{
                result_text += "1"
            }
            result.text = result_text

        }

        num2.setOnClickListener {

            if (result_text == "0"){
                result_text = "2"
            }
            else{
                result_text += "2"
            }
            result.text = result_text

        }

        num3.setOnClickListener {

            if (result_text == "0"){
                result_text = "3"
            }
            else{
                result_text += "3"
            }
            result.text = result_text

        }

        num4.setOnClickListener {

            if (result_text == "0"){
                result_text = "4"
            }
            else{
                result_text += "4"
            }
            result.text = result_text

        }

        num5.setOnClickListener {

            if (result_text == "0"){
                result_text = "5"
            }
            else{
                result_text += "5"
            }
            result.text = result_text

        }

        num6.setOnClickListener {

            if (result_text == "0"){
                result_text = "6"
            }
            else{
                result_text += "6"
            }
            result.text = result_text

        }

        num7.setOnClickListener {

            if (result_text == "0"){
                result_text = "7"
            }
            else{
                result_text += "7"
            }
            result.text = result_text

        }

        num8.setOnClickListener {

            if (result_text == "0"){
                result_text = "8"
            }
            else{
                result_text += "8"
            }
            result.text = result_text

        }

        num9.setOnClickListener {

            if (result_text == "0"){
                result_text = "9"
            }
            else{
                result_text += "9"
            }
            result.text = result_text

        }

        func_c.setOnClickListener {

            result_text = "0"
            result.text = result_text
            a = 0.0
            b = 0.0
            c = 0
        }

        func_eq.setOnClickListener {
            if(c==1){
                b = result_text.toDouble()
                a = a+b
            }
            if(c==2){
                b = result_text.toDouble()
                a = a-b
            }
            if(c==3){
                b = result_text.toDouble()
                a = a*b
            }
            if(c==4){
                b = result_text.toDouble()
                a = a/b
            }
            result.text = a.toString()
            result_text == "0"
        }

        func_pls.setOnClickListener {
            b = result_text.toDouble()
            if(c==0){
                a=b
            }
            if(c==1){
                b = result_text.toDouble()
                a = a+b
            }
            if(c==2){
                b = result_text.toDouble()
                a = a-b
            }
            if(c==3){
                b = result_text.toDouble()
                a = a*b
            }
            if(c==4){
                b = result_text.toDouble()
                a = a/b
            }
            c = 1
            result.text = a.toString()
            result_text ="0"
        }

        func_min.setOnClickListener {
            b = result_text.toDouble()
            if(c==0){
                a=b
            }
            if(c==1){
                b = result_text.toDouble()
                a = a+b
            }
            if(c==2){
                b = result_text.toDouble()
                a = a-b
            }
            if(c==3){
                b = result_text.toDouble()
                a = a*b
            }
            if(c==4){
                b = result_text.toDouble()
                a = a/b
            }
                c = 2
                result.text = a.toString()
                result_text="0"
        }

        func_mul.setOnClickListener {
            b = result_text.toDouble()
            if(c==0){
                a=b
            }
            if(c==1){
                b = result_text.toDouble()
                a = a+b
            }
            if(c==2){
                b = result_text.toDouble()
                a = a-b
            }
            if(c==3){
                b = result_text.toDouble()
                a = a*b
            }
            if(c==4){
                b = result_text.toDouble()
                a = a/b
            }
            c = 3
            result.text = a.toString()
            result_text="0"
        }

        func_div.setOnClickListener {
            b = result_text.toDouble()
            if(c==0){
                a=b
            }
            if(c==1){
                b = result_text.toDouble()
                a = a+b
            }
            if(c==2){
                b = result_text.toDouble()
                a = a-b
            }
            if(c==3){
                b = result_text.toDouble()
                a = a*b
            }
            if(c==4){
                b = result_text.toDouble()
                a = a/b
            }
            c = 4
            result.text = a.toString()
            result_text="0"
        }
    }
}
