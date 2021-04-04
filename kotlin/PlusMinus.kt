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

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    
    var plusTotal : Float = 0.0f
    var minusTotal : Float = 0.0f
    var zeroTotal : Float = 0.0f
    
    
    for (num in arr) {
        
        if (num > 0)  plusTotal++
        else if (num < 0)  minusTotal++
        else zeroTotal++
    }

val df = DecimalFormat("#.######")
    df.roundingMode = RoundingMode.CEILING



    println(df.format(plusTotal / arr.size))
    println(df.format(minusTotal/arr.size))
    println(df.format(zeroTotal/arr.size))

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
