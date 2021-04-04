

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {
    // Complete the function
    
    nums.sort(function(a, b){return b - a});
    let value = 0
    for (let index = 0; index + 1 < nums.length; index++) {
        if (nums[index + 1] < nums[index]) {
            value = nums[index + 1];
            break;
        }
    }
    
    return value
}

