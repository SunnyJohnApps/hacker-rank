
/*
 * Create the function factorial here
 */

function factorial ( n) {
    var fact = 1
    
    for (let i = n; i >= 1; i--) {
        fact = fact * i
    }
    
    return fact
}
