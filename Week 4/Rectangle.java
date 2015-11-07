
/**
 *
 * @author Bhaskar Tejaswi
 */
public class Rectangle extends Shape {
   
    double length;
    double breadth;
   
    Rectangle(double length, double breadth){
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    System.out.println("Constructor of Rectangle with parameters "+length+" and "+breadth);
    }
       void printDescription(){
       
        System.out.println("Length = "+length);
        System.out.println("Length = "+breadth);
        System.out.println("Area = "  +areaOf()+" sq units");    
    }
       double areaOf(){
           return length*breadth;
       }
   
   
   
}
