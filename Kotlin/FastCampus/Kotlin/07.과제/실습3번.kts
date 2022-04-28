// 학생의 시험 정수를 넣어주면 학점을 반환하는 함수를 만드시오. (90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F학점)
/*내가 한것*/
fun student_grade(number: Int): String{
    when(number){
        in 90..100 -> return "A 학점"
        in 80..89 -> return "B 학점"
        in 70..79 -> return "C 학점"
        else -> return "F 학점"
    }

}

var A : Int = 98
var B : Int = 85
var C : Int = 79
var D : Int = 55
println(student_grade(A))
println(student_grade(B))
println(student_grade(C))
println(student_grade(D))

/*강사님이 한것*/
fun checkGrade(score: Int): String{
    // if (score >= 90) return "A 학점"
    // else if (score >= 80) return "B 학점"
    // else if (score >= 70) return "C 학점"
    // else return "F학점"

    when(score){
        in 90..100 -> return "A 학점"
        in 80..89 -> return "B 학점"
        in 70..79 -> return "C 학점"
        else -> return "F 학점"
    }
}

val result: String = checkGrade(90)
println(result)