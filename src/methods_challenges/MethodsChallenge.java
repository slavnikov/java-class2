package methods_challenges;

public class MethodsChallenge {
    
    public static void main(String[] args) {
        int position = position = calculateHishScorePosition(1500);
        displayHighScorePosition("foo", position);
    }
    
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }
    
    public static int calculateHishScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
