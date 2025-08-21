import java.util.Scanner;

public class Ex07_prinft_format {

	public static void main(String[] args) {
		// System.out.println()
		// c# : Console.WriteLine();
		System.out.println("A"); //출력하고 줄바꿈
		System.out.println(); //엔터 줄바꿈
		System.out.println("B");
		
		int num = 1000;
		System.out.println(num);
		System.out.println("num 값은" + num + " 입니다.");
		
		//형식(format)
		System.out.printf("num 값은 %d", num);// 파라메터. 형식을 정의한다 %d 십진수정수값 %d는 뒤에있는 num에서 받아옴 
		// printf 는 내부적으로 개행하지 않는다.
		// 조합이 아니라 형식을 바꾸기때문에 printf 추천
		// 개행은 \n 쓰거나 System.out.println(); 
		System.out.printf("num 값은 [%d] 입니다. 또 [%d] 도 있어요\n", num, 12345); // %d가 2번이기에 값을 2개 적음
		/*
		 * %d 10진수 형식의 정수
		 * %f 실수
		 * %s 문자열
		 * %c 문자
		 * 
		 *  \t, \n 조합해서 format 생성
		 * 
		 */
		float f = 3.14f;
		System.out.println(f);
		
		System.out.printf("f 변수값은 %f 입니다.\n", f); // 플롯형식의 범위값이 다출력됨 f 변수값은 3.140000 입니다.
		
		//cmd 모드 입력값 받기 ^^
		
		Scanner sc = new Scanner(System.in); //입력값 받는 클래스
		//String value = sc.nextLine(); // 넥스트라인은 무었인가를 입력하고 enter 칠때까지 대기상태로 빠진다.
		//프로그램이 종료 되지 않고 계속 대기상태로 빠진다.
		//System.out.println("value 입력값 :" + value);
		
		//float value = sc.nextFloat();
		//System.out.println("value 입력값 :" + value);
		
		//Tip
		//권장 : nextInt , nextFloat 보다는 모든 데이터를 nextLine() read
		//필요하면 타입 변환
		//모든 입력값은 문자열이다 이걸 숫자열로 바꿀수 있다.
		
		//Today Point
		//[문자열]  -> 숫자(정수, 실수)
		
		// 객체형태로 데이터를 받을때 int가 안먹혀서 wrap 하는것
		
		/*
		 * String data = sc.nextLine();
		 * int age = Integer.parseInt(data); //문자열을 정수로 바꾼다.
		 * ------------------------------------------------------
		 * Integer.parseInt("1000") -> 1000 연산 가능한 숫자로 바뀐다.
		 * ----------------------------------------------------
		 *	Float.paserFloat("3.1452") -> 3.1452 실수값으로 바꿈
	   	*	직접 숫자로 받으면 에러가 나오니 문자열로 받아서 숫자로 바꾸자.
		*
		*/
		
		System.out.println("숫자를 입력하세요"); //문자열로 입력받음
		// int number = sc.netxLine(); //
		int number = Integer.parseInt(sc.nextLine()); // 문자열 -> 숫자열로 변경
		System.out.printf("입력한 숫자는 : %d", number);
	}

}
