# 16.클래스

### 클래스
- 객체(object)를 만드는 문법적인 요소
- 설명서 (해당 클래스를 통해서 객체를 만드는 방법)
- 객체의 기능에 대한 설명

### 생성자
- 객체를 만드는 방법
- 주 생성자 (Primary Constructor)
    - 클래스 이름 옆에 괄호로 둘러싸인 코드
    - 클래스를 통해서 객체를 만드는데 필요한 재료들 적어 준다.
      - 재료이름(변수명): 재료타입(변수타입)
  - 반드시 한개만 존재할 수 있다.
  - constructor 키워드를 생략할 수 있다
- 부 생성자 (Secondary Constructor)
    - constructor 키워드를 생략할 수 없다.
    - 주생성자에는 객체를 만들기 위한 필수 조건이 있다면, 부생성자에는 객체를 만들기 위한 옵션 조건있다.
    - 부생성자에는 주생성자에서 필요한 조건을 포함하고 있어야 한다. (파라미터를 포함하고 있어야한다.)
    - 부생성자는 주생성자에게 생성을 위임해야한다.
- init 블록(initial, 초기)
	- 초기화 블록
	- 초기화 시에 필요한 작업을 하는 곳

### 속성(Property)
```kotlin
class User8 {
    val age : Int
	get(){
		//본문
	}
	set(value: Int){
		//본문
	}
    val name: String

    constructor(age: Int, name: String){
        this.age = age
        this.name = name
    }
}
```
- 속성: age, name
- val user = User7(20, “홍길동”)
- println(user.age) -> 20출력 -> 코틀린이 getter를 호출 해준다.
- user.age = 30 -> 30으로 할당 -> 코틀린이 setter를 호출 해준다,
- User7.age = 60 -> 불가능하다
1.getter/setter
- getter : 클래스의 속성에 접근 할 때
- setter : 클래스의 속성의 값을 설정 할 때
- 기본적으로 코틀린이 제공을 해주지만, 특별한 기능을 추가하고 싶을 경우에는 개발자가 직접 작성할 수 있다.

2. late init
```kotlin
class User7{
	lateinit var age: Int
	lateinit var name: String
}
```
- var로 선언한 프로퍼티에만 적용가능
- 주 생성자에서는 사용할 수 없다.
- getter/setter 적용이 불가능
- nullable 에는 적용이 불가능
- 기초타입 프로퍼티에는 적용이 불가능
- 기초타입 프로퍼티에는 적용이 불가능
	- 원시자료형(primitive type)
	- String을 제외한 우리가 흔히 알고 있는 자료형
