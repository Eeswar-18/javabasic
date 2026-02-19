// UC3 - OOPS Banner App using String.join()
// Demonstrates memory-efficient string handling and static methods

public class OOPSBannerUC3 {

    // Static method to print one line of the banner
    public static void printLine(String... parts) {
        String line = String.join("", parts);   // joins without creating many temp strings
        System.out.println(line);
    }

    // Static method to display full OOPS banner
    public static void displayBanner() {

        // O
        printLine(" *****   ", " *****   ", " ******  ", " ******  ");
        printLine("*     *  ", "*     *  ", "*     *  ", "*     *  ");
        printLine("*     *  ", "*     *  ", "******   ", "******   ");
        printLine("*     *  ", "*     *  ", "*        ", "*        ");
        printLine(" *****   ", " *****   ", "*        ", "*        ");
    }

    // Main method
    public static void main(String[] args) {
        displayBanner();
    }
}