/*
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create array to store 7 banner lines
        String[] lines = new String[7];

        // Step 2: Construct each line using String.join()

        lines[0] = String.join(" ",
                "  ***  ", "  ***  ", " ***** ", " ***** ");

        lines[1] = String.join(" ",
                " *   * ", " *   * ", " *   * ", " *     ");

        lines[2] = String.join(" ",
                "*     *", "*     *", " *   * ", " *     ");

        lines[3] = String.join(" ",
                "*     *", "*     *", " ***** ", " ***** ");

        lines[4] = String.join(" ",
                "*     *", "*     *", " *     ", "     * ");

        lines[5] = String.join(" ",
                " *   * ", " *   * ", " *     ", "     * ");

        lines[6] = String.join(" ",
                "  ***  ", "  ***  ", " *     ", " ***** ");

        // Step 3: Print using loop (VERY IMPORTANT FOR UC4)
        for (String line : lines) {
            System.out.println(line);
        }
    }
}