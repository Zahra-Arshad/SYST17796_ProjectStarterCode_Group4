/*
 * Anh Phan 
 *  991 489 221
 *  SYST10199 - WEB PROGRAMMING
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class Helper {

    private static final Scanner s = new Scanner(System.in);

    public static String getString(String msg) {
        System.out.print(msg);
        return s.nextLine();
    }

    public static int getNumber(String msg) {
        int result;
        String number;
        do {
            System.out.print(msg);
            number = s.nextLine();
            try {
                result = Integer.parseInt(number);
                break;
            } catch (Exception e) {
                System.out.println("Please type in a valid number");
            }
        } while (true);

        return result;
    }
}
