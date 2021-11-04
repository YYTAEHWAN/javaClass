package Ch21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practice {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        System.out.print("정수를 입력하세요 : ");
        try {
            i = sc.nextInt();
            System.out.println("입력받은 정수의 값 : " + i);
        } catch (InputMismatchException e) {
            System.out.println("정수가 아닙니다");
        }
    }
}
