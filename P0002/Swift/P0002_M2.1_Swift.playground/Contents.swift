//Marlon Mueller-Soppart
//20200326
//P0002 M2.1

//M2.1 - std. recursion with memoirzation

//storing previous calculations and including base cases
var fibonacci_memoi: [Int] = [1, 2]

func fibonacci(fibSeqPos: Int) -> Int {
    if(fibSeqPos < fibonacci_memoi.count) {
        return fibonacci_memoi[fibSeqPos]
    } else {
        fibonacci_memoi.append((fibonacci(fibSeqPos: fibSeqPos - 1) + fibonacci(fibSeqPos: fibSeqPos - 2)))
        return(fibonacci_memoi[fibSeqPos])
    }
}


fibonacci(fibSeqPos: 31)

func solveP0002(MAX: Int) -> Int {
    //fill memorization table and go as far as we need to go
    var answer = 0;
    var stopValue = 0
    var currFibValue = fibonacci(fibSeqPos: stopValue)
    while(currFibValue < MAX) {
        stopValue += 1
        currFibValue = fibonacci(fibSeqPos: stopValue)
    }
    
    //picking every third number from the first even number at position 1 
    let seqAcceptablePos = stride(from: 1, to: stopValue, by: 3)
    for pos in seqAcceptablePos {
        answer += fibonacci(fibSeqPos: pos)
    }
    return answer
}

print(solveP0002(MAX: 4000000))


//This guy did a great job.
//https://blog.scottlogic.com/2014/06/26/swift-sequences.html
