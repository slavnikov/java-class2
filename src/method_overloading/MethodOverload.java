package method_overloading;

public class MethodOverload {
    
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(3, 6));
        System.out.println(calcFeetAndInchesToCentimeters(6));
    }
    
    public static double calcFeetAndInchesToCentimeters (int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        
        return calcFeetAndInchesToCentimeters(feet * 12 + inches);
    }
    
    public static double calcFeetAndInchesToCentimeters (int inches) {
        if (inches < 0) {
            return -1;
        }
        
        return inches * 2.54;
    }
}
