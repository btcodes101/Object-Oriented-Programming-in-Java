/**
 * This class simulates a Triangle
 * @author Bhaskar Tejaswi
 */
import java.util.Scanner;
public class Triangle {
   
    private int base;
    private int height;
    /**
     * Default constructor
     * @param myBase base of the triangle
     * @param myHeight height of the triangle
     */
    public Triangle(int myBase,int myHeight){
        base = myBase;
        height = myHeight;
    }
    /**
     * This method returns area in double
     * @return area in double
     */
    public double getArea(){
       return 0.5*base*height;
    }       
   
    /**
     * This method displays the dimensions and the area of the triangle
     */
    public void show(){
        System.out.println("base = "+base+" units");
        System.out.println("height = "+height+" units");
        System.out.println("Area = "+getArea()+" sq units");
    }
    /**
     * This method compares two triangles on the basis of their area
     * @param myTriangle1 first triangle
     * @param myTriangle2 second triangle
     */
    public void compare(Triangle myTriangle1,Triangle myTriangle2){
        Scanner sc = new Scanner(System.in);
       
        if(myTriangle1.base==0 && myTriangle1.height==0)
                        System.out.println("The triangle 1 has not been initialized");
                    else{
                        System.out.println("enter the base :");
                            int myBase2=sc.nextInt();
                            System.out.println("enter the height :");
                            int myHeight2 = sc.nextInt();
                            if(myBase2<=0 ||myHeight2<=0){
                                System.out.println("Please enter only positive integers for base and height of second triangle ");
                            }
                            else{
                            myTriangle2= new Triangle(myBase2,myHeight2);
                            if (Double.compare(myTriangle1.getArea(), myTriangle2.getArea())>0)
                            System.out.println("Our first Triangle is bigger..");
                            else if(Double.compare(myTriangle1.getArea(), myTriangle2.getArea())<0)
                            System.out.println("The second Triangle is bigger..");
                            else
                            System.out.println("Both have same area..");   
                    }
                }
    }
    /**
     * Main function
     * @param args-string args[]
     */
    public static void main(String[]args){
   
        Triangle myTriangle1 = new Triangle(0,0);
        Triangle myTriangle2 = new Triangle(0,0);
        Scanner sc = new Scanner(System.in);
         int choice=0;
           do {     System.out.println("Enter your choice :");
                    System.out.println("1: Initialize first Triangle");
                    System.out.println("2. Calculate Area");
                    System.out.println("3: Compare with another Triangle");
                    System.out.println("4: Show dimensions of first triangle ");
                    System.out.println("5: quit");
                    choice = sc.nextInt();
            switch (choice)
                {
                case 1:     /*initialize first triangle*/
                            System.out.println("enter the base :");
                            int myBase1=sc.nextInt();
                            System.out.println("enter the height :");
                            int myHeight1 = sc.nextInt();
                            if(myBase1<=0 ||myHeight1<=0)
                            System.out.println("Please enter only positive integers for base and height ");
                            else
                            {
                            myTriangle1= new Triangle(myBase1,myHeight1);
                            System.out.println("Triangle inilialized successfully..");
                            }      
                break;
                   
                case 2:     /*calculate area*/
                            if(myTriangle1.base==0 && myTriangle1.height==0 )
                            System.out.println("The Triangle 1 has not been initialized");
                            else
                            System.out.println("Area is "+myTriangle1.getArea()+" sq units");                               
                break;
                   
                case 3:  /*compare */
                         myTriangle1.compare(myTriangle1,myTriangle2);   
                break;
                case 4: if(myTriangle1.base==0 && myTriangle1.height==0)
                        System.out.println("The first triangle has not been initialized");
                        else
                       {
                        myTriangle1.show();
                       }
                break;  
               
                case 5: System.out.println("Program terminated.");
                break;
                default: System.out.println("Wrong choice");
                break;
                }
  } while (choice != 5);
       
System.out.println("Thank You!");
    }
}