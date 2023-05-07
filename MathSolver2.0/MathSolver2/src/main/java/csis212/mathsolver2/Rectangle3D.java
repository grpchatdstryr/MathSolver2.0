package csis212.mathsolver2;


public class Rectangle3D {
    
    private float length = 1;
    private float height = 1;
    private float width = 1;


    public float surfaceArea() {
        float perimeter = (float) (2.0 * (length * height + height * width + length * width));
        return perimeter;
    }

    public float area() {
        float area = length * height * width;
        return area;
    }

    public float getLength() {
        return length;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
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
    
    public void setWidth(float width) throws Exception {
        if (width > 0 && width < 10000) {
            this.width = width;
            return;
        }
        else {
            throw new Exception("Choose a number between 0 and 10000");
        }
    }        







}    
    

