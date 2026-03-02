public class UC6 {

    // Letter O 
    static String[] buildO() {
        return new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };
    }

    //  Letter P 
    static String[] buildP() {
        return new String[]{
            "  *****  ",
            "**     **",
            "**     **",
            "******** ",
            "**       ",
            "**       ",
            "**       "
        };
    }

    // Letter S 
    static String[] buildS() {
        return new String[]{
            "   ***** ",
            " **      ",
            "**       ",
            "  *****  ",
            "      ** ",
            " **   ** ",
            "  *****  "
        };
    }

    public static void main(String[] args) {

        // Generate characters using helper methods
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Build banner lines dynamically
        String[] lines = new String[7];

        for (int i = 0; i < 7; i++) {
            lines[i] = String.join(" ",
                    O[i],   // first O
                    O[i],   // second O
                    P[i],
                    S[i]);
        }

        // Display banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}