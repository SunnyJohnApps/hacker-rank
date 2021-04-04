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

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {

var numDeletions = 0
var m = s.get(0)

for (index in 0..(s.length - 1)) {
    
    if ((index + 1) < s.length) {
    if (m == s[index + 1]) {
        numDeletions++
        
    }
    else {
        m = s.get(index + 1)
        
    }
    }
}

return numDeletions
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = alternatingCharacters(s)

        println(result)
    }
}
