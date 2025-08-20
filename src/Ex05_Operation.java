
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
		
		if(10 == 10.0f) { // ==은 타입비교하는것이아니고 값만 비교함
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
	}

}
