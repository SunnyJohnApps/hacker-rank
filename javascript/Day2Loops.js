

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    
    for (let c of s) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            console.log(c)
            
    }
    
    for (let c of s) {
        if (c != 'a' && c != 'e' && c != 'i' && c  != 'o' && c != 'u')
            console.log(c)
            
    }
}

