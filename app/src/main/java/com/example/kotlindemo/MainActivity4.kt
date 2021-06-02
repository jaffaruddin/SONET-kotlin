package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

//        var opr = resources.getStringArray(R.array.operators)

        var input1 = findViewById<EditText>(R.id.pt1_4)
        var input2 = findViewById<EditText>(R.id.pt2_4)
        var button = findViewById<Button>(R.id.btn4)
        var output = findViewById<TextView>(R.id.tv4)
        var spn = findViewById<Spinner>(R.id.spinner4)

        button.setOnClickListener(View.OnClickListener {
            var num1:Float = input1.text.toString().toFloat();
            var num2:Float = input2.text.toString().toFloat();
            var s = spn.selectedItem.toString()

            when(s){
                "+"->output.setText("${add(num1,num2)}")
                "-"->output.setText("${sub(num1,num2)}")
                "x"->output.setText("${mul(num1,num2)}")
                "/"->output.setText("${div(num1,num2)}")
            }

        })
    }
}
fun add(a:Float,b:Float):Float {
    return a + b
}
fun sub(a:Float,b:Float):Float  {
    return a - b
}
fun mul(a:Float,b:Float):Float  {
    return a * b
}
fun div(a:Float,b:Float):Float  {
    return a / b
}