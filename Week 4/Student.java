/**
 *
 * @author Bhaskar Tejaswi
 */
public class Student extends Person{
    public final String hobby= "surfing Facebook";
    Student(String name)
    {
        super(name);
    }
    public void introduce(){
        System.out.println("Hello my name is "+retName() +" and my hobby is "+hobby);
    }
    public void isReader(){
        super.introduce();
    }
}
