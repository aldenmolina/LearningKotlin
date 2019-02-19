package com.example.myapplication

fun main(args:Array<String>){

    var age = 29
    var candy = "Snickers"
    var weather = "Mostly cloudy"

    println(weather)

//showing and declaring types

    var year : Int = 2019
    var month : String = "February"

    // variable can be declared but needs to
    // be initialized with a value
    var day : Int
    day = 20


    //number type and math
    var wallet = 200
    wallet = wallet - 10

    println(wallet)

    wallet = wallet + 20

    println(wallet)

    wallet -= 10

    println(wallet)

    var pi : Double = 3.14
    var radius : Int = 2
    
    //function to change type
    var c = pi * radius.toDouble()




}