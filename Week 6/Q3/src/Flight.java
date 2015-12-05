/**
 *
 * @author Bhaskar Tejaswi
 */
public class Flight {
    private String depCity;
    private String daysOfWeek;
    private String flightNum;
    private String depTime;
    private String arrTime;
    
    public void setDepCity(String depCity){
    this.depCity = depCity;
    }
    public void setDaysOfWeek(String daysOfWeek){
    this.daysOfWeek = daysOfWeek;
    }
    public void setFlightNum(String flightNum){
    this.flightNum = flightNum;
    }
    public void setDepTime(String depTime){
    this.depTime = depTime;
    }
    public void setArrTime(String arrTime){
    this.arrTime = arrTime;
    }
    
    public String getDepCity(){
        return depCity;
    }
    public String getDaysOfWeek(){
    return daysOfWeek;
    }
    public String getFlightNum(){
    return flightNum;
    }
    public String getDepTime(){
    return depTime;
    }
    public String getArrTime(){
    return arrTime;
    }
    
    
    
}
