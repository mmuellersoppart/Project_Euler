//Marlon Mueller-Soppart
//20200306
//Method 2 - Simple Logic


var totalSum: CLong = 0
var curNaturalNum: CLong = 1

var multiples: [Int] = [3, 5]
var stopPoint: Int = 999

func isMultiple(target: Int, multiples: [Int]) -> Bool
{
    var isMultiple = false;
    for multiple in multiples {
        isMultiple = isMultiple || target % multiple == 0
    }
    return isMultiple
}

while(curNaturalNum <= stopPoint) {
    if isMultiple(target: curNaturalNum, multiples: multiples) {
       totalSum = totalSum + curNaturalNum
    }
    
    curNaturalNum += 1
}

print(totalSum)




