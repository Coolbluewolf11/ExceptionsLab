package lab0;
import java.lang.IllegalArgumentException;
/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private int minNameLength = 2;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        try{
            setFirstName(firstName);
        }catch(IllegalArgumentException e){
            
        }
        try{
            setLastName(lastName);
        }catch(IllegalArgumentException e){
            
        }
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    // Days Vacation cannot be less than 0
    public void setDaysVacation(int daysVacation) {
        if(daysVacation<0){
            throw new IllegalArgumentException("Please tell me that they didn't"
                    + " make extra days in the year to force you to have "
                    + "negative vacation days");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
    
    //firstName cannot be null or empty
    // At least 2 letters long
    public final void setFirstName(String firstName) {
       if(firstName == null || firstName.isEmpty() || firstName.length()<minNameLength){
           throw new IllegalArgumentException("The first name must have at least to letters and not be null");
       }
       this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
       if(lastName == null || lastName.isEmpty() || lastName.length()<minNameLength){
           throw new IllegalArgumentException("The last name must have at least to letters and not be null");
       }
       this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        //Find a social security number validator
        this.ssn = ssn;
    }
    
    
    
}
