

function regexVar() {
    /*
     * Declare a RegExp object variable named 're'
     * It must match a string that starts with 'Mr.', 'Mrs.', 'Ms.', 'Dr.', or 'Er.', 
     * followed by one or more letters.
     */
    
    
    /*
     * Do not remove the return statement
     */
    
  var re = /(\b(Mr\.|Mrs\.|Ms\.|Dr\.|Er\.)(?!Mr\.|Mrs\.|Ms\.|Dr\.|Er\.)[a-zA-Z])/i;
  
    return re;
}

