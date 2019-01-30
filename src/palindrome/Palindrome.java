
package palindrome;

import java.util.Scanner;


public class Palindrome {

    /**
    new random comment added
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        
//        System.out.println(input.toString());
        
        System.out.println("Enter the String to check");
        
        String userInput = input.nextLine();
        
        StringBuilder toCheck = removeInvalidCharacters(userInput);
        
        // have to create a New StringBuilder
        StringBuilder reversed = new StringBuilder(toCheck.toString());

        // If we do this, both reversed and toCheck will point to the
        // same instance! Use the debugger to check it out.
        // StringBuilder reversed = toCheck.reverse();
             
        reversed.reverse();
        
        if (toCheck.toString().equals(reversed.toString())) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a Palindrome!");
            
        }
        
    }

    private static StringBuilder removeInvalidCharacters(String userInput) {
    
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < userInput.length(); i++) {
        
            char toTest = userInput.charAt(i);
            
            if (Character.isLetterOrDigit(toTest)){
            
                builder.append(toTest);
            
            }      
        }
        
        System.out.println("invlaid chars removed: " + builder);
        return builder;
    }

}
