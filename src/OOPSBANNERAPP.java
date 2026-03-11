import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = CharacterPattern.getPatterns();

        renderBanner("OOPS", patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);
                String[] pattern = map.get(ch);

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }
}


class CharacterPattern {

    public static Map<Character, String[]> getPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }
}