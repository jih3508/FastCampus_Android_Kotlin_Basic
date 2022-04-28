// nullable 정수형 두 개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다 이때인수중에 null이 있으면 0으로 취급하여 합을 구한다.

/*내가 한것*/
fun plusNumber(first: Int?, second: Int?): Int{
    var A = if(first == null) 0 else first
    var B = if(second == null) 0 else second
    return A + B
}

println(plusNumber(null, null))

/*강사님이 한것*/

fun plustTwoNumber(firstNum: Int?, secondNum: Int?): Int{
    // 함수에서 받은 인자 firstNum, secondNum -> val 이다
//    if(firstNum == null){
//        firstNum = 0
//    }
//    if (secondNum == null){
//        secondNum = 0
//    }
    val first: Int = if(firstNum == null) 0 else firstNum
    var second: Int = if(secondNum == null) 0 else secondNum

//    val firstNum:Int = if(firstNum == null) 0 else firstNum
//    var secondNum: Int = if(secondNum == null) 0 else secondNum
    // 함수안에서 똑같은 이름을 갖고 있는 다른 두 변수가 있으면 안된다.

    return first + second
}

println(plustTwoNumber(null, null))