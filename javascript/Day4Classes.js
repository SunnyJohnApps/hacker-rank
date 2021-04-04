/*
 * Implement a Polygon class with the following properties:
 * 1. A constructor that takes an array of integer side lengths.
 * 2. A 'perimeter' method that returns the sum of the Polygon's side lengths.
 */

class Polygon {
    constructor(sides) {
        this.sides = sides
    }
    perimeter() {
        let sum = 0
       
        for (let num of this.sides) {
            sum = sum + num
        }
        
        return sum
    }
}

