# ListView

### list view
- 기본적인 동작원리는 addView와 동일하다
- 어답터(Adapter)
  - 데이터와 뷰를 짝지어 준다
  - 요청시 해당 번째 데이터를 준다.
  - 데이터 변경되었을 때 갱신을 해준다.
- BaseAdapter
  - ArrayAdpater: 배열 타입
  - CursorAdapter : 데이터 전용
  - SimplaAdapter : 정적 XML

- 단점
  - 비효율적이다 → 데이터의 갯수만큼 inflatre 해야한다
  - inflate는 비용이 비싸다 → 휴대폰의 리소스를

### 실행 결과
![실행 결과](./%EA%B2%B0%EA%B3%BC.PNG)