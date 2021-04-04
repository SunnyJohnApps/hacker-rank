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

// Complete the checkMagazine function below.
fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val magCount = getWordCount(magazine)
    val noteCount = getWordCount(note)
    if (compareWordCount(magCount, noteCount)) {
        println("Yes")
    }
    else println("No")
}

fun compareWordCount(magCount : HashMap<String,Int>, noteCount : HashMap<String,Int>) : Boolean {
    for ((key,value) in noteCount) {
        if (!magCount.containsKey(key) || (magCount.get(key)!! < value)) {
            return false
        }
    }
    
    return true
}
fun getWordCount(textArray : Array<String>) : HashMap<String, Int> {
    val wordCount = HashMap<String,Int>()
    
    for (word in textArray) {
        if (!wordCount.containsKey(word)) {
            wordCount.put(word,0)
        }
        else wordCount.put(word, wordCount.get(word)!! + 1)
    }
    return wordCount
    
}



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val magazine = scan.nextLine().split(" ").toTypedArray()

    val note = scan.nextLine().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}
