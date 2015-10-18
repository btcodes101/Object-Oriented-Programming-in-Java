
/*
* This class evaluates the Grade of an employee according to salary and merit
* @author Bhaskar Tejaswi
*/
import java.util.Scanner;
public class GradeEvaluation {
   public static void main(String[]args)
   {
        System.out.println("Enter your salary :");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();					// take salary as input
        String Grade = "";             						// string to store grade 
        if(salary>899 || salary<500)  					//checking for valid salary input
            System.out.println("This salary does not exist in company's salary scheme :");
        else
               {
                  System.out.println("Enter your merit point :");
                  double meritPoint = sc.nextDouble();
                       if(meritPoint<0 || meritPoint>100)				//checking for valid merit
                        System.out.println("Invalid Merit !");
                       else
                       {
                           if(salary>=500 && (salary<=600))
                           {
                               Grade = "Grade C";    
                           }
                           else if(salary>=601 && salary<=649)
                           {
                               if(meritPoint<10)
                               Grade = "Grade C"; 
                               else
                               Grade = "Grade B";
                           }    
                           else if(salary>649 && salary<=700)
                               {
                               Grade = "Grade B";
                               }
                           else if(salary>700 && salary<=799)
                           {
                               if(meritPoint<20)
                               Grade = "Grade B"; 
                               else
                               Grade = "Grade A";
                               
                           }
                           else
                               Grade = "Grade A";
                       }   
                      System.out.println(Grade); //display the grade
                    }         
               }
   }       
