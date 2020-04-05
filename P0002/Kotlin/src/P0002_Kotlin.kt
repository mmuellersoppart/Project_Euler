//Marlon Mueller-Soppart
//20200405
//notes: not too proud of this one. In fact, I am ashamed. I casually looked up fib tail recursion before attempting
//it myself.
//thanks https://www.geeksforgeeks.org/tail-recursion-fibonacci/
//I will do better going forward.

fun main() {

    //fibonacci function
    fun fibonacci(seqIndex: Int, a: Int, b: Int): Int {
        if(seqIndex == 0) return a
        if(seqIndex == 1) return b

        return fibonacci((seqIndex - 1), b, a + b)
    }

    //find the highest index
    val max = 4000000
    val lastIndex: Int;
    var currIndex = 0;
    while (fibonacci(currIndex, 1, 2) < max) {
        currIndex++
    }

    //get all the evens and sum
    val listOfIndexs = 1..currIndex step 3
    val listOfFibs = listOfIndexs.map { x -> fibonacci(x, 1, 2) }.filter { x -> (x < max) }
    println("P0002: ${listOfFibs.sum()}")
}