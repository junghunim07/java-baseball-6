package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HintTest {

    Hint hint;
    Numbers answer;
    Numbers input;

    @BeforeEach
    void init() {
        hint = new Hint();
        answer = new Numbers();
        input = new Numbers();
    }

    @Test
    void 볼스트라이크() {
        answer.from(List.of(1,2,3));
        input.from(List.of(1,3,2));

        hint.compare(answer, input);

        assertEquals("2볼 1스트라이크", hint.getHint());
    }

    @Test
    void 스트라이크만() {
        answer.from(List.of(1,2,3));
        input.from(List.of(1,2,5));

        hint.compare(answer, input);

        assertEquals("2스트라이크", hint.getHint());
    }

    @Test
    void 볼만() {
        answer.from(List.of(1,2,3));
        input.from(List.of(3,1,2));

        hint.compare(answer, input);

        assertEquals("3볼", hint.getHint());
    }
}