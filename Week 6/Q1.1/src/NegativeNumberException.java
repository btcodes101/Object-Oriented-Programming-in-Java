/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IEM
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
