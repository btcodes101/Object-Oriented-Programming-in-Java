/**
 *
 * @author Bhaskar Tejaswi 
 */
import java.io.*;
import java.util.*;
public class FlightManager {
    
    private Flight flightList[]=new Flight[8]; 
   
    public Flight readLine(String oneLine,int k){
        StringTokenizer base,time;
        String city,days,flightNum;
        
    Flight myFlight = new Flight();    
    base = new StringTokenizer(oneLine,"|");
        while(base.hasMoreTokens()){    
            city = (base.nextToken()).toString();
            days = (base.nextToken()).toString();
            flightNum = (base.nextToken()).toString();
            time = new StringTokenizer(base.nextToken(),"/");
            while(time.hasMoreTokens()){
              myFlight.setArrTime((time.nextToken()));
              myFlight.setDepTime(time.nextToken());
            }
            myFlight.setDepCity(city);
            myFlight.setDaysOfWeek(days);
            myFlight.setFlightNum(flightNum);   
        }
        return myFlight;
    }
           
    public String writeLine(){    /*write sorted array */
    
        String written="";
        return written;
    
 }
public Flight[] sortFlight(Flight[] flightList){  
    for(int i=0; i<8;i++){
     for (int j=i+1 ; j<8; j++){
        String myFlightNum1 = flightList[i].getFlightNum();
        String myFlightNum2 = flightList[j].getFlightNum();
        
         if(myFlightNum1.compareTo(myFlightNum2)>0)
         {
             String temp = flightList[i].getFlightNum();
             flightList[i].setFlightNum(myFlightNum2);
             flightList[j].setFlightNum(temp);
             //flight nos exchanged
             
             temp= flightList[j].getDepCity();
             flightList[i].setDepCity(flightList[j].getDepCity());
             flightList[i].setDepCity(temp);
             // dep cities exhanged
             
             temp= flightList[j].getDaysOfWeek();
             flightList[i].setDaysOfWeek(flightList[j].getDaysOfWeek());
             flightList[i].setDaysOfWeek(temp);
             // days of week exhanged
             
             temp= flightList[j].getDepTime();
             flightList[i].setDepTime(flightList[j].getDepTime());
             flightList[i].setDepTime(temp);
             // dep time exchanged 
             
             temp= flightList[j].getArrTime();
             flightList[i].setArrTime(flightList[j].getArrTime());
             flightList[i].setArrTime(temp);
             // arr time exchanged
         }
     }
 }
    
return (flightList);    
}   
    public static void main(String[] args)throws FileNotFoundException,IOException{
     
      FlightManager myFlightManager = new FlightManager();
      FileInputStream fstream = new FileInputStream("D:\\5th sem\\Object Oriented Programming using JAVA\\Lab6\\Q3\\src\\silkair.csv");
 
	//Construct BufferedReader from InputStreamReader
      BufferedReader brstream = new BufferedReader(new InputStreamReader(fstream));
        
	String line = brstream.readLine();
        int k=0;
	line = brstream.readLine();
        line = brstream.readLine();
        line = brstream.readLine();
        line = brstream.readLine();
        while ((line = brstream.readLine()) != null ) {
	
            line = brstream.readLine();
            myFlightManager.flightList[k] = new Flight();
            myFlightManager.flightList[k] = myFlightManager.readLine(line,k);
            k++;
    }
    myFlightManager.flightList = myFlightManager.sortFlight(myFlightManager.flightList);
    brstream.close(); 
    FileWriter fwStream = new FileWriter("sort.silkair.csv");
    BufferedWriter bwStream = new BufferedWriter(fwStream);
    PrintWriter pwStream = new PrintWriter(bwStream);
    pwStream.println("Effective 29 March 2015 to 24 October 2015||| \n");
    pwStream.println("To Singapore from:||| \n");
    pwStream.println("Sector|Days|Flight|Dep/Arr (Local Time) \n");
    for (int i=0; i<8; i++)
    { 
        pwStream.println(myFlightManager.flightList[i].getDepCity()+"|"+myFlightManager.flightList[i].getDaysOfWeek()+"|" + myFlightManager.flightList[i].getFlightNum()+"|"+myFlightManager.flightList[i].getDepTime()+"/"+myFlightManager.flightList[i].getArrTime()+"\n");
    
    }
    pwStream.close();   
    System.out.println("The silkair.csv has been sorted according to the flight number and stored in sort.silkair.csv.. \n");
    System.out.println("Contents of sort.silkair.csv\n");
  fstream = new FileInputStream("sort.silkair.csv");
brstream = new BufferedReader(new InputStreamReader(fstream));
  
    String line1 = brstream.readLine();
     do {
         System.out.println(line1);
	  line1 = brstream.readLine();  
    }while(line1!=null);
    brstream.close();
    }  
}
    
    
    
    
    
    
    
    
    
    

