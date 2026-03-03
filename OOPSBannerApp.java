// UC4 - OOPS Banner using String Array and Loop

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] banner = new String[7];

        // Populate array using String.join()

        banner[0] = String.join("  ",
                "  *****  ",
                "  *****  ",
                " ******  ",
                "  *****  ");

        banner[1] = String.join("  ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                " **   ** ");

        banner[2] = String.join("  ",
                "**     **",
                "**     **",
                " **   ** ",
                "**        ");

        banner[3] = String.join("  ",
                "**     **",
                "**     **",
                " ******  ",
                "  *****  ");

        banner[4] = String.join("  ",
                "**     **",
                "**     **",
                " **      ",
                "       **");

        banner[5] = String.join("  ",
                " **   ** ",
                " **   ** ",
                " **      ",
                " **   ** ");

        banner[6] = String.join("  ",
                "  *****  ",
                "  *****  ",
                " **      ",
                "  *****  ");

        // Print using Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}