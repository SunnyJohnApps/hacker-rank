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

/*
 * Complete the 'climbingLeaderboard' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY ranked
 *  2. INTEGER_ARRAY player
 */

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {

    var plr : Array<Int> = Array(player.size){0}

    var lbRank = ranked.distinct().sorted()

    val numbers = (lbRank.size downTo 1).toList()


    var rankList = numbers.zip(lbRank)

//    println("inputsize = ${ranked.size} , playersize = ${player.size}")
//    println("lbRank distinct size = ${lbRank.size}")

    for (p in 0..(player.size - 1)) {
        var rank = 0
        if (player[p] < rankList[0].second) rank = rankList[0].first + 1
        else if ((player[p] > rankList[rankList.size - 1].second) && (rankList[rankList.size - 1].first > 1)) rank = rankList[rankList.size - 1].first - 1
        else if ((player[p] > rankList[rankList.size - 1].second) && (rankList[rankList.size - 1].first == 1)) rank = 1
        else {
            rank = binarySearchFindRank(player[p], rankList, 0, rankList.size - 1)

        }
        plr[p] = rank
    }

    return  plr
}


fun binarySearchFindRank(num : Int, searchList: List<Pair<Int,Int>>, left: Int, right: Int) : Int {
    if (left > right) return -1
    val lsize = searchList.size

    //  println("left= $left right= $right size=$lsize")
    if (left == 0 && right == 0) return findRank(num, searchList, 0)
    if ((right == lsize - 1 ) && (left == (right - 1)))
    {
        var ret = findRank(num, searchList, left)
        if (ret >= 0) return  ret
        else return findRank(num, searchList, right)
    }



    var mid = left + ((right -left)/2)

    val listend = (mid + 1) == searchList.size
    return if (( num >= searchList[mid].second) && (listend || (num < searchList[mid + 1].second)) ) {
        searchList[mid].first
    }
    else if (num < searchList[mid].second) {
        binarySearchFindRank(num, searchList, left, mid - 1  )
    }
    else {
        binarySearchFindRank(num, searchList, mid + 1, right )
    }


}

fun findRank(num: Int, searchList: List<Pair<Int,Int>>, mid : Int) : Int{

    val listend = (mid + 1) == searchList.size

    return if (( num >= searchList[mid].second) && (listend || (num < searchList[mid + 1].second)) ) searchList[mid].first
    else return -1
}

fun main(args: Array<String>) {
    val rankedCount = readLine()!!.trim().toInt()

    val ranked = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val playerCount = readLine()!!.trim().toInt()

    val player = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = climbingLeaderboard(ranked, player)

    println(result.joinToString("\n"))
}
