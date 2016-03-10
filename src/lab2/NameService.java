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
        int wordBreak=0;
        char space = ' ';
        // Your code goes here. Assign your value to lastName
        for(int i = 0; i<fullName.length();i++){
            if(fullName.charAt(i) == space || fullName.charAt(i) == '_'){
                wordBreak = i;
            }
        }
        if(wordBreak==0){
            throw new IllegalArgumentException("Please use the perscribed format"
                    + " of first last or use the format: first_last");
        }
        lastName = fullName.substring(wordBreak);
        return lastName;
        
    }
    

    
    
}
