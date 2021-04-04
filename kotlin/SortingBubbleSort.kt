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

// Complete the countSwaps function below.
fun countSwaps(a: Array<Int>): Unit {
var count = 0

    for (i in 0..(a.size - 1)){
        for (j in 0..(a.size - 2)){
            if (a[j] > a[j+1]) {
                var v = a[j+1]
                a[j+1] = a[j]
                a[j] = v
                count++
            }
        }
    }
    
    val first = a[0]
    val last = a[a.size - 1]
    
    println("Array is sorted in $count swaps.")
    println("First Element: $first")
    println("Last Element: $last")
    
    
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countSwaps(a)
}
