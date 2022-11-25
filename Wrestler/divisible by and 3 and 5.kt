fun main(args: Array<String>) {
        println("\nDivisible by 3: ")
        for (i in 1..99) {
            if (i % 3 == 0) print("$i, ")
        }
        println("\n\nDivisible by 5: ")
        for (i in 1..99) {
            if (i % 5 == 0) print("$i, ")
        }
        println("\n\nDivisible by 3 & 5: ")
        for (i in 1..99) {
            if (i % 3 == 0 && i % 5 == 0) print("$i, ")
        }
        println("\n")
    }
