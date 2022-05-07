//- 사칙연산에 대응하는 4개의 함수 구현
//- 연산이 한번 이루어 질 때 마다 출력을 해야 한다 (사칙 연산에 대응하는 4개의 함수에서 출력을 하면 안된다.)

/*내가 한것*/
class Calculator{
    var result: Int = 0

    fun sum(num1: Int, num2: Int): Int{
        result = num1 + num2
        return result
    }

    fun sub(num1: Int, num2: Int): Int{
        result = num1 - num2
        return result
    }

    fun mul(num1: Int, num2: Int): Int{
        result = num1 * num2
        return result
    }

    fun div(num1: Int, num2: Int): Int?{
        if (num2 == 0) return null
        result = num1 / num2
        return result
    }
}

var cal = Calculator()
println(cal.sum(10, 20))
println(cal.sub(20, 10))
println(cal.mul(20, 30))
println(cal.div(20, 0))
println(cal.div(10, 5))
println("=========================")
/*강사님 한것*/

class Calculator1{
    var result: Int = 0
        set(value) {
            field = value
            println("중간 계산 값 : $result")
        }

    fun sum(inputNumber: Int){
        result += inputNumber
    }

    fun minus(inputNumber: Int){
        result -= inputNumber
    }

    fun multiply(inputNumber: Int){
        result *= inputNumber
    }

    fun devide(inputNumber: Int){
        result /= inputNumber
    }
}

val calcuator1 = Calculator1()
calcuator1.sum(10)
calcuator1.devide(2)
println(calcuator1.result)