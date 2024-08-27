package baseball.controller;

import baseball.domain.Hint;

public class GameController {

    private ComputerController computerController;
    private PlayerController playerController;
    private Hint hint;

    public GameController() {
        computerController = new ComputerController();
        playerController = new PlayerController();
    }

    public void start() {
        boolean isRunning = true;
        while (isRunning) {
            hint = new Hint();
            UIController.printOpenPhrase();
            computerController.generate();
            progress();
            isRunning = checkRestart();
        }
    }

    private void progress() {
        while (!hint.getFlag()) {
            UIController.printProgressPhrase();
            playerController.save(UIController.receive());
            hint.compare(computerController.getComputer().getNumbers(),
                    playerController.getPlayer().getNumbers());
            UIController.print(hint.getHint());
        }
    }

    private boolean checkRestart() {
        UIController.printRestartPhrase();
        int input = Integer.parseInt(UIController.receive());
        validateRestart(input);

        if (input == 1)
            return true;

        return false;
    }

    private void validateRestart(int input) {
        if (input != 1 && input != 2)
            throw new IllegalArgumentException();
    }
}
