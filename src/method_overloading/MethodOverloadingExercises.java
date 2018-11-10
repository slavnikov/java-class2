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
    
    
}
