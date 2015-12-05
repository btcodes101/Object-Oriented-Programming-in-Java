class LoudHailer implements Runnable {	
   private Thread t;
   private String threadName;
   
   LoudHailer( String name){
       threadName = name;
   }
   public void run() {
      try {
         for(int i = 10; i > 0; i--) {
            System.out.println(threadName);
            Thread.sleep(1000);
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
         t.start ();
      }
   }
}