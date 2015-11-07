/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class simulates an Equipment 
 *
 * @author Bhaskar Tejaswi
 */
import java.util.*;

public class Equipment {

    public String id;
    public String description;
  
    public Equipment(String eqId,String desc){
      
        id = eqId;
        description = desc;
    }
    
    public String getId()
    {/*return id and description to IFSC manager, then, IFSC manager initialises the id and description
        by these returned values*/    
       Scanner sc = new Scanner(System.in);
       String idEq =  sc.next();
       return idEq;
    }
    
    public String getDesc(){
    
        Scanner sc = new Scanner(System.in);
        String desc = sc.next();
        return desc;
    }
    
    
    
}
