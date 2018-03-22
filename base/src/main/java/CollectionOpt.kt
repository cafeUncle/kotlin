fun main(args: Array<String>) {
    val list1 = listOf<Int>(1, 2, 3, 4, 5)
    var list2 = listOf(1, 2, 3, null, """
        123

        123
    """)
    var list3 = listOf<Int?>(1, 2, 3, 4, 5, null, 7, 8, 9, 0)

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

//    println(list1.sum())
//    println(list1.sumBy { println( it % 4); it % 4 })

//    println(list1.drop(4))  // 返回去掉前n个元素后的列表
//    println(list1)
//    println(list1.dropWhile { it > 4 })  // 返回从第一项起，去掉满足条件的元素，直到不满足条件的一项为止；
//    println(list1.dropLastWhile { it > 4 })
//
//    println(list1.filter { it % 2 == 0 })
//    println(list1.filterNot { it % 2 == 0 })
//    println(list1.filterNotNull())

//    println(list1.slice(listOf(0,2,4)))  // 保留下标为 0 2 4 的元素

//    println(list1.take(2))
//    println(list1.takeLast(2))
//    val drop = list1.drop(1)
//    println(list1.takeWhile { it % 2 == 0 }) // 返回从第一项起，满足条件的元素，直到不满足条件的一项为止；
//    println(drop.takeWhile { it % 2 == 0 }) // 返回从第一项起，满足条件的元素，直到不满足条件的一项为止；

//    println(list1.map { listOf(it, it + 1) })
//    println(list1.flatMap { listOf(it, it + 1) })

//    println(list1.groupBy { if (it % 2 == 0) "even" else "odd"})
//    println(list1.groupBy { if (it % 2 == 0) "even" else "odd"}.getValue("even"))

//    println(list3.map { it!!*2 })
//    println(list3.mapNotNull { it!!*2 })

//    println(list1.indexOf(2))
//    println(list1[2])
//    println(list1.elementAt(2))
//    println(list1.get(2))

//    println(list1.elementAtOrElse(20,  {it}))
//    println(list1.elementAtOrNull(20))

//    println(list1.first { it % 2 == 0 })
//    //println(list.first { it % 2 == 10 })  //java.util.NoSuchElementException: Collection contains no element matching the predicate
//    println(list1.firstOrNull() { it % 2 == 10 })
//
//    println(list1.indexOf(4))
//    println(list1.indexOfFirst { it % 2 == 0 })
//    println(list1.indexOfLast { it % 2 == 0 })

//    println(list1.last { it % 2 == 0 })
//    println(list.last { it % 2 == 10 })  //java.util.NoSuchElementException: List contains no element matching the predicate
//    println(list1.lastIndexOf(5))
//    println(list1.lastOrNull { it % 2 == 10 })

//    println(list1.single { it % 6 == 5 })
//    println(list.single { it % 2 == 0 })  //java.lang.IllegalArgumentException: Collection contains more than one matching element
//    println(list1.singleOrNull() { it % 5 == 10 })

//    println(list1.partition { it % 2 == 0 })
//    println(list1.partition { it % 2 == 0 }.first)
//
//    println(list1 + listOf(10, 11))

//    println(list1.zip(listOf(7, 8)))
//    println(listOf(Pair(5, 7), Pair(6, 8)))
//    println(listOf(Pair(5, 7), Pair(6, 8), Pair(10, 11)).unzip())

//    println(list1.reversed())

//    以sort为例，sorted()处理过程中会新建临时的List来保存结果数据，对原来的调用者List不会做任何改变，所以需要将新建的对象返回；
//    而sort()是在原来的List基础上进行元素顺序的调整，不会新建对象，所以不需要返回List。

//    println(list1.sorted())  // 自然排序(升序)
//    println(list1.sortedBy { println(it % 3); it % 3 })  // 根据方法处理结果进行自然(升序)排序

//    println(list1.sortedDescending()) // 降序
//    println(list1.sortedByDescending { it % 3 })

    mutableList.reverse()
    mutableList.sortDescending()
    println(mutableList)

}