/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhaskar Tejaswi
 */
public class MyValidator {
    public int validateNumbers(float num) throws NegativeNumberException
    {
    
        if(num<0){
            throw new NegativeNumberException(num);
        }
        else
            return 1;  
    } 
}
