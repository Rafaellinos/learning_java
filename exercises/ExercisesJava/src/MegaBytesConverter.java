public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int ramainder = kiloBytes % 1024;
            int megabytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + ramainder + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}
