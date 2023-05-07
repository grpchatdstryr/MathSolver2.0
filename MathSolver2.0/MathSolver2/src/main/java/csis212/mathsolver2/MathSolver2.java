//|   .      .        _____  .    .    _   ____   .   .      . ____   __       _---.       _--_ 
//|   |\    /|    /\    |    |    |   /   /    \  |    \    / |      |  \           |     /    \
//|   | \  / |   /__\   |    |----|   \   |    |  |     \  /  |----  |__/       ----      \    /
//|   |  \/  |  /    \  |    |    |   /    \__/   |___   \/   |____  |  \      |____-  (@) \__/
//|   __________________________________________________________________________________________


package csis212.mathsolver2;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MathSolver2 {
    
    
    public static void main(String[] args) {
        
   
        
        
        
        Scanner input = new Scanner(System.in); //Scanner
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle3D rectangle3d = new Rectangle3D();
        
        
        
        //Shape Templates
        ShapeTemplates shape = new ShapeTemplates(); // Shapes
        ShapeTemplates inputPolish = new ShapeTemplates(); // Input Polisher
        ShapeTemplates resultPolish = new ShapeTemplates(); // Result Polisher
        ShapeTemplates newLine = new ShapeTemplates(); // New Line Formater
        
        

        
        
        System.out.println("\nWELCOME TO MATHSOLVER2.0!!!\n");
        
        do { //Repeats when Finished
        
        newLine.NewLine();        
        System.out.println("Choose which shape you want to solve for!");
        System.out.println("1. Rectangle [  ]\n2. Square []\n3. Circle ( )\n4. Triangle |\\\n5. 3D Rectangle [  ]]\n6. Exit X\n" );
        
        inputPolish.InputPolish();        
        int shapePicker = input.nextInt();
        
        


        
        switch (shapePicker) {
            case 1: //Rectangle
                
                //Length
                System.out.print("Enter the Length: ");
                int length = input.nextInt();

                try { // Sets Length
                    rectangle.setLength(length);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }


                //Height
                System.out.print("Enter the Height: ");
                int height = input.nextInt();

                try { //Sets height
                    rectangle.setHeight(height);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }
                    
                //Shape
                shape.RectangleShape(length, height);
                
                        
                System.out.println("What would you like to solve for?");
                System.out.println("1. Perimeter \n2. Area");
                inputPolish.InputPolish();        
                int rectangleSubChoice = input.nextInt();

                
                switch (rectangleSubChoice) {
                    case 1:
                        resultPolish.ResultPolish();
                        System.out.println("| The Perimeter is: " + rectangle.perimeter());
                        resultPolish.ResultPolish();
                        break;
                        
                    case 2:
                        resultPolish.ResultPolish();                        
                        System.out.println("| The Area is: " + rectangle.area());
                        resultPolish.ResultPolish();
                        break;
                }
                break;
            
                
            case 2: //Square
                
                System.out.print("Enter the Side: ");
                int side = input.nextInt();

                try { // Sets Side
                    square.setSide(side);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }                

                //Shape                
                shape.SquareShape(side); //Square Graphic
                
                System.out.println("\nWhat would you like to solve for?");
                System.out.println("1. Perimeter \n2. Area");
                inputPolish.InputPolish();        
                int squarePicker = input.nextInt();
                
                switch (squarePicker) {
                                        
                    case 1:
                        resultPolish.ResultPolish();                        
                        System.out.println("| The Perimeter is: " + square.perimeter());
                        resultPolish.ResultPolish();
                        break;
                                
                    case 2:
                        resultPolish.ResultPolish();                        
                        System.out.println("| The Area is: " + square.area());
                        resultPolish.ResultPolish();                        
                        break;
                }
                break;
                
               
                
                
            case 3: //Circle
                
                System.out.print("Enter the Radius: ");
                int radius = input.nextInt();

                try { // Sets Radius
                    circle.setRadius(radius);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }  
                
                //Shape
                shape.CircleShape(radius); //Square Graphic
                
                System.out.println("\nWhat would you like to solve for?");
                System.out.println("1. Circumference \n2. Area");
                inputPolish.InputPolish();        
                int circlePicker = input.nextInt();
                
                switch (circlePicker) {
                    case 1:  
                        resultPolish.ResultPolish();                        
                        System.out.println("| The Circumference is " + circle.perimeter());
                        resultPolish.ResultPolish();
                        break;
                        
                    case 2:
                        resultPolish.ResultPolish();
                        System.out.println("| The Area is " + circle.area());
                        resultPolish.ResultPolish();
                        break;
                }
                break;     
                
                
                
                
                
            case 4: //Triangle
                
                //Triangle Demo
                shape.TriangleShapeDemo();
                
                
                //Length
                System.out.print("\nEnter Side 1: ");
                int side1 = input.nextInt();

                try { // Sets Length
                    triangle.setLength(side1);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }

                //Height
                System.out.print("Enter Side 2: ");
                int side2 = input.nextInt();

                try { //Sets height
                    triangle.setHeight(side2);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }
                
                
                //Width
                System.out.print("Enter the Hypotentuse: ");
                int hypotenuse = input.nextInt();

                try { //Sets Width
                    triangle.setWidth(hypotenuse);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }
                
                
                
                //Shape
                shape.TriangleShape(side1, side2, hypotenuse);
                
                        
                System.out.println("What would you like to solve for?");
                System.out.println("1. Perimeter\n2. Area");
                inputPolish.InputPolish();        
                int triangleSubChoice = input.nextInt();

                
                switch (triangleSubChoice) {
                    case 1:
                        resultPolish.ResultPolish();
                        System.out.println("| The perimeter is: " + triangle.perimeter());
                        resultPolish.ResultPolish();
                        break;
                        
                    case 2:
                        resultPolish.ResultPolish();                        
                        System.out.println("| The Area is: " + triangle.area());
                        resultPolish.ResultPolish();
                        break;
                }
                break;                
                
                
                
               
                
                
            case 5: //3D Rectangle
                
                //Length
                System.out.print("Enter the Length: ");
                length = input.nextInt();

                try { // Sets Length
                    rectangle3d.setLength(length);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }


                //Height
                System.out.print("Enter the Height: ");
                height = input.nextInt();

                try { //Sets height
                    rectangle3d.setHeight(height);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }
                
                
                //Width
                System.out.print("Enter the Width: ");
                int width = input.nextInt();

                try { //Sets Width
                    rectangle3d.setWidth(width);
                } catch (Exception exception) {
                    Logger.getLogger(MathSolver2.class.getName()).log(Level.SEVERE, null, exception);
                }
                
                
                
                //Shape
                shape.Rectangle3DShape(length, height, width);
                
                        
                System.out.println("What would you like to solve for?");
                System.out.println("1. Surface Area\n2. Area");
                inputPolish.InputPolish();        
                int rectangle3DSubChoice = input.nextInt();

                
                switch (rectangle3DSubChoice) {
                    case 1:
                        resultPolish.ResultPolish();
                        System.out.println("| The Surface Area is: " + rectangle3d.surfaceArea());
                        resultPolish.ResultPolish();
                        break;
                        
                    case 2:
                        resultPolish.ResultPolish();                        
                        System.out.println("| The Area is: " + rectangle3d.area());
                        resultPolish.ResultPolish();
                        break;
                }
                break;                
                
                
               
            case 6: //Exit
                System.exit(0);   
                
            default: //Else
                resultPolish.ResultPolish();
                System.out.println("| Choose a number listed");
                resultPolish.ResultPolish();
                break;
  
                
        }
        }
        while (true);
        
    }
}
