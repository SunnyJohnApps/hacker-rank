

function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    
    var readline = require('readline');

var radius = parseFloat(readLine()).toFixed(3)

const PI = Math.PI


    // Print the area of the circle:
    let area = PI * radius * radius
    console.log(area)
    
    let perimeter = 2 * PI * radius
    // Print the perimeter of the circle:
    console.log(perimeter)

