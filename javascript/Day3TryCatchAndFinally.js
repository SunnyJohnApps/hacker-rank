

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */
function reverseString(s) {
    
    var rev;
    try {
        rev = s.split("").reverse().join("")
        console.log(rev)   
    }
    catch (err) {
        console.log(err.message)
        console.log(s)
    }
}

