package baseball.ui;

public class OutputPrinter {

    private static final String start = "숫자 야구 게임을 시작합니다.";
    private static final String progress = "숫자를 입력해주세요 : ";
    private static final String end = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String restart = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printStart() {
        System.out.println(start);
    }

    public static void printProgress() {
        System.out.print(progress);
    }

    public static void printEnd() {
        System.out.println(end);
    }

    public static void printRestart() {
        System.out.println(restart);
    }
}
