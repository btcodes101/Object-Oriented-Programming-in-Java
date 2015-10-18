
/*
 *This class gives the quadrant number in which a given point lies.
 * @author Bhaskar Tejaswi
 */
import java.util.Scanner;
public class QuadrantNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate :");
        double x = sc.nextDouble();					// store x-coordinate in variable x
        System.out.println("Enter the y co-ordinate :");
        double y = sc.nextDouble();					// store y-coordinate in variable y
        if(x==0 && y==0)
        {
             System.out.println("It is the origin");				// special case  of origin
        }
        else                                        						// display relevant quadrant
                if((x>0 && y>0) ||(y==0 && x >0)||(x==0 && y >0))  
                System.out.println("quadrant 1");
        else
                if((x<0 &&y>0)||(y==0 && x <0))
                System.out.println("quadrant 2");
        else 
                if ((x<0 && y<0)||(y<0 && x == 0))
                System.out.println("quadrant 3");
        else
                System.out.println("quadrant 4");

    }
}
