// 1. 시험 성적 리스트 [70, 71, 72, 77, 78, 79, 80, 82, 90, 99]와 동일한 크기의 배열을 만들고, 함격이면 true, 불합격이면 false를 담는 함수를 만드시오.(80점 이상부터 함격, 정답 예시(False, False))
/*내가 한 것*/
fun passStatus(array: Array<Int>, n : Int): Array<Boolean>{
    val lenth: Int = array.size
    var examPassStatusArray: Array<Boolean> = Array<Boolean>(lenth, {true})

    for (i in 0 until lenth){
        if(array[i] < n){
            examPassStatusArray[i] = false
        }
    }
    return examPassStatusArray
}

for(status in passStatus(arrayOf(70, 71, 72, 77, 78, 79, 80, 82, 90, 99), 80)){
    println(status)
}
println("==========================================================================")

/*강사님이 한 것*/
fun checkPassOne(examScores: List<Int>): BooleanArray{
    val resultArray = BooleanArray(examScores.size, {false})
    examScores.forEachIndexed { index, score ->
        if (score >= 80) resultArray[index] = true
    }
    return resultArray
}

val result = checkPassOne(listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99))
result.forEach {
    println(it)
}