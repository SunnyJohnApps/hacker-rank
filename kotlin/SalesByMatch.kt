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


// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {

var pair = Array<Int>(n){0}

var count = 0

var index = -1

for (sock in ar) {
    index++

    if (pair[index] == 0) {
   var foundIndex =  checkSockPair(index, sock, ar, pair )
   
    if (foundIndex >= 0) {
        
        pair[index] = 1
        pair[foundIndex] = 1
        count++
        
        
    }
    
}
}

return count
}

fun checkSockPair(argIndex : Int, sock : Int, ar: Array<Int> , pair : Array<Int>) : Int {
    var found = -1
    var index = -1
    for (item in ar) {
        index++
        if (argIndex != index && pair[index] == 0) {
            if (item == sock) {

                found = index
                break
                
                
            }
        }
    }
    return found
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
