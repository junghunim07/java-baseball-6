package baseball.domain;

import java.util.List;

public class Player {

    private Numbers savedNumbers;

    public Player() {
        savedNumbers = new Numbers();
    }

    public List<Integer> save(List<Integer> playerNumbers) {
        savedNumbers.from(playerNumbers);

        return playerNumbers;
    }

    public Numbers getNumbers() {
        return savedNumbers;
    }
}
