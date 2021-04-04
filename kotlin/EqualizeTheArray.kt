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

// Complete the equalizeArray function below.
fun equalizeArray(arr: Array<Int>): Int {

var index = -1
var highCount = 0
var highCountVal = 0

for (num in arr) {
 index++
 var count = 0
 count = findValue(arr, num)
 
 if (count > highCount) {
     highCount = count
     highCountVal = num
   ////  println("loop $highCountVal $highCount")
 }
 
   
}
val size = arr.size
////println("result $size $highCount")

return (size - highCount)
}

fun findValue(arr : Array<Int>, find : Int) : Int {
    var index = -1
    
    var count = 0
    
    for (num in arr) {
    index++
    if ( find == num) count++    
    }
    
    return count
}
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = equalizeArray(arr)

    println(result)
}
