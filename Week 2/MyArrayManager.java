
/**
 *
 * @author Bhaskar Tejaswi
 */

import static java.lang.System.exit;
import java.util.*;
public class MyArrayManager
{
   static int topOfArray=1;
    /**
     * Main function
     * @param args 
     */
    public static void main(String[] args)
    {
        int choice;
        int[ ] array = new int[11];
        
        Scanner sc = new Scanner(System.in);
        // create a Scanner object here

        do {
                System.out.println("Perform the following methods:");
                System.out.println("1: initialize");
                System.out.println("2: insert");
                System.out.println("3: remove");
                System.out.println("4: display");
                System.out.println("5: quit");
                choice = sc.nextInt();
                // read user input
                    switch (choice)
                    {
                            case 1: initialize(array);
                            break;
                                
                            case 2: 
                                System.out.println("Enter the number to be inserted");
                                int ins = sc.nextInt();
                                insert(array,ins);
                            break;
                                
                            case 3: 
                                System.out.println("Enter the number to be deleted");
                                int val = sc.nextInt();
                                remove(array,val);
                            break;
                                
                            case 4: 
                                display(array);
                            break;
                                
                            case 5: 
                                System.out.println("Program terminating ….");
                                exit(0);
                            break;
     
                            default: System.out.println("Invalid Input!");
                            break;
                    }
            } while (choice != 5);
    }
    /**
     * initialize() function 
     * initialize the array and sort it
     * @param ar 
     */

    public static void initialize(int[] array){
    System.out.println("Initialize the array... enter 10 elements");
    Scanner sc = new Scanner(System.in);
    
    for(int i=1;i<11;i++)
    {
   System.out.println("enter an element");
        int num = sc.nextInt();
        insert(array,num);
    }
}
        /**
         * insert() function
         * insert the number n into the array .
         * show error message if array is full
         * @param array
         * @param n 
         */
        public static void insert(int[] array, int n)
        {   
           sort(array);
            if(array[0]==10)
            {
                    System.out.println("Array already full!!");
            }
            else
            {
                    array[array[0]+1] = n;
                    array[0]++;             /*increment the no of integers in the array by 1*/
                    System.out.println("Inserted Successfully!");
            }
            sort(array);
        }

        /**
         * remove() function
         * remove the first appearance of the number n from the array ar.
         * the method should issue an error message if array is empty
         * @param array
         * @param n 
         */
        public static void remove(int[] array, int n)
        {
             int flag=0,pos=0;
            if(array[0]==0)
            {
                System.out.println("The array is empty !");
            }
            else
            {

                for(int i=1;i<=array[0];i++)
                {
                    if(array[i]==n)
                    {
                            flag = 1;
                            pos = i;
                            break;

                                                   /*we need to remove first occurance only*/
                    }
                }
                if(flag==0)                          
                System.out.println("No occurance of number found..");
                else{
                    System.out.println("The number "+array[pos]+" has been succesfully deleted!");
                            for(int j=pos;j<array[0];j++)
                                {
                                    array[j] = array[j+1];            
                                }      

                    array[0]--;
                

                }
            } 
        }
        /**display function
         * print the numbers stored in array
         * @param array
         */
        public static void display( int[] array)
        {

            for(int i=1;i<=array[0];i++){
                System.out.println(array[i]);
            }
        }
        /**sort function
         * This method sorts the array in ascending order using bubble sort algorithm
         * @param array 
         */
        public static void sort(int[] array)
        {
                 for(int i=1;i<=array[0];i++)
                {
                    for(int j=1;j<=array[0]-1;j++)
                    {
                        if(array[j]>array[j+1])
                        {
                            int temp = array[j];
                            array[j] = array[j+1];
                            array[j+1] = temp;
                        }        
                    }
                }

            }
        }   //close for class