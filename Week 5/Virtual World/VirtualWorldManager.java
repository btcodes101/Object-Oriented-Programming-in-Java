/**
 * 
 * @author Bhaskar Tejaswi
 */
public class VirtualWorldManager {
    public static void main(String args[]){
    Person person1 = new Person();
    Auto auto1 = new Auto();
    Car car1 = new Car();
    Bicycle bicycle1 = new Bicycle ();
    Student student1  = new Student();
    CSEStudent csestudent1  = new CSEStudent();
    person1.move(1,"forward");
    auto1.honk();   
    auto1.move(0.2,"backward");
    auto1.honk();   
    bicycle1.move(5,"forward");
    student1.move(0.5,"forward");
    csestudent1.move(2,"backward");
    car1.honk();
    car1.honk();
    car1.move(10,"forward");
    }
}
