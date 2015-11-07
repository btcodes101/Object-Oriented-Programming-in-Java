

/**
 *
 * @author Bhaskar Tejaswi
 */
public class Circle extends Shape {
   
    private double radius;

    Circle(double radius)
    {
   
        super("Circle");
        this.radius = radius;
       
    System.out.println("Constructor of Circle with parameter "+radius);
    }
    void printDescription(){
        name  = "Rectangle";
        System.out.println("Radius = "+radius);
        System.out.println("Area = "  +3.14*radius*radius+" sq units");
       
    }
}