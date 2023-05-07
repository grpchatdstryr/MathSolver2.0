package csis212.mathsolver2;


public class Triangle {
    
    private float side1 = 1;
    private float side2 = 1;
    private float hypotenuse = 1;


    public float perimeter() {
        float perimeter = side1 + side2 + hypotenuse;
        return perimeter;
    }

    public float area() {
        float area = side1 * side2 /2;
        return area;
    }

    public float getLength() {
        return side1;
    }

    public float getHeight() {
        return side2;
    }

    public float getWidth() {
        return hypotenuse;
    }

    public void setLength(float length) throws Exception {
        if (length > 0 && length < 10000) {
            this.side1 = length;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
    }

    public void setHeight(float height) throws Exception {
        if (height > 0 && height < 10000) {
            this.side2 = height;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
    }
    
    public void setWidth(float width) throws Exception {
        if (width > 0 && width < 10000) {
            this.hypotenuse = width;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
    }        







}    
    

