    /**
     *
     * @author Bhaskar Tejaswi
     */
    import java.io.*;
    public class MyFileManager { 
        public static void main(String [] args) throws IOException,FileNotFoundException{   
            float arr[] = new float[8];
            int len=0;
            int num=1;
            MyValidator valid1 = new MyValidator();
            FileReader fstream = null;
            boolean fileExists = true;
        try{    
            fstream = new FileReader("D:\\5th sem\\Object Oriented Programming using JAVA\\Lab 6\\Q1\\src\\numbers.txt");
            BufferedReader brstream =new BufferedReader(fstream); 
            String input ;
            for(int k=0;k<8;k++){
            input = brstream.readLine();
        
            float number = Float.parseFloat(input);
            int check = valid1.validateNumbers(number);
            if(check==1)
            {
                arr[len]=number;
                len++;
            } 
        }
        }
            catch(FileNotFoundException e) 
            {  
               System.out.println("File not found "+ e.getMessage());
                fileExists = false; 
            }
            catch(IOException e){
                System.out.println("IOException! "+e.getMessage()); 
            }

            finally{
                if(fileExists == true){
                    System.out.println("File is now read.");
                    System.out.println("File has "+len+" positive numbers ");  

                    for(int i=0;i<len;i++){
                    System.out.println(arr[i]);
                    }
                 fstream.close();   
            }    
        }
      } 
    }
