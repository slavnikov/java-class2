package control_statements;

public class ControlStatements {
    
    public static void main(String[] args) {
        System.out.println(OneToFive(3));
        System.out.println(OneToFive(8));

        for(int i = 0; i < 5; i++) {
            System.out.println(calculateInterest(500, i+2));
        }
        
        int idx = 0;
        
        while (idx < 5) {
            System.out.println(calculateInterest(500, idx+2));
            idx++;
        }

        do {
            System.out.println(idx);
            idx++;
        } while (idx <= 10);
        
        int nextYear = Integer.parseInt("2018" ) + 1;
        System.out.println(nextYear);
    }
    
    public static int OneToFive(int number) {
        switch(number) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5: 
                return 5;
            default:
                return -1;
        }
    }
    
    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}
