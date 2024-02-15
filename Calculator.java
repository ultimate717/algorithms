import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자: ");
        String num1 = sc.next();
        System.out.println("두번쨰 숫자: ");
        String num2 = sc.next();
        System.out.println("+, -, *, / 를 입력하시오 ");
        String opcode = sc.next();
        int result = 0;
        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);

        if (opcode.equals("+")) {
            result = intNum1 + intNum2;
        } else if (opcode.equals("-")) {
            result = intNum1 - intNum2;
        } else if (opcode.equals("*")) {
            result = intNum1 * intNum2;
        } else if (opcode.equals("/")) {
            result = intNum1 / intNum2;
        } else {
            System.out.println("잘못된 연산기호 입니다 ");
        }
        System.out.println("첫번째 숫자: " + num1);
        System.out.println("두번째 숫자: " + num2);
        System.out.println("결과" + result);
    }
}
