

/*
 * Complete the Rectangle function
 */

function Rectangle(a, b) {
    
    
class Rect {
    
        constructor (a,b) {
            this.length = a
            this.width = b
            this.perimeter = 0
            this.area = 0
        }
        
        p() {
            
            this.perimeter =  2 * (this.length + this.width)
        }
        
        a() {
            this.area = this.length * this.width
        }
        
        calc() {
            this.p()
            this.a()
        }
        
    }
 
 let rect = new Rect(a,b)
 
rect.calc()
 return rect   
}
