package baseball.domain;

import java.util.List;

public class Computer {
    private Numbers savedNumbers;

    public void save(List<Integer> generateNumber) {
        savedNumbers.from(generateNumber);
    }
}
