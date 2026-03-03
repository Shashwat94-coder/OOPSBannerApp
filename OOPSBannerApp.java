/**
 * UC7 - OOPS Banner using Inner Static Class to Store Character Pattern
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate Character and its Pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character Character value
         * @param pattern 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern by character
     * @param ch input character
     * @return String[] pattern
     */
    public static String[] getCharacterPattern(char ch) {

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', new String[]{
                        "  *****  ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "  *****  "
                }),
                new CharacterPatternMap('P', new String[]{
                        " ******  ",
                        " **   ** ",
                        " **   ** ",
                        " ******  ",
                        " **      ",
                        " **      ",
                        " **      "
                }),
                new CharacterPatternMap('S', new String[]{
                        "  *****  ",
                        " **   ** ",
                        "**        ",
                        "  *****  ",
                        "       **",
                        " **   ** ",
                        "  *****  "
                })
        };

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }

        return new String[7]; // empty if not found
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        String word = "OOPS";

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch);
                lineBuilder.append(pattern[i]).append("  ");
            }

            banner[i] = lineBuilder.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}