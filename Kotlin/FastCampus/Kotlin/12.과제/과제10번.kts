/*
* 10. 숫자 리스트 한 개를 넣어주면 짝수와 홀수로 분리된 Map을 만드는 함수를 만드시오.
   (Map의 키는 짝수의 경우 “짝수”, 홀수의 경우 “홀수” 한다)
*/
/*내가 한 것*/
var numberMap = mutableMapOf<Int, String>()

fun divideNumber(list: List<Int>): Unit{
    for (num in list){
        if(num % 2 == 0) {
            numberMap[num] = "짝수"
        }else{
            numberMap[num] = "홀수"
        }
    }
}

divideNumber(listOf<Int>(3, 6, 9, 12, 15, 18, 21, 24, 27))
println(numberMap)

/*강사님이 한 것*/
fun splitNumber(firstIntList: List<Int>, secondIntList: List<Int>) : Map<String, List<Int>>{
    val result = mutableMapOf<String, List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val evenNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach{ number ->
        if(number % 2 == 0) evenNumber.add(number)
        else oddNumber.add(number)
    }
    result.put("짝수", evenNumber)
    result.put("홀수", oddNumber)
    return result
}

println(
    splitNumber(
        listOf<int>(1,2,3,4,5), listOf<Int>(6, 7, 8, 9, 10)
    )
)