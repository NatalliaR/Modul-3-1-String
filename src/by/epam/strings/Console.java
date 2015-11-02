package by.epam.strings;

import java.util.Scanner;

/**
 * @author Natallia_Ramanchyk
 */
public class Console {

    private final Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    /**
     * Метод для вывода текста на консоль
     *
     * @param message сообщение, которое нужно вывести
     */
    public void printMessage(String message) {
        if (message != null) {
            System.out.println(message);
        }
    }

    /**
     * Метод для чтения числа из консоли
     *
     * @param prompt сообщение-приглашение для ввода
     * @return считанное число
     */
    public int readNumber(String prompt) {
        printMessage(prompt);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    /**
     * Метод для чтения строки из консоли
     *
     * @param prompt сообщение-приглашение для ввода
     * @return считанная строка
     */
    public String readLine(String prompt) {
        printMessage(prompt);
        return scanner.nextLine();
    }
}
