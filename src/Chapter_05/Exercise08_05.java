/*
5.8 (Find the highest score) Write a program that prompts the user to enter the 
number of students and each student’s name and score, and finally displays the 
name of the student with the highest score.
 */
package Chapter_05;

/**
 *
 * @author Administrator
 */
import java.util.Scanner; // Import the Scanner class

public class Exercise08_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        //Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int studentsNumber = input.nextInt();
        
        String highestName = "";  // Initialize the name of the highest student score
        double highestScore = 0;  // Initialize it's score
        
        for(int n = 1; n <=studentsNumber; n++) { // Loop for students scores
            System.out.print("Enter the name of student no." + n + ": ");
            String studentName = input.next();
            System.out.print("Enter the student score: ");
            double studentScore = input.nextDouble();
            
            if(studentScore > highestScore) {  // Determine the highest score student
                highestName = studentName;
                highestScore = studentScore;
            }
        }
        
        // Display the result
        System.out.println("The student with the highest score is " + highestName 
                + " with score = " + highestScore);
    }
    
}
