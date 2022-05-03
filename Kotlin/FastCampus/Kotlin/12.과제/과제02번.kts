// 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
/*내가 한 것*/
fun sumNumber(number : Int): Int{
    var hap: Int = 0
    for (i in 1..number){
        hap += i
    }
    return hap
}
println(sumNumber(20))

/*강사님이 한 것*/
fun sumUntil(givenNumber: Int): Int{
    var sum: Int = 0
    for(i in 1..givenNumber) sum += i
    return sum
    // 0부터 10까지 값의 합
    // 0부터 10까지 인덱스의 값
}
sumUntil(10)
