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

    //boolean type and if statements
    var isTheLightOn : Boolean = false

    if (isTheLightOn) {
        println("Walk across the room")
    } else {
        println("Do not move")
    }

    var canRide : Boolean = age > 11

    println(canRide)

    // lists and arrays
    var topCandy : List<String> = listOf("Fun Dip", "Snickers", "Skittles")

    println(topCandy[1])

    //lists are immutables unless declared so
    var coolNumbers : MutableList<Int> = mutableListOf(1,2,3)
    coolNumbers[1] = 32
    println(coolNumbers[1])

    //array is mutable
    var topDrinks : Array<String> = arrayOf("Vodka", "Whiskey", "Tequila")
    topDrinks[1] = "Gin"
    println(topDrinks[1])

    //way to add value to the mutable list
    //regular list and arrays have a defined length and cannot add more values
    coolNumbers.add(0, 32)

    // for loops
    for (number in coolNumbers) {
        println(number)
    }

    //loop through the numbers between 1 and 1000 and print any number higher than 453

    for (number in 1..1000) {
        //if statement
        if (number > 453){
            println(number)
        }
    }

    //create and call your own function with fun
    fun printHello() {
        println("Hello")
    }
    printHello()

    fun addTwoNumbers(number1 : Int, number2 : Int) {
        println(number1 + number2)
    }

    addTwoNumbers(5, 3)

}
