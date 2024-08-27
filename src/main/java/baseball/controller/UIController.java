package baseball.controller;

import baseball.ui.InputReader;
import baseball.ui.OutputPrinter;

public class UIController {

    public static String receive() {
        return InputReader.readUserValue();
    }

    public static void printOpenPhrase() {
        OutputPrinter.printStart();
    }

    public static void printProgressPhrase() {
        OutputPrinter.printProgress();
    }

    public static void printEndPhrase() {
        OutputPrinter.printEnd();
    }

    public static void printRestartPhrase() {
        OutputPrinter.printRestart();
    }

    public static void print(String hint) {
        OutputPrinter.print(hint);
    }
}
