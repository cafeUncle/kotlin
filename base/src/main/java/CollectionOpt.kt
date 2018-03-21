fun main(args: Array<String>) {
    val list1 = listOf<Int>(1, 2, 3, 4, 5)
    var list2 = listOf(1, 2, 3, null, """
        123

        123
    """)
    var list3 = listOf(1,2,3,4,5,6,7,8,9,0)

    val mutableList = mutableListOf("1", "2", "3", "4", "5", "6", "7", "8", "9")

//    println(list1)
//    println(list2)
//    println(list3)

//    println(list2[4])
//    println(list2.get(4))
//    println(message = list2.get(0))

//    val any = list1.any { l -> l % 2 == 1 }
//    val any1 = list1.any { it % 2 == 1 }

//    println(any) // true
//    println(any1) // true

//    println(list1.all { it%1 == 0 })
//    println(list1.all { it%2 == 1 })

//    println(5/8)
//    println(list1.none{ it / 12 == 1})
//    println(list1.none{ it / 2 == 1})

//    println(list1.count())
//    println(list1.count {it%2 == 0})

//    list1.forEach { println(it > 2) }
//    list1.forEachIndexed { index, i ->  print("$index \$i $i \n") }

//    println(list1.max())
//    println(list1.maxBy { -it * 6 / 2 - 1; 6+it;})
//    println(list1.maxBy { -it * 6 / 2 - 1; 6-it;})

//    println(list1.min())

//    println(list1.fold(1000){c,n -> c + n})
//    println(list1.foldRight(1000){c,n -> c + n})

//    println(list1.reduce{ c, n -> c+n}) // like fold, only not have initialize value
//    println(list1.reduceRight{ c, n -> c+n}) // like fold, only not have initialize value


}