

function getLetter(s) {
    let letter;
    // Write your code here
    
    let firstChar = s.substring(0,1);
    
    switch(firstChar) {
        case 'a' : case 'e' : case 'i' : case 'o' : case 'u':
         letter = "A";
        break;
        
        case 'b' : case 'c' : case 'd' : case 'f' : case 'g':
         letter = "B";
        break;
        
        case 'h' : case 'j' : case 'k' : case 'l' : case 'm':
         letter = "C";
        break;
        
        case 'n' : case 'p' : case 'q' : case 'r' : case 't' : case 'v' : case 'w' : case 'x' : case 'y' : case 'z':
         letter = "D";
        break;
        
        
    }
    return letter;
}

