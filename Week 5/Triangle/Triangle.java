/**
 *
 * @author Bhaskar Tejaswi
 */
public class Triangle extends Shape implements Comparable <Triangle>{
    private int base;
    private int height;

    Triangle(int base,int height){
    this.base=base;
    this.height=height;
    }
    

     public void show(){
     System.out.println("Base is "+base + " height is "+ height+ " and area is "+ getArea());
     }
  
     public double getArea(){
          return 0.5*base*height;
     }
 
     public int compareTo(Triangle myTriangle){
         
     if(myTriangle.getArea()>this.getArea())
         return +1;
     else if(myTriangle.getArea()<this.getArea())
             return -1;
     else 
           return 0;
     }
}

