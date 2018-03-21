import model.Model
import java.util.*

fun main(args: Array<String>) {
    var model = Model(1, "someone", 20)
    println(model)
    model.id = 666
    println(model)

    var str1 = null
//    var str2: String = null // NULL can not to be a value of a non-null type String
    var str2: String ? = null
    var str3: String
//    str3 = null // NULL can not to be a value of a non-null type String
    str3 = ""
    var str4: Date? = null

    val time = str4?.time  // 判空，如null则不调用time直接返回null
//    val time2 = str4!!.time  // 强行不判空，如空则报异常

    fun Model.customMethod(str: String?): String?{
        return this.name + str
    }



    print(model.customMethod(str2))
}