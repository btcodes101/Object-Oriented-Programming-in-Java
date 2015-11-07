/**
 *
 * @author Bhaskar Tejaswi
 */
import java.util.*;
public class StudentManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        CSEStudent Arif = new CSEStudent("Arif");
         do {
                System.out.println("Where is "+Arif.retName()+" ?");
                System.out.println("1: At a get-together for student leaders");
                System.out.println("2: At a closed-door Hacker Society meeting");
                System.out.println("3: At his cousin's birthday party");
                System.out.println("4: Quit");
                choice = sc.nextInt();

                switch (choice)
                {
                case 1: Arif.onFacebook();
                break;
                case 2: Arif.isHacker();
                break;
                case 3: Arif.isReader();
                break;
                case 4: System.out.println("Program terminated");
                break;
                default: System.out.println("Invalid choice");/* add error handling */
                break;
                }
                    } while (choice != 4);
         System.out.println("Thank You!");
    }
}
