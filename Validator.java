package basic.LearnJava;

import java.util.Scanner;

public class Validator {
    public static String getString(Scanner sc, String msg) {
        String str = "";
        System.out.println(msg);
        str = sc.next();
        return str;
    }

    public static String getLine(Scanner sc, String msg) {
        String str = "";
        System.out.println(msg);
        str = sc.nextLine();
        return str;
    }

    public static double getDouble(Scanner sc, String msg) {
        double dbl = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                dbl = sc.nextDouble();
            }
            else
                System.out.println("Invalid value");
        }

        return dbl;
    }
    public static double getDouble(Scanner sc, String msg, int min, int max) {
        double dbl = 0;
        boolean isValid = false;
        while (isValid == false) {
            dbl = getDouble(sc, msg);
            if (dbl < min) {
                System.out.println("Invalid value! This value must be greater than " + min);
            } else if (dbl > max) {
                System.out.println("Invalid value! This value must be less than " + max);
            }
            else
                isValid = true;
        }

        return dbl;
    }
    public static int getInt(Scanner sc, String msg) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.println(msg);
            if (sc.hasNextDouble()) {
                i = sc.nextInt();
            }
            else
                System.out.println("Invalid value");
        }
        return i;
    }

    public static int getInt(Scanner sc, String msg, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(sc, msg);
            if (i < min) {
                System.out.println("Invalid value! This value must be greater than " + min);
            } else if (i > max) {
                System.out.println("Invalid value! This value must be less than " + max);
            }
            else
                isValid = true;
        }
        return i;
    }
}
