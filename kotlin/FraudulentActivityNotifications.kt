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

// Complete the activityNotifications function below.
fun activityNotifications(expenditure: Array<Int>, d: Int): Int {

    var max = expenditure.max()
    if (max != null) max++
    else return 0

    val expDays = expenditure.size
    var notification = 0

    var countArray = Array<Int>(max ){0}
    var prevExp = expenditure.copyOfRange(0, d  )


    for (i in 0..(max - 1)){
        countArray[i] = prevExp.count{it == i};
    //    print("$i = ${countArray[i]} ")

    }

    var odd = false
    var m1pos = 0
    var m2pos = 0

    if (d % 2 == 0) {
        m1pos   =  (d - 1) / 2

        m2pos = m1pos + 1

    }
    else {
        m1pos =  ceil((d - 1) / 2.0).toInt()
        odd = true

    }


    for (day in d..(expDays - 1)){  //"2 3 4 2 3 6 8 4 5"



        var median1 = 0
        var median2 = 0
        var cumCount = 0
        var index = -1
        while (cumCount <= m1pos) {
            index++
            cumCount += countArray[index]
        }
        median1 = index

        if (odd == false) {
            cumCount = 0
            index = -1

            while (cumCount <= m2pos) {
                index++
                cumCount += countArray[index]
            }
            median2 = index
        }

//        println("m1pos = $m1pos , m2pos = $m2pos")
//        println ("median1 = $median1 , median2 = $median2")
        var median = 0.0

        if (odd == false) {
            median = ((median1 + median2) / 2.0).toDouble()
        }
        else median = median1.toDouble()

        var spend = expenditure[day]
        if (spend >= (median * 2)) {
            notification++
        }


            val prevDayExp = expenditure[day - d ]

            countArray[prevDayExp]--
            countArray[expenditure[day ]]++


    }

    return notification
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val expenditure = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = activityNotifications(expenditure, d)

    println(result)
}
