package todoapp.ui;

import java.util.Scanner;

public class InputView {
//    private static Scanner scanner = new Scanner(System.in);

    public static int inputChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String inputWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
