

/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    
    var index = -1
    for (let num of nums) {
        index++
        if (num % 2 == 0) nums[index] = num * 2
        else nums[index] = num * 3
    }
    
    return nums
}

