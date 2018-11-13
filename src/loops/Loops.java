package loops;

public class Loops {
    
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(999));
    }
    
    public static void fizzBuzzLoop()  {
        int sum = 0;
        int finds = 0;
        
        
        for (int i = 1; i <= 1000; i++){
            if(i % 5 == 0 && i % 3 == 0) {
                sum += i;
                finds++;
            }
            if (finds >= 5) {break;}
        }
        
        System.out.println(sum);
    }
    
//==============================================================================
    
    public static boolean isOdd(int input) {
        return input > 0 && input % 2 == 1;
    }
    
    public static int sumOdd(int start, int end) {
        if(start <= 0 || end <= 0 || start > end) { return -1;}
        
        int sum = 0;
        
        for (int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        
        return sum;
    }
    
//==============================================================================
    
    public static int sumDigits(int input) {
        if (input < 10) {return -1;}
        
        int total = 0;
        
        while (input > 0) {
            total += input % 10;
            input /= 10;
        }
        
        return total;
    }
    
//==============================================================================
    
    public static boolean isPalindrome(int input) {
        int original = Math.abs(input);
        int reverse = 0;
        
        while (original > 0) {
            reverse *= 10;
            
            reverse += original % 10;
            original /= 10;
        }
        
        return reverse == Math.abs(input);
    }
    
//==============================================================================
    
    public static int sumFirstAndLastDigit(int input) {
        if (input < 0) { return -1; }
        
        int lastDigit = input % 10;
        
        while(input >= 10) {
            input /= 10;
        }
        
        return lastDigit + input;
    }
    
//==============================================================================
    
    public static int getEvenDigitSum(int input) {
        if (input < 0) { return -1; }
        
        int total = 0;
        
        while (input > 0) {
            int digit = input % 10;
            if (digit % 2 == 0) { total += digit; }
            input /= 10;
        }
        
        return total;
    }
    
}
