/*
 *This class finds out which category of movie fans does the user belongs to.
 * @author Bhaskar Tejaswi
 */
import java.util.Scanner;
public class MovieFan {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        String ch = sc.next();
        if(ch.length()>1)   //checking for valid input
            {
             System.out.println("You have entered more than one character !");
            }
        else
        {
        char choice = ch.charAt(0);//a character stored as choice
        if ((choice=='A' || choice=='a'))
            System.out.println("Action movie fan \n");
        else if((choice=='C' || choice=='c')) 
            System.out.println("Comedy movie fan \n");                
        else if((choice=='C' || choice=='c'))
            System.out.println("Comedy movie fan \n");
        else
            System.out.println("Invalid choice \n");

        }   
    }   
}
