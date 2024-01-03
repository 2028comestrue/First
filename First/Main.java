import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int bookNum = 0;
        int bookNum2 = 0;
        int bookNum3 = 0;
        List<Integer> numList = new ArrayList<>();
        Book book = new Book();
        System.out.println(book.firstMess());
        bookNum = book.getBookNum();
        System.out.println(book.getCheckMessage(bookNum));
        System.out.println(book.getOutMessage(bookNum));
        book.addNum(bookNum);
        bookNum2 = book.getBookNum();
        System.out.println(book.getCheckMessage(bookNum2));
        System.out.println(book.getOutMessage(bookNum2));
        book.addNum(bookNum2);
        bookNum3 = book.getBookNum();
        System.out.println(book.getCheckMessage(bookNum3));
        System.out.println(book.getOutMessage(bookNum3));
        book.addNum(bookNum3);
    }
}