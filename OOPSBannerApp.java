// UC6 - OOPS Banner using Helper Methods

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Get patterns from helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Combine O O P S into final banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        // Print using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for O pattern
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        };
    }

    // Method for P pattern
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        };
    }

    // Method for S pattern
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " **   ** ",
                "**        ",
                "  *****  ",
                "       **",
                " **   ** ",
                "  *****  "
        };
    }
}