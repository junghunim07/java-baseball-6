package baseball.domain;

import java.util.List;

public class Computer {
    private Numbers savedNumbers;

    public Computer() {
        savedNumbers = new Numbers();
    }

    public void save(List<Integer> generateNumber) {
        savedNumbers.from(generateNumber);
    }

    public Numbers getNumbers() {
        return savedNumbers;
    }
}
