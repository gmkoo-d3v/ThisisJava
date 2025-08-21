import java.util.Scanner;

​

public class ex8_Operation_Q1 {

​

    public static void main(String[] args) {

​

        Scanner sc = new Scanner(System.in);

​

        // 첫 번째 숫자 입력

        System.out.print(">입력값:");

        String input1 = sc.nextLine();

        int num1 = Integer.parseInt(input1);

​

        // 연산자 입력

        System.out.print(">입력값(기호): ");

        String operator = sc.nextLine();

​

        // 두 번째 숫자 입력

        System.out.print(">입력값:");

        String input2 = sc.nextLine();

        int num2 = Integer.parseInt(input2);

​

        // 연산 결과 변수

        int result;

​

        // switch case를 활용한 연산 처리

        switch (operator) {

            case "+":

                result = num1 + num2;

                break;

            case "-":

                result = num1 - num2;

                break;

            case "*":

                result = num1 * num2;

                break;

            case "/":

                if (num2 != 0) {

                    result = num1 / num2;

                } else {

                    System.out.println("0으로 나눌 수 없습니다.");

                    return;

                }

                break;

            default:

                System.out.println("잘못된 연산자입니다.");

                return;

        }

​

        // 결과 출력

        System.out.println(">연산결과 :" + result);

​

        sc.close();

    }

}

​