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

// Complete the encryption function below.
fun encryption(s: String): String {

    var nospaces = ""

    for (c in s) {
        if ( c != ' ') nospaces = nospaces + c
  }

    var len = nospaces.length
    var sq = kotlin.math.sqrt(len.toDouble())


    var row = Math.floor(sq).toInt()
    var col = Math.ceil(sq).toInt()
    if ((row * col) < len) row = col

    var arr = arrayOf<Array<Char>>()

    var index = -1

    for (i in 0..(row - 1)) {
        var colarr = arrayOf<Char>()
        for (j in 0..(col - 1)) {
            index++
            if (index < len)  colarr += nospaces.get(index)
            else colarr += '`'
        }
        arr += colarr
        if (index >= len) break

    }
//    println(s)
//println(arr.contentDeepToString())



   var encs = ""
    for (i in 0..(col - 1)) {
         for (j in 0..(row - 1)) {
                  encs += arr[j][i]
        }
       
        encs += " "
    }
//println(encs)
   encs =  encs.replace("`","")


    return encs
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = encryption(s)

    println(result)
}
