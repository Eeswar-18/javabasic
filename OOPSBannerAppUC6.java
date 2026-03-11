public class OOPSBannerAppUC6 {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " **   ** "),
            String.join("", "**     **"),
            String.join("", "**     **"),
            String.join("", "**     **"),
            String.join("", " **   ** "),
            String.join("", "  *****  ")
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ******  "),
            String.join("", " **   ** "),
            String.join("", " **   ** "),
            String.join("", " ******  "),
            String.join("", " **      "),
            String.join("", " **      "),
            String.join("", " **      ")
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  ****** "),
            String.join("", " **      "),
            String.join("", " **      "),
            String.join("", "  *****  "),
            String.join("", "      ** "),
            String.join("", "      ** "),
            String.join("", " ******  ")
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to print OOPS banner
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
        }
    }
}