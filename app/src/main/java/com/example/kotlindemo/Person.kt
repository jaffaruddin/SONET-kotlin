package com.example.kotlindemo

class Person {
    var name: String? = null
    get() =  field
    set(value) {
        field = value?.toUpperCase()
    }

    var gender: String? = null

    var age: Int = 0
    set(value) = if(value < 18) field=0 else field = value

}