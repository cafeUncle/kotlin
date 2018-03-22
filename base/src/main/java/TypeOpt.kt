import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

var n = 1
var s = n.toLong()

fun main(args: Array<String>) {
    var i: Int = 1
//    println(i.toLong() + 1)

//    var s2: Int = 2
//
//    println(i + s)
//    println({var r = i + s2.toDouble(); r ; r ; r})  //  () -> kotlin.Double

//    Kotlin中Char类型（16位）不是基础类型, 主要体现在和整型的关系上, Java中字符型和整型是可以隐式赋值和比较的, 但Kotlin不行
//    var vBool: Boolean = 'c' == 97

    var arr = StringArray()
    arr.add(s.toString())
    arr[0]!! != "666"
//    arr[1] !!!= "2" // KotlinNullPointerException
//    arr[2] !!!= "2" // KotlinNullPointerException
//    println(arr[0])
//    println(arr[1])
//    println(arr[2])
//
//    arr.add("888")
//    println(arr[1])

//    var arr2:IntArray = intArrayOf(1,2,3,4,5);
//    println(Arrays.toString(arr2))
//    println(arr2[3])
//    println(arr2[5])

    val strArray = Array(5, { i -> println(i); (i * i).toString() })
    println(Arrays.toString(strArray))

    for (s in strArray) {
        print(s)
    }
    println()
    var str = "456789";
    for (c in str) {
        print(c)
    }
}
