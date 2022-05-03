// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오. -> [[3,3],[1,5],....]
/*내가 한 것*/
fun diceSix(): List<Array<Int>>{
    var array = mutableListOf<Array<Int>>()
    for(i in 1..6){
        for (j in 1..6){
            if(i + j == 6){
                array.add(array.size, arrayOf<Int>(i, j))
            }
        }
    }
    return array
}
for (array in diceSix()){
    println(array[0].toString() + " " + array[1].toString())
}

/*강사님이 한 것*/
fun findSumIsSisFromDice(): List<List<Int>>{
    val resultList = mutableListOf<List<Int>>()
    for(i in 1..6){
        for (j in 1..6){
            if(i + j == 6){
                resultList.add(listOf<Int>(i, j))
            }
        }
    }
    return resultList
}
println(findSumIsSisFromDice())