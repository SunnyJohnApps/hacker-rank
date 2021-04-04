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

// Complete the isBalanced function below.
fun isBalanced(s: String): String {

val left = listOf('{','[','(')
val right =listOf('}',']',')')

val leftRightMap = HashMap<Char,Char>()

for (i in 0..2) {
    leftRightMap.put(right[i], left[i])
}

val stack = ArrayList<Char>()

var ret = false
for (c in s) {
    if (c in left) stack.add(c)
    else if (c in right) {
        
        if (stack.size == 0) {
                ret = false
                break
            }
            
        var leftOfRight = leftRightMap.get(c)
        var lastC = stack.get(stack.size - 1)
        
        if (leftOfRight == lastC) {
            stack.removeAt(stack.size-1)
            ret = true
        }
        else {
            ret = false
            break
        }
    }

}

if (ret == false) return "NO"
else {
        if (stack.size > 0) return "NO"
        else return "YES"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val s = scan.nextLine()

        val result = isBalanced(s)

        println(result)
    }
}
