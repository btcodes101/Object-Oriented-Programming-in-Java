/**
 *
 * @author Bhaskar Tejaswi
 */
public class Car extends Vehicle{
    
    int numwheels = 4;

  public void honk(){
        System.out.println("CAR-HONK");
    }
    public void move(double dist,String dir){
        System.out.println("CAR-driving "+ dist+ " km "+dir+" on "+numwheels+" wheels");
    }
    
    

}
