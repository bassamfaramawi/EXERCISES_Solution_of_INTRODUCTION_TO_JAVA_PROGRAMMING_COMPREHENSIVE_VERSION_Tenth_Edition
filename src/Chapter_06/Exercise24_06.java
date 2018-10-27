/*
 **6.24 (Display current date and time) Listing 2.7, ShowCurrentTime.java, 
displays the current time. Improve this example to display the current date and 
time. The calendar example in Listing 6.12, PrintCalendar.java, should give you 
some ideas on how to find the year, month, and day.
 */
package Chapter_06;

/**
 *
 * @author BASSAM FARAMAWI / tiodaronzi3@yahoo.com
 */
public class Exercise24_06 {

    public static void main(String[] args) {
        System.out.print("The current date and time: " + currentTime() + " - " + 
                currentDate());
    }
    
    public static String currentTime() {
        // The number of seconds elapsed fromm 1 jan 1970
        long elapsed = System.currentTimeMillis();
        
        long totalSeconds = elapsed / 1000;
        
        long currentSecond = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        
        long currentMinute = totalMinutes % 60;
        
        long totalhours = totalMinutes / 60;
        
        long currentHour = totalhours % 24;
        
        return currentHour + ":" + currentMinute + ":" + currentSecond;
    }
    
    public static String currentDate () {
         // The number of days elapsed fromm 1 jan 1970
        long elapsedDays = System.currentTimeMillis() / 1000 / 60 / 60 / 24;
        
        int currentYear = 1970;  // Start count from year 1970
        
        while((elapsedDays > 365 && !isLeap(currentYear)) ||
                (elapsedDays > 366 && isLeap(currentYear))){
            if(isLeap(currentYear))
                elapsedDays -= 366;
            else 
                elapsedDays -= 365;
            
            currentYear++;
        }
        
        long currentYearDays = elapsedDays + 1;
        
        int currentMonth = getMonth(currentYear, currentYearDays);
        
        return currentDayOfMonth(currentMonth, currentYear, currentYearDays) + 
                " " + currentMonthName(currentMonth) + " " + currentYear;
    }
    
    public static String currentMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        
        return monthName;
    }
    
    public static int getMonth(int currentYear, long currentYearDays) {
        int febDays = isLeap(currentYear) ? 29 : 28;
        
        if (currentYearDays < 31) return 1;
        else if (currentYearDays < 31 + febDays) return 2;
        else if (currentYearDays < 31 + febDays + 31) return 3;
        else if (currentYearDays < 31 + febDays + 31 + 30) return 4;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31) return 4;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31) return 5;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31 + 30) return 6;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31 + 30 + 31) 
            return 7;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31) 
            return 8;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + 
                30) 
            return 9;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + 
                30 + 31) 
            return 10;
        else if (currentYearDays < 31 + febDays + 31 + 30 + 31 + 30 + 31 + 31 + 
                30 + 31 + 30) 
            return 11;
        else return 12;
    }
    
    public static long currentDayOfMonth(int currentMonth, int currentYear, 
            long currentYearDays) {
        int febDays = isLeap(currentYear) ? 29 : 28;
        
        switch(currentMonth) {
            case 1: return currentYearDays;
            case 2: return currentYearDays - 31;
            case 3: return currentYearDays - 31 - febDays;
            case 4: return currentYearDays - 31 - febDays - 31;
            case 5: return currentYearDays - 31 - febDays - 31 - 30;
            case 6: return currentYearDays - 31 - febDays - 31 - 30 - 31;
            case 7: return currentYearDays - 31 - febDays - 31 - 30 - 31 - 
                    30;
            case 8: return currentYearDays - 31 - febDays - 31 - 30 - 31 - 
                    30 - 31;
            case 9: return currentYearDays - 31 - febDays - 31 - 30 - 31 - 
                    30 - 31 - 31;
            case 10: return currentYearDays - 31 - febDays - 31 - 30 - 31 - 
                    30 - 31 - 31 - 30;
            case 11: return currentYearDays - 31 - febDays - 31 - 30 - 31 - 
                    30 - 31 - 31 - 30 - 31;
            default: return currentYearDays - 31 - febDays - 31 - 30 - 31 - 
                    30 - 31 - 31 - 30 - 31 - 30;
        }
    }
    
    public static boolean isLeap(int year) {
        return (year % 4 == 0 & year % 100 != 0) || year % 400 == 0;
    }
}
