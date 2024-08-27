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

    public int countSame(Numbers input) {
        int count = 0;

        if (this.first == input.first)
            count++;
        if (this.second == input.second)
            count++;
        if (this.third == input.third)
            count++;

        return count;
    }

    public int countEqual(Numbers input) {
        int count = 0;

        if (this.first == input.second || this.first == input.third)
            count++;
        if (this.second == input.first || this.second == input.third)
            count++;
        if (this.third == input.first || this.third == input.second)
            count++;

        return count;
    }
}
