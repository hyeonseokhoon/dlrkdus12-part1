package exception;

public class BadInputException extends Exception {

    public BadInputException() {
        super("두 번째 숫자는 0이 아닌 값을 입력해주세요.");
    }

    public BadInputException(String type) {
        super("잘못된 입력입니다! " + type + "을 입력해주세요!");
    }
}
