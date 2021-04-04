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

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {


var len  = n / s.length
var div = s.length


var count : Long = 0
var countOfa = findNumChars(s)

count = countOfa * len

if ((n % div )!= 0.toLong()) {
    var index = 0
    
for (singleChar in s) {
    index++
    
    if (singleChar == 'a') {
        count++
        
    }
    if (((s.length * len) + index) >= n) break
    
}


}


return count
}

fun findNumChars (str : String) : Long {
    var count : Long = 0
    
    for (singleChar in str) {
      
        if (singleChar == 'a') count++
        
    }
    
    return count
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
