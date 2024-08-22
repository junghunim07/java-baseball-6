package baseball.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerControllerTest {

    private PlayerController playerController;

    @BeforeEach
    void init() {
        playerController = new PlayerController();
    }

    @Test
    void 저장() {
        String input = "123";
        List<Integer> expected = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            expected.add(Integer.parseInt(
                    String.valueOf(input.charAt(i))
            ));
        }

        assertEquals(expected, playerController.save(input));
    }

    @Test
    void 중복예외() {
        String input = "122";

        assertThrows(IllegalArgumentException.class, () -> playerController.save(input));
    }

    @Test
    void Zero예외() {
        String input = "120";

        assertThrows(IllegalArgumentException.class, () -> playerController.save(input));
    }

    @Test
    void 문자입력예외() {
        String input = "12a";

        assertThrows(IllegalArgumentException.class, () -> playerController.save(input));
    }

    @Test
    void 자릿수예외() {
        String input = "12";

        assertThrows(IllegalArgumentException.class, () -> playerController.save(input));
    }

}