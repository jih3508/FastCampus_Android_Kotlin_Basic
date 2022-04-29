// List
var numbers = listOf<Int>(1, 2, 3)
println(numbers[0])
println(numbers.get(1))
println(numbers.indexOf(2))
println(numbers.first())

println("===numbers2===")
val numbers2 = mutableListOf<Int>(1, 1, 1, 2, 3)
numbers2.add(50)
println(numbers2)
numbers2.removeAt(0)
println(numbers2)
numbers2.addAll(2, listOf<Int>(100, 100))
println(numbers2)
numbers2[0] = 3
println(numbers2)


// Set
println("=====numbers3=====")
val numbers3 = setOf<Int>(1, 1, 1, 3, 3, 4)
println(numbers3.contains(1))
println(numbers3.containsAll(setOf<Int>(1, 3)))
println("=====numbers4======")
val numbers4 = mutableSetOf<Int>(1, 1, 1, 3, 3, 4)
numbers4.remove(10)
println(numbers4)

// Map
println("=======numbers5======")
val numbers5 = mapOf<Int, String>(1 to "one", 2 to "two")
println(numbers5.keys)
println(numbers5.values)
println(numbers5.size)
println(numbers5.get(1))
println(numbers5[2])
println(numbers5.getOrDefault(1, "default"))
println(numbers5.getOrDefault(3, "default"))
println(numbers5.get(3))

val numbers6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))
println(numbers5)
println(numbers6)