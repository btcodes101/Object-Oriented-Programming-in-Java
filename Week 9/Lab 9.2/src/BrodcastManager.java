public class BrodcastManager {
   public static void main(String args[]) {
      Key k  = new Key();
      LoudHailer R1 = new LoudHailer( "GOOD",k);
      R1.start();
      
      LoudHailer R2 = new LoudHailer( "MORNING",k);
      R2.start();
      
      LoudHailer R3 = new LoudHailer( "KOLKATA",k);
      R3.start();
      
   }   
}