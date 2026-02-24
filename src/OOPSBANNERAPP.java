public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o1 = letterO();
        String[] o2 = letterO();
        String[] p  = letterP();
        String[] s  = letterS();

        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + "   " + o2[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    static String[] letterO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    static String[] letterP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    static String[] letterS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}