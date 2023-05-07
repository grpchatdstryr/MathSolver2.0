package csis212.mathsolver2;



public class Circle {
    private float radius = 1;
    
    public float perimeter() {
        float perimeter =  (float) (2 * 3.141592 * radius);
        return perimeter;
    }
    
    public float area() {
        float area = (float) (3.141592 * radius * radius);
        return area;
    }
    
    public float getRadius() {
        return radius;
    }
    
    
    public void setRadius(float radius) throws Exception {
        if (radius > 0 && radius < 10000) {
            this.radius = radius;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
    }
     
    
    public static void main(String[] args) {
       
    }
}
