package basic.LearnJava;

public class DBUtils {
    private static String fixDBString(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 39) // apostrophe
                sb.insert(i++, "'");
        }
        return sb.toString();
    }
}
