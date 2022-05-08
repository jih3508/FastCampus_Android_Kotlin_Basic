# 21.형변환

### 형변환(Type Casting)
#### Tyoe
- 자료형, 클래스
#### Casting
- 다르 자료형을 볍ㄴ환
- 형변환이 무조건 가능 한거 아니다
	- 123(정수) → 123(String)
	- 123.5(실수) → 124(정수)
	- 기본자료형간의 형변환은 암기하는 것이 아니라 필요한 순간에 확인하고 진행한다.
- 클래스
```kotlin
val warrior : Warrior = Warrior()
```
	- Class도 자료형이다.
- 상속 클래스간의 자료형
	- 슈퍼클래스(Warrior) 서브클래스(DefenseWarrior) 서브클래스(HardAttackWarrior)
	- DefenseWarrior is Warrior(O)
	- HardAttackWarrior is Warrior(O)
	- Warrior is DefenseWarrior(X)
	- Warrior is HardAttackWarrior
- Warrior A
- DefenseWarrior A + B
- HardAttackWarrior A + C

### 자료형 검사 + 캐스팅
- is, as → 자료형을 검사하고 캐스팅을 한다.
