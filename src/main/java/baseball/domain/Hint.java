package baseball.domain;

public class Hint {

    private int strike;
    private int ball;
    private boolean endFlag;

    public void compare(Numbers computer, Numbers player) {
        this.strike = computer.countSame(player);
        this.ball = computer.countEqual(player);
        this.endFlag = false;
    }

    public String getHint() {
        if (strike == 3)
            endFlag = true;
        if (strike != 0 && ball != 0)
            return ball + "볼 " + strike + "스트라이크";
        if (strike == 0 && ball != 0)
            return ball + "볼";
        if (strike != 0 && ball == 0)
            return strike + "스트라이크";
        return "낫싱";
    }
}
