package com.example.kotlindemo
import java.util.*

fun randomDay():String{
    var day:String = ""
    var arr = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    day = arr[Random().nextInt(arr.size)]
    return day
}

fun main(){
    feedingManualForFish()
}

fun feedingManualForFish(){
    var temp = Random().nextInt(40)
    var dirt = Random().nextInt(42)
    var day:String = randomDay()
    var food = fishFood(day)
    var isChangeWaterNeeded = shouldChangeWater(day,temp,dirt)
    println("Today is $day, you need to feed $food")
    println("Change Water : ${if(isChangeWaterNeeded)"is Needed" else "Not Needed"},temprature is $temp and dirt level of water is $dirt")
}

fun fishFood(day:String):String{
    var food:String = ""
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

fun isHot(temp: Int) = temp > 30

fun isDirt(dirt: Int) = dirt > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater(day: String, temp: Int, dirt: Int): Boolean{
    return when{
        isHot(temp) -> true
        isDirt(dirt) -> true
        isSunday(day) -> true
        else -> false
    }
}