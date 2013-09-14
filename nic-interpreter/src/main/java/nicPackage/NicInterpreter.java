/*
 P.M.I.Chamara
 * 110067U
 */

package nicPackage;
import org.joda.time.*;
import nicPackage.InvalidNicException;

public class NicInterpreter {
    
   private String nicNo;
   private int year;
   private int month;
   private int day;
   private int numOfDays;
   //private String gender;
   private boolean isMale;
   private boolean isVoter;
   DateTime currentDate;
   
   
    public NicInterpreter(String nicNum)throws InvalidNicException {
        this.nicNo = nicNum;
      
        year = Integer.parseInt(nicNum.substring(0,2))+ 1900;
        numOfDays = Integer.parseInt(nicNum.substring(2,5));
        
         if(numOfDays>=500){
             //gender = "Female";
            isMale=false;
            numOfDays=numOfDays-500;
        }else{
            isMale=true;
            //gender = "Male";
        }
        
        currentDate = new DateTime();
        
        DateTime dt = new DateTime(2012,1,1,0,0,0);
        dt = dt.plusDays(numOfDays-1);
        month=dt.getMonthOfYear();
        day=dt.getDayOfMonth();
        DateTime bDay = new DateTime(year,month,day,0,0,0);
        
        
        if (bDay.plusYears(18).compareTo(currentDate)<0){
            isVoter=true;
        }
        else{
            isVoter=false;
        }
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDate(){
        return day;
    }
    
    public String getGender(){
        if(isMale){
            return "Male";
        }else 
            return "Female";
    }
    
    public String isVoter(){
        if(isVoter){  return "True";}        
        else{
            return "False";
        }
    }
}
