package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var input = findViewById<EditText>(R.id.inputNumber)
        var button = findViewById<Button>(R.id.printNumber)
        var output = findViewById<TextView>(R.id.outputNumber)

        button.setOnClickListener(View.OnClickListener {
                var number:Int = input.text.toString().toInt()
                var text:String = ""
                    for(a in 1..number){
                        text = text + a + "@"
                    }
            text = text.dropLast(1)
            output.setText("$text")
        })
    }
}