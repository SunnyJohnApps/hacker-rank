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

// Complete the whatFlavors function below.
fun whatFlavors(cost: Array<Int>, money: Int): Unit {

    val numbers = (0..(cost.size - 1)).toList()


    var costList = numbers.zip(cost)

    costList = costList.sortedBy { it.second }
     var index = -1
    var s: HashSet<Int> = HashSet<Int>()


    for ( num in cost) {
        index++


        if (s.contains(num)) continue
        var diff = money - num

        var left = 0
        var right = costList.size - 1
        var mid = costList.size / 2

        if ((money/2) > diff) {
            right = mid
        }
        else if ((money/2) < diff) left = mid

       val find = binarySearch(costList, diff, left, right)

       if (find >= 0 &&(find != index)) {
           s.add(diff)

           if (((index +1) < (find + 1)) )
            println((index + 1).toString() + " " + (find + 1).toString())
           else if (((index +1) > (find + 1)) )
               println((find + 1).toString() + " " + (index + 1).toString())
       }
      // else println("Found Nothing")
    }

}

fun binarySearch(listPair: List<Pair<Int,Int>>, num : Int,  l:Int, r:Int) : Int{
    var find = -1
    var left = l
    var right = r

    while (left <= right) {
        var mid = left + ((right - left)/2)
        var midValue = listPair[mid].second
        if (midValue == num) return  listPair[mid].first
        else if (num < midValue) right = mid - 1
        else  left = mid + 1

    }

    return find
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val cost = scan.nextLine().trim().split(" ").map{ it.trim().toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}
