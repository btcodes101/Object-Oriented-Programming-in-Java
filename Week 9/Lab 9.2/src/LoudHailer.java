class LoudHailer implements Runnable {
   private Thread t;
   private String threadName;
   private Key key; 
   int count = 0;
   LoudHailer( String name,Key k){
       threadName = name;
       key = k;
 }
   public void run() {
      try {
         for(int i = 30; i > 0; i--) {
             synchronized(key){
                 if((count==0 && threadName=="GOOD") ||(count==1 && threadName=="MORNING")||(count==2 && threadName=="KOLKATA")){
                 System.out.println(threadName);
                 }
                 count = (count+1)%3; 
         }
          Thread.sleep(3000);
         }
     } catch (InterruptedException e) {
         System.out.println(e.getMessage());
     }
   }
   public void start ()
   {
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start();
      }
   }

}