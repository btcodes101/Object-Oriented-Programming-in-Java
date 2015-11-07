/**
 *This class simulates an IFCS Manager
 * It allows user to add, remove or search equipments..
 * User can also get a list of all Equipments in the Lab
 * @author Bhaskar Tejaswi
 */
import java.io.*;
import java.util.*;
public class IFCSManager {
   
    Equipment equip[] = new Equipment[100];
    int pointer=0;/* we want all instances of manager to have same content of pointer*/
  /**
   * Add an Equipment by this function
   */
   public void add()
   { 
               Scanner sc = new Scanner(System.in);
               
                                    int flag=0;
                                    
                                    System.out.println("Enter Id :");                    
                                    String idEq = equip[pointer].getId();
                                    
                                    System.out.println("Enter Description :");
                                    String desc = equip[pointer].getDesc();
 
                                int f=0,choice;  
                                for(int i=0;i<pointer;i++)
                                {     
                                if(equip[i].id.equals(idEq))
                                {
                                    f=1;
                                    break;
                                }
                             }
    
                                    if(idEq==null)
                                    {
                                    System.out.println("Id cannot be null");
                                    }
                                    
                                    else if (desc=="")
                                    {
                                    System.out.println("Description cannot be null");
                                    }
                                    
                                    else if(idEq =="" && desc=="")
                                    {
                                    System.out.println("Neither Description nor id can be null");
                                    }
                                    else if(f==1){
                                    System.out.println("Equipment already exists!");
                                    }
                                    else
                                    {
                                    equip[pointer].id = idEq;
                                    equip[pointer].description = desc;
                                    pointer++;   /**no of equipments incremented by 1 */
                                    
                                    System.out.println("Equipment insertion complete");
                                    }
                                }
   /**
    * Remove an Equipment by this function
    * @param idEq 
    */
    public void remove(String idEq){
                            int flag=0,pos=0;
                                for(int i=0;i<pointer;i++)
                                {
                                   
                                if(equip[i].id.equals(idEq))
                                {
                                    equip[i].description = null;   /* object set to null*/
                                    equip[i].id = null;   /* object set to null*/
                                    
                                    flag=1;
                                    pos=i;
                                    break;
                                }
                             }
                                if(flag==0)
                                    System.out.println("Equipment with id "+idEq+" cannot be found");
                              
                                else
                                {
                                   for(int j=pos;j<pointer-1;j++)
                                   {  
                                    equip[j].description = equip[j+1].description;  
                                    equip[j].id = equip[j+1].id;                                    
                                   }    
                                   System.out.println("It was found and removed");        
                                    equip[pointer-1].description = null;   /* object set to null*/
                                    equip[pointer-1].id = null;   /* object set to null*/
                                   
                                   pointer = pointer-1;
                                }
                            }
    /**
     * Display list of Equipments 
     */
    public void show(){
        if(pointer==0){System.out.println("There are no equipments in the Lab");}else{
           for(int i=0;i<pointer;i++){
                                if(equip[i]!=null)
                                {
                                System.out.println("id = "+equip[i].id + " Description = "+equip[i].description);
                                }
                                }
        }
    }
    
    /**
     * Search for an Equipment using Equipment Id.
     * @param idEq 
     */
    public void search(String idEq){
                                 int flag=0,pos=0;  
                               for(int i=0;i<pointer;i++)
                                {     
                                if(equip[i].id.equals(idEq))
                                {
                                    flag=1;
                                    pos=i;
                                    break;
                                }
                             }
                                if(flag==0)
                                    System.out.println("Equipment not found!");
                                else
                                {
                                    System.out.println("ID = "+equip[pos].id);
                                    System.out.println("Description = "+equip[pos].description);
                                    
                                }
                                    
    }
    
    /**
     * Main function
     * @param args 
     */
    public static void main(String[] args){
    
    IFCSManager Manager = new IFCSManager();
    Scanner sc  = new Scanner(System.in);
    for(int i=0;i<100;i++)
    {
        Manager.equip[i]= new Equipment("","");
    }
    int choice;
   do {
                System.out.println("Perform the following methods:");
                System.out.println("1: Add an Equipment");
                System.out.println("2: Remove");
                System.out.println("3: Search");
                System.out.println("4: Display");
                System.out.println("5: Quit");
                choice = sc.nextInt();
                
                /* read user input */
                    switch (choice)
                    {
                             case 1:       /*add equipment**/  
                             Manager.add();
                             break;
                              
                            case 2: /*remove equipment*/
                            
                            System.out.println("Enter the id of the equipment you want to remove :");
                            String idEq;int flag=0,pos=0;
                            idEq = sc.next();
                            if(idEq=="")
                            {
                              System.out.println("Id cannot be null");
                            }
                            else
                            {                   /* id is valid */
                            Manager.remove(idEq);
                            }
                            break;
                                
                            case 3:
                                System.out.println("Enter id to search");
                                String id = sc.next();
                                if(id=="")
                                    System.out.println("Eq ID cannot be null!");
                                else
                                    Manager.search(id);
                                                        
                            break;
                                
                            case 4: /*display inventory*/
                                    Manager.show();
                            break;
                                
                            case 5: /*exit*/
                                System.out.println("Program terminating ….");
                            break;
     
                            default: System.out.println("Invalid Input!");
                            break;
                    }
            } while (choice != 5);
    System.out.println("Thank You!");
    }
    
}
