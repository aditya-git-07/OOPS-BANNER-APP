import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {

        // Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        patternMap.put('P', new String[]{
                "  *****  ",
                "**     **",
                "**     **",
                "******** ",
                "**       ",
                "**       ",
                "**       "
        });

        patternMap.put('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        });

        renderBanner("OOPS", patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        StringBuilder[] outputLines = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            outputLines[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            String[] pattern = patternMap.get(ch);

            if (pattern != null) {

                for (int i = 0; i < 7; i++) {
                    outputLines[i].append(pattern[i]).append(" ");
                }

            }
        }

        for (StringBuilder line : outputLines) {
            System.out.println(line.toString());
        }
    }
}