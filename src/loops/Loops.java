package loops;

public class Loops {
    
    public static void main(String[] args) {
        System.out.println(getGreatestcommonDivisor(25, 15));
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
    
//==============================================================================
    
    public static boolean hasSharedDigit(int first , int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) { return false; }
        
        while (first > 0) {
            int digitOfFist = first % 10;
            int copyOfSecond = second;
            
            while (copyOfSecond > 0) {
                int digitOfSecond = copyOfSecond % 10;
                if (digitOfFist == digitOfSecond) { return true; }
                copyOfSecond /= 10;
            }
            
            first /= 10;
        }
        
        return false;
    }
    
//==============================================================================
    
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (first < 10 || 
                first > 1000 || 
                second < 10 || 
                second > 1000 || 
                third < 10 || 
                third > 1000) 
        { return false; }
        
        int last1 = first % 10;
        int last2 = second % 10;
        int last3 = third % 10;
        
        return last1 == last2 || last1 == last3 || last2 == last3; 
    }
    
//==============================================================================
    
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) { return -1; }
        
        int smaller = first > second ? second : first;
        int bigger = first > second ? first : second;
        int gcd = 0;
        
        for(int divisor = 1; divisor <= smaller; divisor++) {
            if(smaller % divisor == 0 && bigger % divisor == 0) { gcd = divisor; }
        }
        
        return gcd;
    }
}
