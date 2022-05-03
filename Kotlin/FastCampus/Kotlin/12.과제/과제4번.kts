// 100보다 작은 숫자를 넣어주면, 1씩 증각를 시키고 100이 되면 종료되는 함수를 만드시오.
/*내가 한 것*/
fun print100(n: Int){
    var number: Int = n
    while(number <= 100){
        println(number)
        number++
    }
}
print100(77)
/*강사님이 한 것*/

fun increaseOne(numberUnser100: Int){
    var givenNumber: Int = numberUnser100
    while(givenNumber < 100){
        givenNumber++
        println("up")
    }
    return
}
increaseOne((99))