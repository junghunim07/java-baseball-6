package baseball.domain;

import java.util.List;

public class Numbers {
    private int first;
    private int second;
    private int third;

    public Numbers from(List<Integer> numbers) {
        this.first = numbers.get(0);
        this.second = numbers.get(1);
        this.third = numbers.get(2);

        return this;
    }
}
