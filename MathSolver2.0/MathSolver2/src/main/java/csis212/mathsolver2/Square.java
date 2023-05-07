package csis212.mathsolver2;


public class Square {
    private float side = 1;
    
    public float perimeter() {
        float perimeter = side * 4;
        return perimeter;
    }
            
    public float area() {
        float area = side * side;
        return area;
    }        
    
    public float getSide() {
        return side;
    }
            
    public void setSide(float side)  throws Exception {
        if (side > 0 && side < 10000) {
            this.side = side;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
    }      
            
            
            
            
            
            
            
            
            
            
            
            
            
}
