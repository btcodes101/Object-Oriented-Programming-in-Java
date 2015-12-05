/**
 *This class takes in 4 floating point numbers,
 *arranges them in ascending order
 *prints the numbers upto 2 decimal places
 *and computes and displays the sum of numbers(upto 2 decimal places)
 * 
 * @author bhaskar tejaswi
 */
import java.io.*;
import java.lang.Double;
import java.util.Scanner;
public class Q1 {
    
 /**
  * Main function of the class Numbers
  * @param args 
  */
    
    public static void main(String[]args)
    {
        double[] arrNums = new double[4];
        double temp,sumRes=0;
        int i=0,j=0;
       
        System.out.println("Enter 4 float point numbers :");
        
        Scanner sc = new Scanner(System.in);
        for(i=0;i<4;i++)
        {
         arrNums[i] = sc.nextDouble();       //Accept 4 float numbers from user 
        }
        sc.close();
        
        /* Now we have to arrange the numbers in ascending order using Bubble Sort
        and compare function
        */
        for(i=0;i<4;i++)
        {
            for(j=0;j<3;j++)
            {
                if(Double.compare(arrNums[j],arrNums[j+1])>=0)
                {
                    temp = arrNums[j];
                    arrNums[j] = arrNums[j+1];
                    arrNums[j+1] = temp;
                }        
            }
        }
        /*Print the numbers in ascending order */
        System.out.print("Sorted Numbers :");
            
            for(i=0;i<4;i++)
            {
                         System.out.print(arrNums[i] + "\t");
            }
    
        System.out.print("\nSorted Numbers upto 2 decimal places : ");
        /*Print the numbers, correct to 2 decimal places */        
        for(i=0;i<4;i++)
        {
                     System.out.format(" %.2f ",arrNums[i]);
        }
    
        sumRes = Double.sum(arrNums[0],arrNums[1]);
        sumRes = Double.sum(arrNums[2],sumRes);
        sumRes = Double.sum(arrNums[3],sumRes);
        
    /*Print the sum of numbers, correct to 2 decimal places */      
    System.out.print("\nSum is ");        
                    System.out.format(" %.2f ",sumRes);
    System.out.print("(correct upto 2 decimal places) ");        
    }  
}/*6.89823, 2999999.000000001*/
    