public class Ex05_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자 (산술, 논리, 관계)
		
		int result = 100 / 100;
		System.out.println("result: " + result);
		
		result = 13/2; //몫
		System.out.println("result: "+ result);
		
		//나머지를 구하는 연산자 (%) db에서 %가 문자열 검색 패턴으로 생김 오라클의 경우 다른연산자로 나머지를 구한다.
		result = 13%2;
		System.out.println("result: "+ result);
		
		// 증가, 감소 ( 증가감 연산자 : ++ 1씩 증가, -- 1씩 감소시켜라)
		int i = 10;
		// ++i; // 전치 증가
		System.out.println("i : "+ i);
		// i++; // 후치 증가
		System.out.println("i : " + i);
		
		//증가감 연산자가 다른 연산과 결합되지 않으면 의미가 없다( 전치 , 후치)
		
		// Today Point
		int i2 = 5;
		int j2 = 4;
		
		int result2 = i2 + ++ j2;
		System.out.println("result2 :" + result2 + "j2: " + j2);
		
		result2 = i2 + j2++;
		System.out.println("result2 :" + result2 + "j2: " + j2);

		byte b = 100;
		byte b2 = 1;
		// *** 자바의 정수 연산의 기본은 int (4byte) 공간에 값을 넣고 계산을하기에 에러가 난다.
		// int + int
		// byte b3 = (byte)(b + b2); //손실
		int b3 = b + b2; // byte + byte > int + int > result int
		
		/*
		 * Today Point
		 *  1. 정수 연산은 [int] 타입으로 변환 후 처리
		 *  
		 *  	ex) byte + short >> 컴파일러가 연산 >> int + int
		 *  	ex) char + char >> 컴파일러가 연산 >> int + int
		 *  	정수의 연산에서 int 보다 작은 타입들은 내부적으로 int로 바꿔 처리한다.
		 *  	정수에서 long 은 예외적으로 빠진다. 나머지 byte, char, short 는 int로 변환
		 *  	
		 *  	ex) char + int >> int 
		 *  		int + int >> int
		 *  		int + long >> long 큰타입 따라가기에 int 가 long 이됨
		 *  
		 *  	정수 + 실수 >> 타입 크기에 상관없이 >> 실수가 이김 표현범위가 더 크기 때문 float long 하면 float
		 *
		 */
		
		long lo = 10000000000L;
		float fo = 1.2f;
		
	//	long result3 = lo + fo; // Type mismatch: cannot convert from float to long
	//	long result3 = (long)(lo + fo)
	//             or
	//  float result3 = lo + fo; //해결됨	
		
		// 변수 > 데이터 타입(값타입, 참조타입) > 연산자(산술, 논리, 관계) > 제어문(if, for)
		//제어문
	//	for(초기값)
		int sum = 0;
		for(int j=0 ; j <= 100 ; j++) {
		//	sum = sum + j;
		//	sum+=j;
			if(j % 2 == 0) {
				sum = sum+j;
			}
		}
		System.out.println(sum);
		for(int j=0 ; j <= 100 ; j++) {
			//가능한이유 위 for문 끝나면 int j는 블록변수이기때문에 사라지기 때문
		}
		
		// == 연산자 (값을 비교하는 연산자)
		if(10 == 10.0f) { // ==은 타입비교하는것이아니고 값만 비교함
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		// ! = 부정연산자
		
		if('A' != 65) {
			// 같지 않으면
			System.out.println("같지 않아 : true ");
		} else {
			//같다면
			System.out.println("같아 : false ");
			
		}
		
		//***** Today Point *******
		//연산자 중에서 제어문 역활 (조건, 반복)
		// 삼항연산자
		
		int p = 10;
		int k = -10;
		
//		int result5 = (조건) ? 맞다면 : 틀리다면
		int result5 = ( p == k )? p : k;
		System.out.println("result5: " + result5);
		
///		***** 삼항 연산에 삼항연산을 반복해서 넣을 수 있다.
//		int result6 = 0;	
//		if (p==k) {System.out.println("result6 :"+ p }
//		else {System.out.println("result6:"+ k);
	
		int result6 = 0;
				if ( p == k) { 
				result6 = p;
				} else {
					result6 = k;
				}
		
				/*
				 * 진리표 (논리연산)
				 * 0: 거짓 false
				 * 1: 참 true
				 * 
				 * 
				 * OR 연산 , AND 연산
				 * 
				 * DB 쿼리
				 * SQL 자연어 ...
				 * select * from emp where job = 'IT' and sal > 3000
				 * select * from emp where job = 'IT' or sal > 3000
				 *
				 *
				 *       and or xor
				 *  0 0   0   0  0
				 *  0 1   0   1  1
				 *  1 0   0   1  1
				 *  1 1   1   1  0
				 *  
				 *  연산자 비트 연산 ( | or연산, & and 연산)
				 *  
				 */
		int x = 3;
		int y = 5;
		// 비트연산 (십진수 >> 이진수 바꾸어서 연산 or , and 진리표 기준)
		
		System.out.println("x | y : OR 연산" + (x|y));
//     출력값      x | y : OR 연산7		
//    128 64 32 16 8 4 2 1
//		           0 0 1 1       >>3
//                 0 1 0 1		 >>5
//		           0 1 1 1       >> 비트 or 연산 그후 4+2+1=7
// ********* 영상처리쪽에서 비트연산을 자주 쓰게된다. ***********************
//      x | y : OR 연산7		
//		128 64 32 16 8 4 2 1
//	         		  0 0 1 1       >>3
//          		  0 1 0 1		>>5
//	          		  0 0 0 1       >> 비트 and 연산 결과 1		
		System.out.println("x & y : AND 연산" + (x&y));
//      출력값       x & y : AND 연산1
		
		// **** Today Point
		// && > and 연산
		// || > or 연산
		// if(10 > 0 && -1 > 1 && 100 > 2 && 1 > -1 ) {A} else {B} 거짓조건 B
		// if(10 > 0 || -1 > 1 || 100 > 2 || 1 > -1 ) {A} else {B} 참 조건 A
		
		int data = 90;
		switch(data) {
			case 100 : System.out.println("100입니다");
			case 90 : System.out.println("90입니다");
			case 80 : System.out.println("80입니다");
			default : System.out.println("일치하는 값이 없어요");
			// break 없는 스위치가 의외로 많이 쓰인다.
				// case이후에 내용이 맞다면 : 이후가 작동
		}
		System.out.println(); //print ln 자체가 개행을 더한 프린트 문이니 \n을 안넣어도 개행됨
		int data2 = 90;
		switch(data2) {
			case 100 : System.out.println("100입니다");
				break;
			case 90 : System.out.println("90입니다");
				break;
			case 80 : System.out.println("80입니다");
				break;
			default : System.out.println("일치하는 값이 없어요");
		
		}
		
		int month = 3; //월을 데이터로 제공
		String res = ""; //빈문자열로 초기화
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: res = "31일";
				break;
			case 4:
			case 6:
			case 9:
			case 11: res = "30일";
				break;
			case 2: res = "29일";
				break;
			default : res = "월 데이터가 아닙니다.";
				
		}
		System.out.println(month + " 월 은 " + res + " 까지 입니다");
		
		//난수 (랜덤값 , 임의의 추출값)
		//GPT , 구글검색
		//API 문서 (오라클 배포: http://docs.oracle.com/javase/버전/docs/api/)
		//					https://docs.oracle.com/javase/8/docs/api/index.html

		/* API 문서
		 * 패키지 기준으로 정렬 (폴더별로 사용하는 것들을 모아서)
		 * 
		 * java.lang.Math
		 * 
		 * import java.lang.Math;   권장
		 * import java.lang.*;   비권장
		 * 
		 * 
		 * import java.lang.*; default open
		 * 
		 * Math 클래스
		 * public static double random()
		 * double greater than or equal to 0.0 and less than 1.0.
		 * 
		 * 0.0 <= random < 1.0 
		 * 
		 */
		System.out.println("Math.random() :" + Math.random() );
		System.out.println("Math.random() * 10 :" + (Math.random())* 10);
		// Math.random() :0.93677262988047
        // Math.random() * 10 :9.776972281151814
		System.out.println("Math.random() * 10 :" + (int)(Math.random()* 10) );
		System.out.println( (int)(Math.random()* 10) +1 );  // 1~10난수
	}

}
