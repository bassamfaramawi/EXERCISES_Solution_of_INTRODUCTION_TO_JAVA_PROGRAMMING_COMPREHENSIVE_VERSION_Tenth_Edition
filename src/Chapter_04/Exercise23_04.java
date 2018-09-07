/*
 *4.23 (Financial application: payroll) Write a program that reads the following 
information and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 9.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)
 */
package Chapter_04;

import java.util.Scanner;  // Create a Scanner object

/**
 *
 * @author Administrator
 */
public class Exercise23_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Create Scanner object
        
        // Prompt the user to enter Employee’s name,
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        
        // Number of hours worked in a week,
        System.out.print("Number of hours worked in a week: ");
        double weeklyHours = input.nextDouble();

        // Hourly pay rate,
        System.out.print("Hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        
        // Federal tax withholding rate,
        System.out.print("Federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        
        // And State tax withholding rate
        System.out.print("State tax withholding rate: ");
        double stateTax = input.nextDouble();
        
        // Calculate Gross Pay,
        double grossPay = weeklyHours * hourlyPayRate;
        
        //Federal Withholding,
        double federalWithholding = grossPay * federalTax;
        
        // State Withholding,
        double stateWithholding = grossPay * stateTax;
        
        // Total Deduction,
        double totalDeduction = federalWithholding + stateWithholding;
        
        // And Net Pay
        double netPay = grossPay - totalDeduction;

        // Display the results
        System.out.print("\nEmployee Name:" + name +
                "\nPay Rate: $" + hourlyPayRate +
                "\nGross Pay: $" + grossPay +
                "\nDeductions:" +
                "\n  Federal Withholding (20.0%): $" + federalWithholding +
                "\n  State Withholding (9.0%): $" + stateWithholding +
                "\n  Total Deduction: $" + totalDeduction +
                "\nNet Pay: $" + netPay);
    }
}
