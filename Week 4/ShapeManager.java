/**
 *
 * @author Bhaskar Tejaswi
 */
import java.util.Scanner;
public class ShapeManager {
   
    public static void main(String[]args){
        int choice;
        Scanner sc = new Scanner(System.in);
        ShapeManager myShapeManager = new ShapeManager();
       
         do {
                System.out.println("Select a Shape");
                System.out.println("1.Rectangle");
                System.out.println("2.Square");
                System.out.println("3.Circle");
                System.out.println("4.Exit");
                choice = sc.nextInt();

        switch (choice)
                        {
                                case 1: 
                                    System.out.println("Enter the length  :");
                                    double len=sc.nextDouble();
                                    System.out.println("Enter the breadth :");
                                    double bd=sc.nextDouble();
                                    if(len<=0 || bd<=0)
                                    System.out.println("Invalid Entry");
                                    else
                                    {
                                        Rectangle myRect = new Rectangle(len,bd);
                                        myShapeManager.manageShape(myRect);
                                    }
                                break;
                                   
                                case 2: System.out.println("Enter the side length  :");
                                        double side=sc.nextDouble();
                                        if(side<=0)
                                        System.out.println("Side must be positive");
                                        else
                                        {
                                            Square mysq = new Square(side);
                                            Rectangle myRect = (Rectangle)mysq;
                                             myRect.printDescription();
                                        }
                                break;
                                   
                                case 3: System.out.println("Enter the radius  :");
                                        double radius=sc.nextDouble();
                                        if(radius<=0)
                                         System.out.println("Invalid Entry");
                                        else
                                       {
                                        Circle myCircle = new Circle(radius);
                                        myShapeManager.manageShape(myCircle);
                                       }
                                break;
                                   
                                case 4: System.out.println("Program terminated.");
                                break;
                                   
                                default: System.out.println("Invalid entry !");
                                break;
                        }
               } while (choice != 4);
    System.out.println("Thank You!");
    }
    void manageShape(Shape myShape) 
   {
    myShape.printDescription();

}  
}