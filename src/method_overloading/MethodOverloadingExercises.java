package method_overloading;

public class MethodOverloadingExercises {
    public static String getDurationString(int min, int sec) {
        if ((min < 0) || (sec < 0 || sec > 59)) { return "Invalid Input"; }
        return (min / 60) + "h " + (min % 60) + "m " + sec + "s";
    }
    
    public static String getDurationString(int sec) {
        if (sec < 0) { return "Invalid Input"; }
        return getDurationString(sec / 60, sec % 60);
    }
    
//==============================================================================
    
    
}
