package baseball.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputerControllerTest {

    ComputerController computerController;

    @BeforeEach
    void init() {
        computerController = new ComputerController();
    }

    @Test
    void 생성테스트() {
        assertEquals(3, computerController.generate().size());
    }

    @Test
    void 중복여부확인() {
        assertEquals(3, computerController.generate().stream().distinct().count());
    }
}
