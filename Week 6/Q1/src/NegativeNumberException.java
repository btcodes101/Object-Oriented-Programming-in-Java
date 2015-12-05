/**
 *
 * @author Bhaskar Tejaswi 
 */
public class NegativeNumberException extends Exception{
    float negNum;
    NegativeNumberException(float num){
    negNum = num;
    }
    @Override
    public String getMessage()      
    {
        return("Negative Number found -->"+negNum);
    }
}
