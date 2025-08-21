import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		//반복문 while do~while
		int i = 10;
		while(i >= 10) {
			//반드시
			//증가감을 명시 true, false
			//고민
			--i; // 9
			System.out.println(i);//무한루프
			// --i // 10
		}
		
		// while 1~100 합
		int sum=0;
		int j = 1;
		while(j <=100) {
			sum +=j;
			j++;
		}
		System.out.println("sum :" + sum);
		
		//while(true) {} //무한루프 실례: 메뉴고르는거 문제생겼을때
		int k = 2;
		int p = 1;
		while(k <= 9) {
			p = 1;
			while(p <= 9) {
				System.out.printf("%d*%d=%d\t",k,p,k*p);
				p++;
			}
			System.out.println();
			k++;
		}
		// 무한루프
		// while(true) {}
		// for(;;) {}
		// do ~ while() 일단 한번 강제적 실행 .... 조건보고 판단
		/*
		 메뉴구성
		 점심메뉴를 선택
		 1. 짜장
		 2. 짬뽕
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int inputData = 0 ;
		do {
			System.out.println("숫자 입력해(0~9)");
			inputData = Integer.parseInt(sc.nextLine());
		} while(inputData >= 10);
		
		//조건식이 true do 문을 계속실행
		// 11치면 다시입력 9이하 입력하면 탈출
		// 조건식이 false do 문을 탈출
		System.out.println("당신이 입력한 숫자는 :"+ inputData);

	}

}
