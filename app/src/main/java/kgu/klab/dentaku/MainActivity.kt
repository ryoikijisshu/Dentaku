package kgu.klab.dentaku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nStr : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num0.setOnClickListener {
            nStr=nStr+"0";
        }
        num1.setOnClickListener {
            nStr=nStr+"1"; }
        num2.setOnClickListener {
            nStr=nStr+"2";
        }
        num3.setOnClickListener {
            nStr=nStr+"3";  }
        num4.setOnClickListener {
            nStr=nStr+"4";
        }
        num5.setOnClickListener {
            nStr=nStr+"5"; }
        num6.setOnClickListener {
            nStr=nStr+"6";}
        num7.setOnClickListener {
            nStr=nStr+"7"; }
        num8.setOnClickListener {
            nStr=nStr+"8"; }
        num9.setOnClickListener {
            nStr=nStr+"9"; }

    }
}
