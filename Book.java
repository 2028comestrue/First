import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

    private String line1 = "대여할 책의 번호를 입력하세요.\n" +
            "1. 클린코드(Clean Code) - 대여 가능\n";
    private String line2 = "2. 객체지향의 사실과 오해 - 대여 가능\n";
    private String line3 = "3. 테스트 주도 개발(TDD) - 대여 가능";
    private String message = line1 + line2 + line3;
    private String outMessage = "";
    private int currentNumber = 0;
    private List<Integer> numList = new ArrayList<>();

    public Book() {
    }

    public int getBookNum() {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            this.currentNumber = input.nextInt();
        }
        return this.currentNumber;
    }

    public List<Integer> addNum(int currentNumber) {
        this.numList.add(currentNumber);
        return this.numList;
    }

    public String firstMess() {
        return this.message;
    }

    public String getOutMessage(int bookNumber) {
        if (bookNumber == 1) {
            this.line1 = "대여할 책의 번호를 입력하세요.\n" + "1. 클린코드(Clean Code) - 대여 중\n";
        }
        if (bookNumber == 2) {
            this.line2 = "2. 객체지향의 사실과 오해 - 대여 중\n";
        }
        if (bookNumber == 3) {
            this.line3 = "3. 테스트 주도 개발(TDD) - 대여 중";
        }
        this.outMessage = this.line1 + this.line2 + this.line3;
        return this.outMessage;
    }

    public String getCheckMessage(int currentNumber) {
        if (this.numList.size() >= 1 && this.numList.contains(currentNumber)) {
            return "대여 중인 책은 대여할 수 없습니다.";
        }
        return "정상적으로 대여가 완료되었습니다.";
    }
}
