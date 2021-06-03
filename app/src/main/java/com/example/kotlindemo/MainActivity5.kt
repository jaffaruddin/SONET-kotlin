package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import kotlin.random.Random
import java.util.*
fun changeWater(temp: Int, dirt: Int, day: String):Boolean = temp>30 || dirt>30 || day == "Sunday";
fun RandomDay(): String{
    var days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    var d:String = days[java.util.Random().nextInt(days.size)]
    return d
}
fun feed(day:String):String{
    var food = ""
    when(day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food = "pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosquitoes"
        "saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var day = findViewById<Spinner>(R.id.daySpinner)
        var temp = findViewById<EditText>(R.id.tempId)
        var dirt = findViewById<EditText>(R.id.dirtId)

    }

}