package methods_challenges;

public class MegaBytesConverter {
    public static void printMegaBytestAndKiloBytes(int kilobytes) {
        if (kilobytes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB and " + kilobytes % 1024 + " KB");
        }
    }
    
    public static void main(String[] args) {
        printMegaBytestAndKiloBytes(2050);
        printMegaBytestAndKiloBytes(1000);
        printMegaBytestAndKiloBytes(0);
        printMegaBytestAndKiloBytes(-5);
    }
}
