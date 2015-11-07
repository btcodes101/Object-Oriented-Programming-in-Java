/**
 *
 * @author Bhaskar Tejaswi
 */
import java.util.*;
public class Person {
    Scanner sc = new Scanner(System.in);
    public final String hobby = "Reading";
    private String name;
    public Person(String name)
    {
        this.name = getName();        
    }
    public String getName(){   
        System.out.println("Enter name:");
        name = sc.next();
        return name;
    }
    public String retName(){
        return name;
    }

    /**
     *
     */
    public void introduce(){
    System.out.println("Hello my name is "+name +" and my hobby is "+hobby);
    }
}
