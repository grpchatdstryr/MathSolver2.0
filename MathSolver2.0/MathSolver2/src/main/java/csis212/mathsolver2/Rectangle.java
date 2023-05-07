package csis212.mathsolver2;




public class Rectangle {
    
    private float length = 1;
    private float height = 1;

    
    public float perimeter() {
        float perimeter = 2 * length + 2 * height;
        return perimeter;
    }
    
    public float area() {
        float area = length * height;
        return area;
    }
    
    public float getLength() {
        return length;
    }
        
    public float getHeight() {
        return height;
    }
    
    public void setLength(float length) throws Exception {
        if (length > 0 && length < 10000) {
            this.length = length;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
    }
    
    public void setHeight(float height) throws Exception {
        if (height > 0 && height < 10000) {
            this.height = height;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
        
        
        
        
        
        
        
        
        
    }    
    
}
