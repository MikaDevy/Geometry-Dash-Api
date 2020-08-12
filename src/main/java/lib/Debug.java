package lib;

import lib.Color.ColorCode;

public class Debug {

    public static void Log(ColorCode color, String message) {
        System.out.println(color);
        System.out.println(message);
        System.out.println(ColorCode.RESET);
    }

    public static void Log(String message) {
        System.out.println(message);
    }
}
