package baseball.controller;

import baseball.domain.Computer;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerController {

    private Computer computer;

    public ComputerController() {
        computer = new Computer();
    }

    public List<Integer> generate() {
        List<Integer> generateNumbers = new ArrayList<>();

        while (generateNumbers.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);

            if (validateDuplication(generateNumbers, number)) {
                generateNumbers.add(number);
            }
        }

        computer.save(generateNumbers);

        return generateNumbers;
    }

    public Computer getComputer() {
        return computer;
    }

    private boolean validateDuplication(List<Integer> numbers, int generateNumber) {
        if (numbers.contains(generateNumber)) {
            return false;
        }

        return true;
    }
}
