package util;

public class ConsoleStyle {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String BOLD = "\u001B[1m";

    public static void header(String title) {
        System.out.println(BOLD + BLUE + "\n==== " + title + " ====" + RESET);
    }

    public static void success(String msg) {
        System.out.println(GREEN + msg + RESET);
    }

    public static void error(String msg) {
        System.out.println(RED + msg + RESET);
    }

    public static void info(String msg) {
        System.out.println(YELLOW + msg + RESET);
    }
}
