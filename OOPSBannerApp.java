import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - OOPS Banner using HashMap for Character Pattern Storage
 */
public class OOPSBannerApp {

    /**
     * Utility method to build and return character pattern map
     * @return Map of Character and its 7-line pattern
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });

        map.put('S', new String[]{
                "  *****  ",
                " **   ** ",
                "**        ",
                "  *****  ",
                "       **",
                " **   ** ",
                "  *****  "
        });

        return map;
    }

    /**
     * Utility method to render banner
     * @param word word to display
     * @param map character pattern map
     */
    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> characterMap = buildCharacterMap();

        renderBanner(word, characterMap);
    }
}