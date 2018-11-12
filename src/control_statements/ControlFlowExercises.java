package control_statements;

public class ControlFlowExercises {
    
    public static void printNumberInWord(int number) {
        String word;
        switch(number) {
            case 0:
                word = "ZERO";
                break;
            case 1:
                word = "ONE";
                break;
            case 2:
                word = "TWO";
                break;
            case 3:
                word = "THREE";
                break;
            case 4:
                word = "FOUR";
                break;
            case 5:
                word = "FIVE";
                break;
            case 6:
                word = "SIX";
                break;
            case 7:
                word = "SEVEN";
                break;
            case 8:
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "OTHER";
                break;
        }
        
        System.out.println(word);
    }

//==============================================================================
    
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) { return false; }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
    
//==============================================================================
    
}
