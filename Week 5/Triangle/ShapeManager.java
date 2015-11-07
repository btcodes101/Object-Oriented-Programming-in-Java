import java.util.Scanner;
/**
 *
 * @author Bhaskar Tejaswi
 */
public class ShapeManager {
    private static int choice;
      
    public static void main(String argsp[]){

try{
        Triangle myTriangle2 = new Triangle(0,0);
        Triangle myTriangle1 = new Triangle(0,0);
     do {
        System.out.println("Perform the following methods:");
        System.out.println("1: initialize first triangle");
        System.out.println("2: show area of 1st triangle");
        System.out.println("3: add second triangle");
        System.out.println("4: show area of 2nd triangle");
        System.out.println("5: compare");
        System.out.println("6: quit");
// read user input
        
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice)
        {
        case 1: 
               System.out.println("enter base");
               int base = sc.nextInt();
                System.out.println("enter base");
               int height = sc.nextInt();
                                   
               if(base<=0 || height<=0)
                   System.out.println("Dimensions must be non zeo positive integers");
               else{
            myTriangle1 = new Triangle(base,height);}
               break;
        case 2: System.out.println("Area is "+ myTriangle1.getArea());
        break;
        case 3: System.out.println("enter base");
               int base1 = sc.nextInt();
               System.out.println("enter height");
               int height1 = sc.nextInt();
               
               if(base1<=0 || height1<=0)
                   System.out.println("Dimensions must be non zeo positive integers");
               else {
               myTriangle2 = new Triangle(base1,height1) ;
               }
               
        break;
        case 4: System.out.println("Area is "+ myTriangle2.getArea());
        break;
        case 5: 
            if(myTriangle1.compareTo(myTriangle2)==-1)
                    System.out.println("Triangle 1 is bigger");
            else if(myTriangle1.compareTo(myTriangle2)==1)
                    System.out.println("Triangle 2 is bigger");
                  else 
                    System.out.println("Equal area");
        break;
        case 6: System.out.println("Thank You!"); 
            break;
        default: System.out.println("Wrong input... enter again");
        break;
        }
    } while (choice != 6);
}

catch(){}
catch(){}
}

}
