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
import kotlin.math.*


// Complete the pairs function below.
fun pairs(k: Int, arr: Array<Int>): Int {
var count = 0
var i = 0
var j= 1
var n = arr.size
var diff = 0
arr.sort()

while (j < n) {
    diff = arr[j] - arr[i]
    
    if (diff == k) {
        count++
        j++
    }
    else if (diff > k) i++
    else if (diff < k)  j++
}


return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = pairs(k, arr)

    println(result)
}
