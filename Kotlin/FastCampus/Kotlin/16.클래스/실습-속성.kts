// getter/setter
class Book() {
    var title: String = "모름"
      get() {
          return field
        }
        set(value) {
            field = value
        }
}
val book = Book()
println(book.title)
book.title = "책이름"
println(book.title)

class MasterBook() {
    lateinit var title: String

    fun nextPAge(){
        if(::title.isInitialized == true) {
            println("페이지가 넘어간다")
        }else{
            println("초기화 필요")
        }
    }
}
val book2 = MasterBook() // MasterBook -> 거푸집 book2 -> 객체, 찍어낸것
book2.title = "책이름"
println(book2.nextPAge())

val book3 = MasterBook()
println(book3.nextPAge())

// Lazy
// - 호출시점에 by lazy 정의에 의해서 초기화 수행한다.
// - val에서만 사용이 가능하다
class Book2(){
    val titla: String by lazy {
        // 본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업을 해야한다
        println("lazy 초기화") //다른
        // 사용이유 -> 엄청 복잡한 작업이 있을 경우
        // titla = "책 제목" -> 불가능
        // return "책 제목" -> 불가능
        "책 제목"
    }
}습