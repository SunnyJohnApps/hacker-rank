

/*
 * Determine the original side lengths and return an array:
 * - The first element is the length of the shorter side
 * - The second element is the length of the longer side
 * 
 * Parameter(s):
 * literals: The tagged template literal's array of strings.
 * expressions: The tagged template literal's array of expression values (i.e., [area, perimeter]).
 */
function sides(literals, ...expressions) {
    let ar = expressions[0];
    let pe = expressions[1];
    
    let s1 = ((pe + Math.sqrt((pe ** 2 )- (16 * ar)) )/ 4)
    let s2 = ((pe - Math.sqrt((pe ** 2) - (16 * ar)) )/ 4)
    
    
    let newArr = [s1, s2]
    newArr.sort(function(a,b){return a - b})
    
    return newArr
}

