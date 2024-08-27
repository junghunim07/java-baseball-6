package baseball.ui;

public class OutputPrinter {

    private static final String START = "숫자 야구 게임을 시작합니다.";
    private static final String PROGRESS = "숫자를 입력해주세요 : ";
    private static final String END = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RESTART = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printStart() {
        System.out.println(START);
    }

    public static void printProgress() {
        System.out.print(PROGRESS);
    }

    public static void printEnd() {
        System.out.println(END);
    }

    public static void printRestart() {
        System.out.println(RESTART);
    }

    public static void print(String hint) {
        System.out.println(hint);
    }
}
