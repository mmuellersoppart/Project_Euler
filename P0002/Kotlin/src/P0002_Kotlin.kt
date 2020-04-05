//Marlon Mueller-Soppart
//20200405
//notes: not too proud of this one.

fun main() {

    //fibonacci function
    fun fibonacci(seqIndex: Int): Int {
        if(seqIndex == 0) return 1
        if(seqIndex == 1) return 2

        return (fibonacci(seqIndex - 1) + fibonacci(seqIndex - 2))
    }

    //find the highest index
    val max = 4000000
    val lastIndex: Int;
    var currIndex = 0;
    while (fibonacci(currIndex) < max) {
        currIndex++
    }

    //get all the evens and sum
    val listOfIndexs = 1..currIndex step 3
    val listOfFibs = listOfIndexs.map { x -> fibonacci(x) }.filter { x -> (x < max) }
    println("P0002: ${listOfFibs.sum()}")
}