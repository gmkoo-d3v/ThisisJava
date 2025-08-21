
public class Ex09_Statement {

	public static void main(String[] args) {

//		제어문
//			조건문 : if(3가지), switch(조건)
//			반목문 : for 반복횟수가 명확 while 진위 do {} ~ while()
//			분기문 : break 블럭탈출, continue 아래 구문 skip

			int count = 0;
//			if(count < 1) System.out.println("true") ;// 단일 {} 생략 가능하다.
			if(count <1 ) {
				System.out.println("true");
			}
			
			char data = 'A';
			switch(data) {
			case 'A' : System.out.println("문자 비교 같아요");
				break;
			case 'B': System.out.println("....");
				break;
			default : System.out.println("나머지 처리");
				
			}
			// for문 1~100까지 합
			int sum = 0;
			for (int i=1 ; i <=100 ; i++) {
				sum+=i;
			}
			System.out.printf("1~100까지 누적 합: %d \n", sum);
			//1~5 합 
			// for while 사용하지말고
			// 1부터 n까지의 합 n*(n+1) /2
			sum = 5 * (1+5)/2; // 안할려고 for
			System.out.println(sum);
			// 1~10까지의 홀수 합
			// 단 for문
			// 단 for문 if문 사용금지
			int sum2 = 0;
			for(int d = 1; d <= 10 ; d = d+2) {
				sum2+=d;
			}
			System.out.println("sum2:" + sum2);
			
			//for문 if문 사용해서 1~1000까지 짝수의 합
			int sum3 = 0;
			for(int i=1; i <= 1000; i= i+1) {
				sum3+=i;
				if(i % 2 == 0) {
					sum3+=i;
				}
			}
			System.out.println("sum3:" + sum3);
			// 구구단 해보기
			// for 분기문 (continue , break)
			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i == j) {
						break;
					}
					System.out.printf("%s", "*");
				}
				System.out.println(); // 엔터
			}

			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i == j) {
						continue;
					}
					System.out.printf("[%d]*[%d]=[%d]\t", i, j, i * j);
				}
				System.out.println(); // 엔터
			}

			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j < i; j++) {
					System.out.printf("%s", "*");
				}
				System.out.println(); // 엔터
			}

			// 100 분터 0까지의 값을 출력 (시작값 100)
			for (int i = 100; i >= 0; i--) {
				System.out.println(i);
			}

			// 피보나치 수열
			int a = 0, b = 1, c = 0;
			for (int i = 0; i < 10; i++) {
				a = b;
				b = c;
				c = a + b;
				System.out.printf("[%d]*[%d]=[%d]\t", a, b, c);
				System.out.println("  " + c);
			}

		}

	}
