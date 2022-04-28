//변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는 변수 C를 선언한다. 단 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다.

/* 내가 한것*/
var A: Int = 10
var B: Int = 10
var C: Boolean = A == B
println(C)

/* 강사님이 한것*/
val A1: Short = 10
var B1: Int = 10
val C1: Boolean = if (A1 == B1) true else false
print(C)
// 자료형이 다르면 비교연산자를 사용할 수 없다.