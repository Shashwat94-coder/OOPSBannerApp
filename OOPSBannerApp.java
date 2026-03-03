// UC5 - OOPS Banner using Inline Array Initialization

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array inline
        String[] banner = {

            String.join("  ",
                "  *****  ",
                "  *****  ",
                " ******  ",
                "  *****  "),

            String.join("  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** "),

            String.join("  ",
                "**     **",
                "**     **",
                " **   ** ",
                "**        "),

            String.join("  ",
                "**     **",
                "**     **",
                " ******  ",
                "  *****  "),

            String.join("  ",
                "**     **",
                "**     **",
                " **      ",
                "       **"),

            String.join("  ",
                " **   ** ",
                " **   ** ",
                " **      ",
                " **   ** "),

            String.join("  ",
                "  *****  ",
                "  *****  ",
                " **      ",
                "  *****  ")
        };

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}