# RelativeLayout
- 부모 뷰가 될 수 있는 컨테이너 뷰이다.
- 자식뷰의 배치를 설정 할 수 있다
	- 기준점을 정해 놓고 어디로 이동
		- 기준점 : 부모, 자식뷰
	- 기준점을 표시하는 방법
		- id 속성을 사용

### RelativeLayout 속성
|Attribute|Description|
|------|------|
|android:layout_alignParentBottom="true"| 부모의 바텀으로 이동|
|android:layout_alignParentEnd="true"   | 부모의 끝지점으로 이동|
|android:layout_alignParentRight="true" | 부모의 가장 오른쪽으로 이동 |
|android:layout_alignParentLeft="true"  | 부모의 가장 왼쪽으로 이동 |
|android:layout_centerInParent="true"   | 부모의 상하좌우 중간으로 이동 |
|android:id="@+id/ID"                   | 뷰나 컴포넌트 속성 ID 설정 |
|android:layout_toRightOf="@id/ID"      | ID 속성값을 가지는 왼쪽으로 가라 |
|android:layout_toLeftOf="" Of="@id/ID" | ID 속성값을 가지는 오른쪽으로 가라 |
|android:layout_above="@id/ID"          | ID 속성값을 가지는 바로 위로 이동 |
|android:layout_below="@id/ID"          | ID 속성값을 가지는 바로 아래로 이동 |
