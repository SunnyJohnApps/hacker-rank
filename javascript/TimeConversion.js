'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(str => str.trim());

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the timeConversion function below.
 */
function timeConversion(s) {
    /*
     * Write your code here.
     */

let ampm = s.substring(8,10);
let hour = s.substring(0,2);
let min = s.substring(3,5);
let sec = s.substring(6,8);
let h = hour ;
console.log("ampm", ampm);

if (ampm == "AM" && hour == "12") h = "00"

let hInt = parseInt(hour);

if (ampm == "PM") {
    if (hInt >= 1 && hInt <= 11) {
        h = (hInt + 12).toString()
        
    }
} 

let time24 = h + ":" +  min + ":" + sec
console.log("time24", time24);

return time24;
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const s = readLine();

    let result = timeConversion(s);

    ws.write(result + "\n");

    ws.end();
}
