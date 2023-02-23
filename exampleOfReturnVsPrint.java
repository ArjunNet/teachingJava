// Question: Write a program, which has a function in it which converts all characters in a String to uppercase.
// Don't use any inbuilt String library functions related to uppercase and lowercase.
// Convert 2 Strings entered by the user to uppercase.

import java.util.Scanner; // Importing in the Scanner class so we can use it to take input.

public class exampleOfReturnVsPrint {
    public static void stringToUppercaseAndDisplay(String init) {
        // This function converts the given String to uppercase and displays it.
        
        String result = ""; // This stores the final value of the string after we have converted it to uppercase.
        
        for(int i = 0; i < init.length(); i++) {
            char ch = init.charAt(i); // This variable stores one character at a time and converts that character to uppercase.
            ch = Character.toUpperCase(ch);
            
            result = result.concat(String.valueOf(ch));
        }
        
        System.out.println("converted String to uppercase: " + result);
        
        // Here the System.out.println function displays the result to the user. But since there is no return function no value is sent back to the caller function and the caller function can't perform any more operations on the value.
    }
    
    public static String stringToUppercaseAndReturn(String init) {
        // This function converts the given String to uppercase and returns it back to the caller function.
        
        String result = ""; // This stores the final value of the string after we have converted it to uppercase.
        
        for(int i = 0; i < init.length(); i++) {
            char ch = init.charAt(i); // This variable stores one character at a time and converts that character to uppercase.
            ch = Character.toUpperCase(ch);
            
            result = result.concat(String.valueOf(ch));
        }
        
        return result; // Returns the value specified back to the caller function so its can perform opertations on it.
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String which will be converted to uppercase.");
        String str1 = sc.nextLine(); // This will store the String entered by the user into the variable str.
        
        String str1result = stringToUppercaseAndReturn(str1); // This stores the value returned by the function.
        System.out.println("converted String to uppercase: " + str1result); // Here the value returned by the function is printed.
        
        /*
         * Therefore when a function returns some value that value is passed back to the caller function.
         */
        
        System.out.println("Enter a String which will be converted to uppercase.");
        String str2 = sc.nextLine(); // This stores the second String entered by the user.
        
        stringToUppercaseAndDisplay(str2); // See here there is no variable that stores the value returned by the function as it is declared as a function that returns "void" which basically means nothing. public static "void".
        
        /*
         * Therefore when a function performs a system.out.println() all that happens is the value is shown to the user on the screen but it is not passed back to the caller function.
         * 
         * Only when a return statement is present a value is sent back to the caller function.
         */
        
    }
}
