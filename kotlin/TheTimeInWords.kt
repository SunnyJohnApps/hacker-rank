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


// Complete the timeInWords function below.

fun getWord(num : Int) : String {
    
    if (num > 29) return ""
    var array = arrayOf("zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
    return array[num]
}

fun timeInWords(h: Int, m: Int): String {
var result = ""

when (m) {
    0 -> result = getWord(h) + " o' clock"
    1 -> result = getWord(m) + " minute past " + getWord(h)
    
    in 2..14 -> result = getWord(m) + " minutes past " + getWord(h)
    15 -> result = "quarter past " + getWord(h)
    in 16..29 -> result = getWord(m) + " minutes past " + getWord(h)
    30 -> result = "half past " + getWord(h)
    in 31..44 -> result = getWord(60 - m) + " minutes to " + getWord(h+ 1)
    45 -> result = "quarter to " + getWord(h + 1)
    in 46..58 -> result = getWord(60 - m) + " minutes to " + getWord(h+ 1)
    59 -> result = getWord(60 - m) + " minute to " + getWord(h+ 1)
}

return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val h = scan.nextLine().trim().toInt()

    val m = scan.nextLine().trim().toInt()

    val result = timeInWords(h, m)

    println(result)
}
