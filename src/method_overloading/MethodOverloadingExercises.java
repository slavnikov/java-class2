package method_overloading;

public class MethodOverloadingExercises {
    public static String getDurationString(int min, int sec) {
        if ((min < 0) || (sec < 0 || sec > 59)) { return "Invalid Input"; }
        return leadOs(min / 60) + "h " + 
                leadOs(min % 60) + "m " + 
                leadOs(sec) + "s";
    }
    
    public static String getDurationString(int sec) {
        if (sec < 0) { return "Invalid Input"; }
        return getDurationString(sec / 60, sec % 60);
    }
    
    public static String leadOs(int num) {
        if (num > 9) {
            return "" + num;
        } else {
            return "0" + num;
        }
    }
    
//==============================================================================
    
    public static double area (double radius) {
        if (radius < 0) { return -1.0; }
        return Math.pow(radius, 2) * 3.14159;
    }
    
    public static double area (double height, double width) {
        if (height < 0 || width < 0) { return -1.0; }
        return width * height;
    }
    
//==============================================================================
    
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) { 
            System.out.println("Invalid Value"); 
            return; 
        }
        
        long days = minutes / 60 / 24;
        System.out.println(minutes + " min = " + (days / 365) + " y and " + (days % 365) + " d");
    }
    
//==============================================================================
    
    public static void printEqual(int first, int second, int third) {
        if(first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
            return;
        }
        
        if (first == second && second == third) {
            System.out.println("All numbers are equal");    
        } else if (first != second && first != third && second != third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    
//==============================================================================
    
    public static boolean isCatPlaying(boolean summer, int temp) {
        if(summer){
            return temp <= 45 && temp >= 25;
        } else {
            return temp <= 35 && temp >=25;
        }
    }
}

