import java.util.Scanner;
public class FunWithNumbers
{
	public static void main(String[] args) 
		{
		int myInt1,myInt2,sum,squareOfSum;
		System.out.println("Hello Java !");
 		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number :");
	        	myInt1 = sc.nextInt();
        		System.out.println("Enter second number :");
		myInt2 = sc.nextInt();
		sc.close();

		sum = myInt1+myInt2;
		squareOfSum = sum*sum;
        		System.out.println("The sum is  is " + sum);
System.out.println("The sqaure of sum is  is " + squareOfSum );
		}
}
