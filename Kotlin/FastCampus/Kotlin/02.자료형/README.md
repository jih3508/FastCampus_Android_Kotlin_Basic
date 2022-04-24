# 02.자료형

## 자료형 타입
1.정수형
- Byte(-128~127)
- Short(-32768~32767)
- Int
- Long 
- Byte에서 Long으로 갈수록 표현할 수 있는 숫자의 범위가 넓다.
- Byte 자료형 → 1바이트 → 8비트
- 비트: 0과 1 → 두 개를 표현 할 수 있다.
- 양수만 표현 가능한 정수형
  - Ubyte(0 ~ 255)
  - Ushort(0 ~ 65535)
  - UInt
  - ULong
2. 실수형
- Float → 4Byte
- Double → 8Byte
3. 논리형(참, 거짓)
- Boolean
- 참과 것짓 또는 True, False를 표현 할 수 있다.
4. 문자형
- 한 글자 ex) A, 가
5. 문자열 형
- 여러 글자 ex) "안녕하세요". "hello", "A"

## 자료형 추론
- var changeYes: Byte = 100
  - var/val 변수명 : 자료형 = rkqt
- var changeYes = 100
  - 정수의 경우 코틀린은 기본적으로 Int로 추론한다.
  - 실수의 경우 코틀린은 기본적으로 Double로 추론한다.

### 추론힌트를 주는 방법 → 잘 사용하지 않는다.
- var number1 = 100 → Int
- var number2 = 100L → Long
- var number3 = 0x100 → 16진수 표기가 사용된 Int형으로 추론
- var number4 : Long = 100

### 자료형 추론을 사용하지 말고 변수를 선언할 때 자료형을 적어 주는 것이 좋다.

### 팀
- 큰 숫자를 할당 할 때 _ 로 자리수 구분을 할 수 있다.
- ex) var bigNumber : Int = 1_786_324_786_237_612
