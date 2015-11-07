/**
 *
 * @author Bhaskar Tejaswi
 */
public class Shape {   
    String name="";   
   
    Shape(String name)
    {
        this.name = name;
        System.out.println("Constructor of Shape");
    }
    void printDescription(){
        System.out.println("I am a shape and my name is "+name);
    }
}

