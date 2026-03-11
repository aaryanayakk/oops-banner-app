public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                String[] pattern = CharacterPattern.getPattern(ch);

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }
}


/* UC7 Class storing patterns */

class CharacterPattern {

    public static String[] getPattern(char ch) {

        switch (ch) {

            case 'O':
                return new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                };

            case 'P':
                return new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        " ***** ",
                        "*      ",
                        "*      ",
                        "*      "
                };

            case 'S':
                return new String[]{
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                };

            default:
                return new String[]{
                        " ",
                        " ",
                        " ",
                        " ",
                        " ",
                        " ",
                        " "
                };
        }
    }
}