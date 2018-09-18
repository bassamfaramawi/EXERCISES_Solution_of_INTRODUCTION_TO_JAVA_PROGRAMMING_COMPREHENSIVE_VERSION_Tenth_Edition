/*
*5.9 (Find the two highest scores) Write a program that prompts the user to enter 
the number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise09_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int studentsNumber = input.nextInt();
        
        // Initialize the name of the 1st and 2nd score students
        String highestName = "",  
                secondHighestName = "";  
        // Initialize the 1st and 2'nd scores
        double highestScore = 0,
                secondHighestScore = 0;
        
        for(int n = 1; n <=studentsNumber; n++) {  // Loop for students scores
            System.out.print("Enter the name of student no." + n + ": ");
            String studentName = input.next();
            System.out.print("Enter the student score: ");
            double studentScore = input.nextDouble();
            
            // Determine the 1st and 2nd highest score student
            if(studentScore > highestScore && studentScore > secondHighestScore) {  
                secondHighestName = highestName;
                secondHighestScore = highestScore;
                
                highestName = studentName;
                highestScore = studentScore;
            }
            else if(studentScore > secondHighestScore) {
                secondHighestName = studentName;
                secondHighestScore = studentScore;
            }
        }
        
        // Display the result
        System.out.println("The student with the highest score is " + highestName 
                + " with score = " + highestScore);
        
        System.out.println("The student with the second highest score is " + 
                secondHighestName + " with score = " + secondHighestScore);
    }
    
}
