//배부르기 위해서 남은 먹어야하는 촏 밥먹기 횟수, 현재 밥먹은 횟수, 두 개를 받는 함수를 만드시오.
// 함수는 “밥을 먹었다” 한번 출력을 할 때 마다 밥을 1회 먹은 것으로 간주를 하고, 배가 부를 때까지 밥을 먹어여야 한다.
// 배가 부를 때까지 밥을 먹여야 한다.
// 배가 부를 경우에는 “배가 부르다”를 출력한다 배가 아무리 불러도 최 한번은 무조건 먹는다
// fun eat(3,2):{}
// -> “밥을 먹었다”
// -> “배가 부르다”

/*내가 한 것*/

fun eating(after: Int, now: Int): Unit{
    var n: Int = now
    do {
        println("밥을 먹었다.")
        n++
    }while(n < after)
    println("배가 부르다")
}
eating(8, 2)

println("=============================")
/*강사님이 한 것*/

fun eatUntilNotHungry(totalCount: Int, currentCount: Int){
    var currentCoutCopy = currentCount
    do{
        println("밥일 먹었다.")
        currentCoutCopy++
    }while(currentCoutCopy < totalCount)
    println("배가 부르다")
}
eatUntilNotHungry(10, 5)