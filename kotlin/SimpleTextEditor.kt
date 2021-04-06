import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */

    val  scan = Scanner(System.`in`)

    val list = ArrayList<Pair<Int, String>>()
    var text = ""

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val s = scan.nextLine().trim()

    
        var str = ""
        if (s.length > 1)  str = s.substring(2, s.length)
        val op = s.substring(0,1).toInt()

        when (op) {
         1 -> {
             list.add(Pair(op, str.length.toString()))
             text = text + str
         }
         2 -> {
             val delText = text.substring(text.length - (str.toInt()), text.length)
             text = text.substring(0,text.length - (str.toInt()))
             list.add(Pair(op, delText))
         }
         3 -> {
             val output = text.get(str.toInt() - 1)
             println( output)
         }
         4 -> {
             val lastIndex = list.size - 1
             val undoOp = list.get(lastIndex).first
             val undoText = list.get(lastIndex).second

             list.removeAt(lastIndex)

             when (undoOp) {
                 1 -> {
                     val len = undoText.toInt()
                     text = text.substring(0,text.length - len)
                 }
                 2 -> {
                     text = text + undoText
                 }
             }

         }
        }
       // println("op = $op str = $str text = $text")
    }


}
