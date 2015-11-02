package by.epam.strings;

/**
 * @author Natallia_Ramanchyk
 */
public class Main {

    public static void main(String[] args) {

        Console console = new Console();
        StringManager manager = new StringManager();

        int stringsNumber = console.readNumber(Constants.PROMPT_STRINGS_NUMBER);

        for (int i = 0; i < stringsNumber; i++) {
            String str = console.readLine(Constants.PROMPT_ENTER_STRING + (i + 1));
            manager.addString(str);
        }

        String answer = manager.findSecondShortestString();
        if (answer == null) {
            console.printMessage(Constants.MESSAGE_NOT_FOUND);
        } else {
            console.printMessage(Constants.MESSAGE_ANSWER + answer);
        }
    }
}
