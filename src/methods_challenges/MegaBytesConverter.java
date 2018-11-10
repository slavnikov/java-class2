package methods_challenges;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0 ) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilobytes + " KB = " + kilobytes / 1024 + " MB and " + kilobytes % 1024 + " KB");
        }
    }
}
