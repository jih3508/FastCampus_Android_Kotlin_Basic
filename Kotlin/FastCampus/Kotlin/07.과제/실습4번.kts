//학생이 시험에서 맞은 문제의 개수를 넣어주면 시험 점수점(정수)를 반환하는 함수를 만드시오. (시험 문제는 총 20문제이고 만점은 100점)
/*내가 한것*/
fun student_score(number: Int): Int{
    return number * 5
}

var A: Int = 5
var B: Int =10
println(student_score(A))
println(student_score(B))

/*강사님이 한것*/
fun gradeTest(correctCount: Int): Int{
    return correctCount * 5
}
fun gradeTest2(correctCount: Int): Int = correctCount * 5
println(gradeTest(10))
println(gradeTest(15))