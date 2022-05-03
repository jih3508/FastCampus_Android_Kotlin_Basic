// 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오.
/*내가 한 것*/
fun sumSeven(): Int{
    var hap: Int = 0
    for(i in 1..100){
        if(i % 7 == 0){
            hap += i
        }
    }
    return hap
}
println(sumSeven())

/*강사님이 한 것*/
fun sum7s(): Int{
    var sum: Int = 0
    for(i in 0..100){
        if(i % 7 ==0) sum+= i
    }
    return sum
}
sum7s()