import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


// Complete the isValid function below.
fun isValid(s: String): String {
    var isValid = "YES"

    var arr = s.toCharArray()
    arr.sort()
    var count = ArrayList<Int>()
    var index = -1
    var prev = ' '

    for (c in arr) {

        if (c != prev) {
            index++
           // count[index] = arr.count({ it == c })
            count.add(arr.count({ it == c }))
            prev = c
        }
    }


var min = count.min()
    var max = count.max()

    if (max == null) max = 0
    if (min == null) min = 0


    var maxCount = count.count { it == max }
    var minCount = count.count { it == min }
    if (max == min) isValid = "YES"
    else if ((max - min)  == 1) {
        if ((maxCount > minCount) &&  (minCount > 1))         isValid = "NO"
        else if ((maxCount > minCount) &&  (minCount == 1))         isValid = "YES"
        else if ((maxCount == minCount) &&  (minCount > 1))         isValid = "NO"
        else if ((maxCount < minCount) &&  (maxCount > 1))         isValid = "NO"
        else if ((maxCount < minCount) &&  (maxCount == 1))         isValid = "YES"
    }
    else if ((max - min) > 1) {
        isValid = "NO"
        if ((maxCount > minCount) &&  (minCount > 1))         isValid = "NO"
        else if ((maxCount > minCount) &&  (minCount == 1))         isValid = "YES"
        else if ((maxCount == minCount) &&  (minCount > 1))         isValid = "NO"
        else if ((maxCount < minCount) &&  (maxCount > 1))         isValid = "NO"
        //else if ((maxCount < minCount) &&  (maxCount == 1))         isValid = "YES"
    }
  
  //  println(arr.joinToString() )
    //println(count.joinToString() )

    return isValid
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = isValid(s)

    println(result)
}
