package methods_challenges;

public class DecimalComparator {
    
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.745, 3.746));
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        double difference = first * 1000 - second * 1000;
        return difference < 1 && difference > -1;
    }
}
