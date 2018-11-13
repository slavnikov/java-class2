package loops;

import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args) {
        addUserNumbers();
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
    
//==============================================================================
    
    public static void printFactors(int input) {
        if(input < 1) { System.out.println("Invalid Value"); }
        
        for (int i = 1; i <= input; i++) {
            if(input % i == 0) { System.out.println(i); }
        }
    }
    
//==============================================================================
    
    public static boolean isPerfectNumber(int input) {
        if(input < 1) { return false; }
        
        int total = 0;
        
        for(int factor = 1; factor < input; factor++) {
            if (input % factor == 0) { total += factor; }
        }
        
        return total == input;
    }
    
//==============================================================================
    
    public static int getDigitCount(int input) {
        if(input < 0) { return -1; }
        
        int count = 0;
        
        do {
            count += 1;
            input /= 10;
        } while (input > 0);
        
        return count;
    }
    
    public static int reverse(int input) {
        int original = Math.abs(input);
        int reverse = 0;
        
        while (original > 0) {
            reverse *= 10;
            
            reverse += original % 10;
            original /= 10;
        }
        
        return input > 0 ? reverse : reverse * -1;
    }
    
    public static void numberToWords(int input) {
        if (input < 0) { System.out.println("Invalid Value"); }
        
        String word;
        int reversed = reverse(input);
        int digitCount = getDigitCount(input);
        
        for(int i = 0; i < digitCount; i++) {
            int number = reversed % 10;
            reversed /= 10;
            
            switch(number) {
                case 0:
                    word = "Zero";
                    break;
                case 1:
                    word = "One";
                    break;
                case 2:
                    word = "Two";
                    break;
                case 3:
                    word = "Three";
                    break;
                case 4:
                    word = "Four";
                    break;
                case 5:
                    word = "Five";
                    break;
                case 6:
                    word = "Six";
                    break;
                case 7:
                    word = "Seven";
                    break;
                case 8:
                    word = "Eight";
                    break;
                case 9:
                    word = "Nine";
                    break;
                default:
                    word = "OTHER";
                    break;
            }
            
            System.out.println(word);
        }
    }
    
//==============================================================================
    
    public static boolean canPack(int bigBags, int smallBags, int goal) {
        if(bigBags < 0 || smallBags < 0 || goal < 0) { return false; }
        
        for(int bigCount = bigBags; bigCount >= 0; bigCount--) {
            int total = bigCount * 5;
            
            if(total < goal) {
                int smallCount = 1;
                
                while(total < goal && smallCount <= smallBags) {
                    total++;
                    smallCount++;
                }
            }
            
            if (total == goal) { return true; }
        }
        
        return false;
    }
    
//==============================================================================
    
    public static boolean isPrime(int input) {
        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static int getLargestPrime(int input) {
        int output = -1;
        
        for(int i = 2; i <= input; i++){
            if(input % i == 0){
                int lowestFactor = 1;
                
                for(int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        lowestFactor = j;
                        break;
                    }
                }
                
                output = i == lowestFactor ? i : output;
            }
        }
        
        return output;
    }
    
//==============================================================================
    
    public static void printSquareStar(int size) {
        if(size < 5) { System.out.println("Invalid Value"); return; }
        
        String line;
        
        for(int i = 1; i <= size; i++) {
            line = "";
            for(int j = 1; j <= size; j++) {
                if(i == 1 || j == 1 || i == size || j == size) {
                    line += "*";
                } else if(i == j) {
                    line += "*";
                } else if(j == size - i + 1) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            System.out.println(line);
        }
    }
    
//==============================================================================
    
    public static void scannerUse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input birth year: ");
        int year = scanner.nextInt();
        
        scanner.nextLine(); // handle next line charecter
        
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        
        System.out.println(name + "'s age is " + (2018 - year));
        scanner.close();
    }
    
//==============================================================================
    
    public static void addUserNumbers() {
        int total = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        
        while(count <= 10) {
            System.out.println("enter number #" + count + ":");
            
            if(scanner.hasNextInt()) {
                total += scanner.nextInt();
                count++;
            } else {
                scanner.nextLine();
                System.out.println("Could not parse your number input.");
            }
        }
        
        System.out.println(total);
    }
}
