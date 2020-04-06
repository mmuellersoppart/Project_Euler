//Marlon Mueller-Soppart
//20200406
//Method 1


fun findSmallestDivisor(numDividee: Long): Long {
    /*
    in - number we want to find the biggest prime divisor
    out - the biggest prime divisor
    note - 1 will never be returned
     */
    var testDivisor = 2L;
    while(numDividee % testDivisor != 0L) {
        testDivisor++
    }
    return testDivisor
}

fun main() {
    val numGiven = 600851475143L
    var numGivenMutable = numGiven

    var primeDivisors:MutableList<Long> = mutableListOf();


    var currDivisor: Long
    while(1L != numGivenMutable) {
        currDivisor = findSmallestDivisor(numGivenMutable)
        primeDivisors.add(currDivisor)
        numGivenMutable /= currDivisor
    }

    println(primeDivisors.max())
}