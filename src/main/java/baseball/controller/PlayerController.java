package baseball.controller;

import baseball.domain.Player;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PlayerController {

    private Player player;

    public PlayerController() {
        player = new Player();
    }

    public List<Integer> save(String userValue) {
        validate(userValue);

        return player.save(parse(userValue));
    }

    private List<Integer> parse(String userNumbers) {
        return Arrays.stream(userNumbers.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private void validate(String userValue) {
        validateDuplication(userValue);
        validateZeroValueIn(userValue);
        validateContainNotNumberIn(userValue);
        validateNotThreeDigits(userValue);
    }

    private void validateDuplication(String input) {
        int original = input.length();
        int unique = Set.of(input.split("")).size();

        if (unique != original) {
            throw new IllegalArgumentException();
        }
    }

    private void validateZeroValueIn(String input) {
        if (input.contains("0")) {
            throw new IllegalArgumentException();
        }
    }

    private void validateContainNotNumberIn(String input) {
        for (int i = 0; i < input.length(); i++) {
            char number = input.charAt(i);

            if (number < '1' || number > '9') {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateNotThreeDigits(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException();
        }
    }
}
