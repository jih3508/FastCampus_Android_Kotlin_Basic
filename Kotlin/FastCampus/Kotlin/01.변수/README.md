# 코틀린 문법
## 변수
- 변수: 변경 가능한 변수
- var(variable, 변수)
- val (value, 값)

## 선언하는 방법
- val/var 이름
- val school
- var school
  - 변수 이름 작명 = 네이밍

## 할당하는 방법
- val/var 이름 = 값
  - school = "대한민국 학교"
  - val/var school = "대한민국 학교" → 선언과 할당을 동시에 하는 방법
- 변수선언만은 불가능, 변수선언시 값을 같이 할당 해줘야 함

## 암묵적인 규칙
- val을 선언 할 때는 대문자로 선언
- val SCHOOL = "대한민국 학교"
- var을 선언 할 때는 소문자로 선언
- var phoneNumber = "010-1111-1111“

## 코딩 컨벤션
- https://kotlinlang.org/docs/coding-conventions.html#interface-implementation-layout

## 두 개의 단어를 합쳐서 네이밍을 할 떼
### 카멜켕스 스타일
- 낙타
- 대소문자를 반복
- PhoneNumber

### 스네이크 스타일
- 단어사이에 '_' 추가
-  phone_number
-  val PHONE_NUMBER = “010-1111-1111” // 정적 변수 선언시

## 자동정렬하는 방법
- 단축키 사용
- Ctrl + Alt + L
- 키 설정 변경 방법: Settings → Keymap → Reformat Code 검색
