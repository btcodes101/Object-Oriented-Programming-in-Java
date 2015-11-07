/**
 *
 * @author Bhaskar Tejaswi
 */
public class Auto extends Vehicle{
    
    int numwheels=3;
    
    public void honk(){
        System.out.println("AUTO-HONK");
    }
    
    public void move(double dist,String dir){
        System.out.println("AUTO-driving "+ dist+ " km "+dir+" on "+numwheels+" wheels");
    }
    
    
    
}
