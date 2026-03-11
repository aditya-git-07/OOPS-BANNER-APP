public class UC7 {

    // Static inner class to store character and its pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Define character patterns
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "  *****  ",
                "**     **",
                "**     **",
                "******** ",
                "**       ",
                "**       ",
                "**       "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        });

        // Store patterns in array (acts like registry)
        CharacterPatternMap[] patternMaps = {O, P, S};

        // Word to print
        String banner = "OOPS";

        StringBuilder[] outputLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            outputLines[i] = new StringBuilder();
        }

        // Build banner
        for (char ch : banner.toCharArray()) {

            for (CharacterPatternMap map : patternMaps) {

                if (map.getCharacter() == ch) {

                    String[] pattern = map.getPattern();

                    for (int i = 0; i < 7; i++) {
                        outputLines[i].append(pattern[i]).append(" ");
                    }

                }
            }
        }

        // Print banner
        for (StringBuilder line : outputLines) {
            System.out.println(line.toString());
        }
    }
}