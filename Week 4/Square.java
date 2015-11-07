

/**
 *
 * @author Bhaskar Tejaswi
 */
public class Square extends Rectangle {
  
   Square(double side)
    {
            super(side, side);
            System.out.println("Constructor of Square with parameters "+side);
    }
   
     void printDescription(){
        System.out.println("Side = "+length);
        System.out.println("Area = "  +areaOf()+" sq units");    
     }
}
