package csis212.mathsolver2;


public class ShapeTemplates {
    
    public void RectangleShape(int a, int b) {
        System.out.println("\n" );                    
        System.out.println(" _____________" );
        System.out.println("|             |");
        System.out.println(  "|             | "+ b);
        System.out.println("|_____________|");
        System.out.println(  "       " + a);         
    }  
    
    public void SquareShape(int a) {
        System.out.println("\n" );            
        System.out.println(" _______" );
        System.out.println("|       |");
        System.out.println(  "|       | " + a);
        System.out.println("|_______|");        
    }
    
    
    public void CircleShape(int a) {
        System.out.println("  .---." );
        System.out.println(" /     \\  ");
        System.out.println(  "|   *---| "+ a);
        System.out.println(" \\_____/");        
    }    
    
    
    public void TriangleShape(int a, int b, int c) {
        System.out.println(" \n" );   
        System.out.println(" |\\");        
        System.out.println(" | \\");
        System.out.println(" |  \\");
        System.out.println(b + "|   \\"+c );
        System.out.println(" |    \\");
        System.out.println(" |     \\");
        System.out.println(" |______\\");      
        System.out.println("    " + a + "\n");           
    }    
    
    public void TriangleShapeDemo() {
        System.out.println(" \n" );   
        System.out.println("       |\\");        
        System.out.println("       | \\");
        System.out.println("       |  \\");
        System.out.println("Side 2 |   \\ Hypotenuse");
        System.out.println("       |    \\");
        System.out.println("       |     \\");
        System.out.println("       |______\\");      
        System.out.println("        Side 1");           
    }   
    
    
    public void Rectangle3DShape(int a, int b, int c) {
        System.out.println("\n" );   
        System.out.println("    _____________");        
        System.out.println("   /            /|");
        System.out.println(  "  /____________/ | " + a);
        System.out.println(" |             | |");
        System.out.println(" |             | /");
        System.out.println(  " |_____________|/ "+ c);
        System.out.println(  "       " + b);         
    }
    
    public void InputPolish() {
        System.out.print("\nuser@MathSolver:~$ ");
    }
    
    public void ResultPolish() {
        System.out.println(" --------------------------------------------------");
    }
    
    public void NewLine() {
        System.out.print("\n\n\n");
    }
    
    
    public static void main(String[] args) {
        
        
        ShapeTemplates shape = new ShapeTemplates();
        int a = 1;
        int b = 2;
        shape.RectangleShape(a, b);
 
        
        ShapeTemplates inputPolish = new ShapeTemplates();
        inputPolish.InputPolish();
        
        
        ShapeTemplates resultPolish = new ShapeTemplates();
        resultPolish.ResultPolish();
        
        ShapeTemplates newLine = new ShapeTemplates();
        newLine.NewLine();
        
    }
    
    
    
    
    
    
}
    
    
    
    
