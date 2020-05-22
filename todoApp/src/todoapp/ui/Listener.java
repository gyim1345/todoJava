package todoapp.ui;

import java.util.Scanner;

public class Listener {
    private static Scanner scanner = new Scanner(System.in);

    public static int awaitIntInput() {
        return scanner.nextInt();
    }

    public static String awaitStringInput() {
        return scanner.next();
    }

}
