# 20. 상속

## 상속(inheritance) 
### 기본 생성자
- 상속이 필요한 경우
	- 확장된 클래스를 만들고 싶은 경우
		```kotlin
		class Warrior() { → 바탕이 되는 클래스
			fun attack(){}
		}
		```
		 ```kotlin
		class DefenseWarriro(){ → 확장된 클래스
			fun attack(){}
			fun defense
		}
		```
		```kotlin
		 class HardArrackWarrior(){ → 확장된 클래스
			fun attack(){}
			fun hardAttack(){}
		}
	- 이미 존재하는 클래스를 합칠 때	
- 상속은 콩통점 찾기가 아니다!!!
- 키워드
	- open 이라는 키워드로 설정된 클래스만 상속 할 수 있다.
	- open 키워드는 class 앞에 적어준다.
	- final로 설정된 클래스는 상속을 할 수 없다 -> 기본
- 슈퍼클래스/서브클래스, 부모클래스/자식클래스
- 서브클래스는 슈퍼클래스의 생성을 책임져야한다.
- 자식 클래스는 부모 클래스가 가지고 있는 모든 것을 물려 받을수 있다.
- 상속은 여러번 할 수 있다.
- 다중상속은 불가능하다 (A, B를 상속(다중상속)하는 클래스 C는 불가능)
```
	DefenseWarrior
-----------------------
|		_______  |
|  ________    | attack | |
| | defence|     ------   |
|  --------		  |

```

## 오버로딩(Overloading), 오버라이딩(Overriding)
### 오버라이딩(Overriding)
- 슈퍼클래스가 사용하고 있는 맴버와 동일한 이름의 맴버의 변수를 만들 수 없다.
	- 오버라이딩을 통해서 슈퍼클래스가 가지고 있는 함수를 재정의 할 수 있다.
	- 재정의를 할 때는 함수 맨 앞에 override 키워들 적어 준다.
- 재정의
	- 재선언과 동일하다
	- 이전에 정의한 것을 번복하도 새롭게 정의하겠다.
		- 반복 → 이전에 정의한 것은 작동하지 않는다. → 이전 것을 덮어쓴다.
```kotlin
open class Warrior1(var name: String, var power: Int, var type: String){
	fun attack(){
		println(“복잡한 코드 + 공격”)
	}
}

class DefenseWarrior1 constructor(name: String, power: Int) : Warrior1(name, power, “고블린”){
	fun defense(){
		println(“방어”)
	}

	fun attack(){
		// 슈퍼클래스와 동일한 이름을 가지고 있는 함수를 만들 수 없다.
	}
	
	override fun attack(){
		// override로 슈퍼 클래스가 가지고 있는 함수를 재정의 할 수 있다.
		println(“간단한 코드 + 공격”)
	}
}
```
### 오버로딩(Overloading)
- 동일한 할수를 복수개 만드는 것을 불가능하다. → 복수개 있는 경우에 어떤 것 사용자가 사용하기를 원했는지 알 수 없기 때문이다.
```kotlin
fun sum(a: Int, b : Int):Int {return a+b}
fun sum(a: Int, b : Int):Int {return a+b}

sum(1, 2)
```
- 어떤 것 사용자가 사용하기를 원했는지 알 수 있다면 동일한 이름의 함수를 복수개 만들 수 있다.
	- 함수가 받는 인자가 다른 경우
	```kotlin
	fun sum(a: Int, b : Int):Int {return a+b}
	fun sum(a: Int):Int {return a+10}
	sum(10, 20)
	sum(10)
	```


	- 함수가 리턴하는 타입이 다른 경우 -> 오버로딩이 불가능하다.
	```kotlin
	fun sum(a: Int, b : Int):Int {return a+b}
	fun sum(a: Int):String {return a+10}
	val a : Int = sum(10, 20)
	val b : String = sum(20, 20)
	```
