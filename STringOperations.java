// import java.util.*;
public class STringOperations {
    public static void main(String[] args) {
        String str1 = "Hello World ____ Hello World";
        String str2 = new String("Harry");
        System.out.println("str1 : "+str1); // Hello World
        System.out.println("str2 : "+str2); // Harry

        // Length of the String
        System.out.println("Length of the given string is : " + str1.length());

        // To Lower Case
        System.out.println("String to Lower case : " + str1.toLowerCase());

        // To Upper Case
        System.out.println("String to Upper Case : " + str1.toUpperCase());

        // Trim : Removes extra whitespace  
        System.out.println("Trimmed String : " + str1.trim());

        // SubString with Beginning Index only
        System.out.println("SubString from the beginning index : " + str1.substring(3));

        // SubString with both Beginning and Ending Index 
        System.out.println("Substring form the beginning to the ending index : " + str1.substring(2,8));

        // Replace of the selected elements in the string
        System.out.println("Replacing single character from the string : " + str1.replace('l', 'r'));
        System.out.println("Replacing a substring from the string : " + str1.replace("llo", "ro"));

        // check whether the string starts with the given string
        System.out.println("String starts with : " + str1.startsWith("Hell"));    //True
        
        // check whether the string ends with the given string
        System.out.println("String ends with : " + str1.endsWith("lds"));   //False

        // gives the character vakue at the given index
        System.out.println("Character at the index : " + str1.charAt(6));     //W

        // gives the Starting index of the given Sub-string if the Sub-string is present in the String 
        // returns    -1    if string is not present 
        System.out.println("Starting Index of the Substring from beginning" + str1.indexOf("World"));

        // returns the Starting index of the given substring if present. Searched after the index given 
        System.out.println("Starting index of the SubString from beginning -- after the index" + str1.indexOf("Wor", 11));    //23

        // returns the last index of the given substring if present.
        System.out.println("Starting index of the Substring from the end : " + str1.lastIndexOf("Wor"));      //9</s>

        // returns the last index of the given substring if present. Searched after the given index
        System.out.println("Starting index of the Substring from the end -- after the index : " + str1.lastIndexOf("Wor", 11)); 

        // check whether the string is equal to another string or not 
        // returns true or false
        System.out.println("Are string1 and String2 equal?? : " + str1.equals(str2));

        // check whether the string is equal to another string or not ignoring the case 
        // returns true or false
        System.out.println("Are string1 and String2 equal -- ignoring the case ?? : " + str2.equalsIgnoreCase("haRRy"));

    }
}
