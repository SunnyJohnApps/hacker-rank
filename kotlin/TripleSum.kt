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


// Complete the triplets function below.
fun triplets(a: Array<Int>, b: Array<Int>, c: Array<Int>): Long {

    var count : Long = 0

    val alist = a.distinct().sorted()
    val blist = b.distinct().sorted()
    val clist = c.distinct().sorted()


    for (num in blist) {
        var aEnd = binarySearchEndIndex(num, alist,0, alist.size - 1)
        var cEnd = binarySearchEndIndex(num, clist, 0, clist.size - 1)

        count = count + (aEnd + 1).toLong() * (cEnd + 1).toLong()
 //       println("aEnd = $aEnd, cEnd = $cEnd, count=$count")
    }
return count
}


fun binarySearchEndIndex(num : Int, searchList: List<Int>, left: Int, right: Int) : Int {
    if (left > right) return -1
    val lsize = searchList.size

    //  println("left= $left right= $right size=$lsize")
    if (left == 0 && right == 0) findIndex(num, searchList, 0)
    if ((right == lsize - 1 ) && (left == (right - 1)))
    {
        var ret = findIndex(num, searchList, left)
        if (ret >= 0) return  ret
        else return findIndex(num, searchList, right)
    }



    var mid = left + ((right -left)/2)

    val listend = (mid + 1) == searchList.size
    return if (( num >= searchList[mid]) && (listend || (num < searchList[mid + 1])) ) {
        mid
    }
    else if (num < searchList[mid]) {
        binarySearchEndIndex(num, searchList, left, mid - 1  )
    }
    else {
        binarySearchEndIndex(num, searchList, mid + 1, right )
    }


}

fun findIndex(num: Int, searchList: List<Int>, mid : Int) : Int{

    val listend = (mid + 1) == searchList.size

    return if (( num >= searchList[mid]) && (listend || (num < searchList[mid + 1])) ) mid
    else return -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val lenaLenbLenc = scan.nextLine().split(" ")

    val lena = lenaLenbLenc[0].trim().toInt()

    val lenb = lenaLenbLenc[1].trim().toInt()

    val lenc = lenaLenbLenc[2].trim().toInt()

    val arra = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val arrb = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val arrc = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val ans = triplets(arra, arrb, arrc)

    println(ans)
}
