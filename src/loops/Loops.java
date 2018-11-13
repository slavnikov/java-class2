package loops;

public class Loops {
    
    public static void main(String[] args) {
        System.out.println(sumDigits(12853));
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
}
