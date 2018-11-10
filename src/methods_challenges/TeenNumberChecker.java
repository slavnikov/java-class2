package methods_challenges;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        return (first >= 13 && first <= 19) ||
                (second >= 13 && second <= 19) ||
                (third >= 13 && third <= 19);
    }
}
