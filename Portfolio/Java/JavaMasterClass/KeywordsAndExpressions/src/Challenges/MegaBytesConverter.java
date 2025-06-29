package Challenges;

public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(56_000);
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-20);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int MB = kiloBytes / 1024;
        int KB = kiloBytes % 1024;


        if (kiloBytes > 0) {
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
        } else if (kiloBytes == 0) {
            System.out.println(kiloBytes + " KB = " + kiloBytes + " MB and " + kiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}