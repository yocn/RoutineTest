package util;

public class LogUtil {
    public static class Companion {
        public static void d(Object o) {
            System.out.println(o == null ? "null" : o.toString());
        }
    }
}
