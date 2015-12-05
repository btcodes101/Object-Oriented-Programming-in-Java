/**
 *
 * @author Bhaskar Tejaswi
 */
public class MyValidator {
    public int validateNumbers(float num) 
    {
        if(num<0){
            System.out.println("Negative number found-->"+num);
            return -1;
        }
        else
            return 1;  
    } 
}
