package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException{
        String lastName = null;
        
        // write your code here to extract the lastName and store in the
        // above local variable
        if(fullName == null || fullName.isEmpty() || fullName.split(" ").length < 2){
            throw new IllegalArgumentException("Sorry Full name must contain both first name and last name");
        }
        String[] parts = fullName.split(" ");
        lastName = parts[parts.length];
        return lastName;
        
    }
    

    
    
}
