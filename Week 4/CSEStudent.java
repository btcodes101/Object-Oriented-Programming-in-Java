/**
 *
 * @author Bhaskar Tejaswi
 */
public class CSEStudent extends Student{
    
    public final String hobby= "Hacking";
    
    CSEStudent(String name)
    {
        super(name);
    }
  
    public void introduce(){
       System.out.println("Hello my name is "+retName() +" and my hobby is "+hobby);
    }
    public void onFacebook(){
        super.introduce();
    }
    public void isHacker(){    
            introduce();
    }
    public void isReader(){
            super.isReader();
    }
}