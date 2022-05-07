// 사칙연산을 할 수 있는 1개의 함수 구현
// 한번에 여러개의 연산을 입력 받을 수 있어야 한다.
// ex) 더하기3 더하기5 나누기10 곱하기2
// ex) calculater.calculater(더하기3, 더하기5, 빼기2, 나누기5)

/*내가 한것*/
class Calculator constructor(number: Int) {
    var result: Int

    init {
        this.result = number
    }

    fun calculator(vararg ops: String): Int?{
        ops.forEach { op ->
            val number: Int = op.substring(1).toInt()
            when(op.get(0)) {
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

        }

        return result
    }
}

var cal = Calculator(0)

println(cal.calculator("+1", "+23", "-4", "/5"))

/*강사님 한것*/

class Calculator3{
    var result: Int = 0
    fun calculate(operaters: List<Char>, inputNumbers: List<Int>){
        operaters.forEachIndexed{ index, operator ->
            _calculater(operator, inputNumbers[index])
        }
    }

    fun _calculater(function: Char, inputNumber: Int){
        when(function){
            '+' -> this.result += inputNumber
            '-' -> this.result -= inputNumber
            '*' -> this.result *- inputNumber
            '/' -> this.result /= inputNumber
            else -> println("잘못된 연산 입니다.")
        }
    }
}

val calculator3 = Calculator3()
calculator3.calculate(listOf<Char>('+', '-'), listOf<Int>(10, 20))
println(calculator3.result)