








import java.util.Scanner;

public class Ex08_Operation_Quiz {

	public static void main(String[] args) {
		/*
		 /*
		간단한 사칙 연산기 (+ , - , * , /)
		입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
		목적 : Integer.parseInt() ,  ** 구글 java equals() 활용  문자열의 비교** 

		화면
		>입력값:숫자
		>입력값(기호): +
		>입력값:숫자 
		>연산결과 :200
		-------------
		>입력값:100
		>입력값(기호): -
		>입력값:100
		>연산결과 :0 

	hint)
	if 조건값이 boolean
	switch  문은 정수형(byte, short , int) 와  문자(char) , 문자열(String) 조건식 사용
	
	Scanner sc = new Scanner(System.in);
	
	String ch = sc.nextLine();

   switch(ch) {
      case "+" : 더하기 처리
   }
	 */
// 예제임 나중에 내가 짜볼것
		// 입력값 받는 객체 생성
				Scanner sc = new Scanner(System.in);

		//입력값 String 라인별로 받기
				String num1 = sc.nextLine();
				String arithmetic = sc.nextLine();
				String num2 = sc.nextLine();

		//값을 연산용으로 변환해서 사용하기 위한 변수
				int result = 0;
				int strToNum1 = Integer.parseInt(num1);
				int strToNum2 = Integer.parseInt(num2);

		//잘못된 값 입력시 오류
				boolean flag=false;
				switch(arithmetic) {
					case "+":
						result = strToNum1 + strToNum2;
						break;
					case "-":
						result = strToNum1 - strToNum2;
						break;
					case "/":
						result = strToNum1 / strToNum2;
						break;
					case "*":
						result = strToNum1 * strToNum2;
						break;
					default: 
						flag=true;
						System.out.println("오류입니다.");
				}
				if(!flag) {
					System.out.printf("%s %s %s = %d \n",num1,arithmetic,num2,result );
				}
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		// equals 알아보기
		/*
		 * 
		 *  == 연산자는 값을 비교
		 */
		
		String str1 = "AAA";
		String str2 = "AAA";
		System.out.println(str1 == str2);
		// 같은 값인지를 판단
		// str1 과 str2는 같은 메모리를 참조한다. ( 주소가 동일하다)
		
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str3 == str4);
		
		// new 를 쓰면 무조건 힙메모리에 새로 할당하기에 주소가 달라지기에 false 가 나온다.
		// 문자는 그림과 같은것 문자열을 비교하는것은 같은그림인지를 보니까 그래서 equals가 나옴
		// 문자열 비교는 equals 써라 (주소값 비교 말고 그 안에 값을 비교)
		System.out.println(str3.equals(str4));
		// 트루나옴
		if(str3.equals(str4)) {
			
		}
		
		
	
	}

}
