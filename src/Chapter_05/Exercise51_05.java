/*
 *5.51 (Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings.
 */
package Chapter_05;

import java.util.Scanner; // Import the Scanner class

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise51_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        //Prompt the user to enter the first string:
        System.out.print("Enter the first string: ");
        
        String s1 = input.nextLine();
        
        //Prompt the user to enter the second string:
        System.out.print("Enter the second string: ");
        
        String s2 = input.nextLine();
        
        String s = "";
        
        String longestCommonPrefix = "";  // Initialize the longest common prefix
        
        for(int n = 0; n < s1.length(); n++) {
            for(int i = 0; i < s2.length(); i++) {
                s = "";
                while(s1.charAt(n) == s2.charAt(i)){
                    s += s2.charAt(i);
                    if(n < s1.length() - 1 && i < s2.length() - 1) {
                        n++;
                        i++;
                    }
                    else break;
                }
                if(longestCommonPrefix.length() < s.length()) 
                    longestCommonPrefix = s;
            }   
        }
        
        // If no common prefix between them
        if(longestCommonPrefix.length() == 0)
            System.out.print(s1 + " and " + s2 + " have no common prefix");
        
        // Otherwise display the longest common prefix
        else
            System.out.print("The common prefix is " + longestCommonPrefix);
    }
    
}
