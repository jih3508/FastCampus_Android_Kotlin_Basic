/*
병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두 개의 병사 그룹을 합쳐주는 함수를 만드시오
fun abc([“A”, “B”, “C”, “D”, “E”], [“A”, “B”. “C”], 2) -> [[“A”, “B”, “D”, “E”], [“A”, “B”]]
(함수 실행이 어려운 조건을 만나면 null을 리턴해야한다.)
fun abc([“A”, “B”, “C”, “D”, “E”], [“A”, “B”, “C”], 100) -> null
*/
/*내가 한 것*/
fun group(array1: Array<String>, array2: Array<String>, n: Int): List<List<String>>? {
    var groupArray = mutableListOf<List<String>>()
    if (array1.size < n || array2.size < n) return null
    var list = mutableListOf<String>()
    for (i in 0 until array1.size){
        if(i != n){
            list.add(list.size, array1[i])
        }
    }
    groupArray.add(0, list)
    list = mutableListOf<String>()
    for (i in 0 until array2.size){
        if(i != n){
            list.add(list.size, array1[i])
        }
    }
    groupArray.add(1, list)
    return groupArray
}
var array1 = arrayOf<String>("A", "B", "C", "D", "E")
var array2 = arrayOf<String>("A", "B", "C")

println(group(array1, array2, 100))

/*강사님이 한 것*/
fun killNthArmy(
    firstArmy: List<String>,
    secondArmy: List<String>,
    killNth: Int
): List<List<String>>?{
    if(firstArmy.size < killNth || secondArmy.size < killNth) return null
    val firstTemp = mutableListOf<String>()
    val seconTemp = mutableListOf<String>()
    for ((index, army) in firstArmy.withIndex()){
        if (index != killNth) firstTemp.add(army)
    }
    for ((index, army) in secondArmy.withIndex()){
        if (index != killNth) seconTemp.add(army)
    }
    val result = listOf<List<String>>(firstTemp, seconTemp)
    return result
}

println(
    killNthArmy(
        firstArmy = listOf<String>("A", "B", "C", "D", "E"),
        secondArmy = listOf<String>("A", "B", "C"),
        2)

)