import java.util.Scanner;
import java.lang.*;
public class AddClassProg{
      public static void main(String[] args)  {
		int myInt1,myInt2;
		float myFloat1,myFloat2;
		String myString1,myString2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers ");
		 myInt1 = sc.nextInt();
		 myInt2 = sc.nextInt();
		System.out.println("Enter two float values ");
		 myFloat1 = sc.nextFloat();
		 myFloat2 = sc.nextFloat();
		System.out.println("Enter two strings ");
		myString1 = sc.next();
		myString2 = sc.next();
		sc.close();
		float ans = add(myInt1,myInt2,myFloat1,myFloat2,myString1,myString2);
		System.out.println("Sum is  "+ans);			
              }
	public static float add(int a,int b,float c,float d,String e,String f)
              {		
			float x  = Float.parseFloat(e);
			float y  = Float.parseFloat(f);
			float sum = a+b+c+d+x+y ; 
			return (sum);
	 } 
