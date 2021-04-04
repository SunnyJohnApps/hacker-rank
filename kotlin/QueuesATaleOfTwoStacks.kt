import java.io.*
import java.util.*

val list = ArrayList<Int>()

fun main(args: Array<String>) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
        
       val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val s = scan.nextLine()
        val op = Character.getNumericValue(s.get(0))
        if (op == 1) {
            val arr = s.trim().split(" ").toTypedArray()
            val num = arr[1].toInt()
            list.add(num)
        }
        else if (op == 2) {
            list.removeAt(0)
        }
        else if (op == 3) {
            val output = list.get(0)
            println( output)
        }

    }
        
}
