// 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
/*내가 한 것*/
fun repeatString(text: String, n: Int):Unit{
    for(i in 0 until n)  println(text)
}

repeatString("실행하는 문장", 7)
/*강사님이 한 것*/

fun repeatText(repeatText: String, repeatNumber: Int){
    for(i in 0..repeatNumber - 1) println(repeatText)
    for(i in 1..repeatNumber) println(repeatText)
    for(i in 0 until repeatNumber) println(repeatText)
}

repeatText("안녕", 2)