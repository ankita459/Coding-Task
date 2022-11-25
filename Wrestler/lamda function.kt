package Wrestler

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    println("Enter Age  : ")
    val age: Long = sc.nextLong()

    val result = if (age < 18)
    {
        "$age User is Non–adult"
    }
    else
        if(age >=18 && age<=55){
            "$age User is Adult"
        } else
        {
            "$age User is Senior citizen"
        }


    println(result)
}


