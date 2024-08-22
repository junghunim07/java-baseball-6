package baseball.controller;

import baseball.ui.InputReader;

public class UIController {

    public String receive() {
        return InputReader.readUserValue();
    }
}
