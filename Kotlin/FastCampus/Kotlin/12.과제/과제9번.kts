/*
* 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오,
   fun abc(3) -> [3, 6, 9, 12, 15, 18, 21, 24, 27]
*/

/*내가 한 것*/
fun multiplicationTables(n: Int): List<Int>{
    var nTable = mutableListOf<Int>();

    for (i in 1..10){
        nTable.add(nTable.size, n * i)
    }
    return nTable
}
println(multiplicationTables(3))
/*강사님이 한 것*/
fun gugudan(dan: Int){
    val numbers = mutableListOf<Int>()
    for(i in 1..9){
        numbers.add(dan * i)
    }
    println(numbers)
}

gugudan(8)