/**
 *
 * @author Bhaskar Tejaswi
 */
public class Bicycle extends Vehicle{
      int numwheels=2;
      public void honk(){
        System.out.println("BICYCLE-HONK");
    }
    public void move(double dist,String dir){
        System.out.println("BICYCLE-pedalling "+ dist+ "km "+dir+" on "+numwheels+" wheels");
    }
      
  
}
