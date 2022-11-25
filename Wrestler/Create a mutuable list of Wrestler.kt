package Wrestler

fun main(args: Array<String>) {
    var name = mutableListOf("Ankita","Gopal","Ankit","Manish", "Vaishal")
    var age = mutableListOf(21,46,22,33,10)
    var height = mutableListOf(5,5,5,5,4)
    var weight = mutableListOf(40,50,50,60,30)

    var result = name.plus(age).plus(height).plus(weight)
    println(result)

    println("count OF Wrestler whose Age is greater than 35")
    println(age.count { it>35 })

    println("display only those wrestler, whose weight is greater than 200")
    println(weight.count { it>200 })
}


