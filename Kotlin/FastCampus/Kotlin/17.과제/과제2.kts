import kotlin.contracts.contract

//- 사칙연산을 할 수 있는 1개의 함수 구현
//        - ex) calculater.calculater('+', 10)
//- ex) calculater.calculater('-', 50)
//- 초기값읋 할당 할 수 있어야 하며 초기 값을 할당 하지 않은 경우에는 0을 기본값으로 사용한다
//        - 불가능한 연산을 요청한 경우 "잘못된 연산 입니다."를 출력 한다.

/*내가 한것*/
class Calculator constructor(number: Int) {
    var result: Int

    init {
        this.result = number
    }

    fun calculator(op: Char, number: Int): Int?{
        when(op){
            '+' -> result += number
            '-' -> result -= number
            '*' -> result *= number
            '/' -> {
                if(number == 0) {
                    println("잘못된 연산 입니다.")
                    return null
                }
                result /= number
            }
            else -> {
                println("잘못된 연산 입니다.")
                return null
            }
        }

        return result
    }
}


var cal = Calculator(10)

println(cal.calculator('+', 20))
println(cal.calculator('-', 10))
println(cal.calculator('*', 2))
println(cal.calculator('/', 0))
println(cal.calculator('/', 20))
println("=================================")

/*강사님 한것*/

class Calculater2 constructor(val initialValue: Int = 0){
    var result: Int

    init {
        this.result = initialValue
    }

    fun calculater(function: Char, inputNumber: Int){
        when(function){
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *- inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못되ㅐㄴ 연산 입니다.")
        }
    }
}

val calculater2 = Calculater2(10)
calculater2.calculater('+', 10)
calculater2.calculater('/', 20)
calculater2.calculater('-', 100)
println(calculater2.result)