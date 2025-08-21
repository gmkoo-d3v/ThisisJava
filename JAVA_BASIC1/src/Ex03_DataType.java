
public class Ex03_DataType {

	public static void main(String[] args) {

		int num = 100000000;
		System.out.println("num :" + num);

		//int num2 = 10000000000;  // 숫자가 num2에 넣기전에 에러. 사용자가 직접입력한 숫자가 인터에 못들어간다. The literal 10000000000 of type int is out of range
		int num2 = 10000;
		
		long num3 = 100; 
		//사실은 컴파일러가 내부적으로 일을한다
		// long num3 = (long)100;
		// 암시적 형변환 (컴파일러가 자동으로 형변환)
		// 작은 타일을 큰 타입에 넣는것은 고민하지 말자
		
//		 초보 개발자 주의사항
//		 int num4 = 100000000;
//		 int num4 = 100000000L; Type mismatch: cannot convert from long to int 롱으로 바꿔도 받는것이 int여서 에러
//		 long = num4 = 100000000L; 해결방법 1
		
		//개발자 의도 명시적 형변환 (타입 변환 , casting)
		// 정상적인 값이 안나오는 경우 발생 (쓰레기 값 ,,, 버려지는 값)
		int num4 = (int)10000000000L;
		System.out.println("num4 " + num4);
		
	//	int num5 = 100000L; // 하나는 롱 하나는 인트니 에러
	//	int num5 = (int)100000L 데이터 손실은 없다.
		// 담을 그릇을 크게하자
		// char 2byte > 한문자 표현  > 정수값(0 ~ 655535)
		// 아스키 코드표 (a 문자 > 65 )
		
		char ch = '가'; 
		System.out.println(ch);
		
		ch = 'a';
		ch = 'A';
		
		//char 정수 타입 ( 문자를 저장하지만 내부적으로 정수값을 가지고 있다)
		int chint = ch;
		System.out.println("ch문자를 정수 값으로 보면 : " + chint);
		// 컴파일러 내부에서 int chinkt = (int)ch; 이렇게 변환
		
		char chint2 = 'a';
		System.out.println(chint2);

		int intch2 = chint2;
		//int intch2 = (int)chint2; // 컴파일러가 이렇게 변화 시킴
		
		// 문제 제시
		//int intch3 = 65;
		
		//char ch3 = intch3;
		// 1. 해결방법 ( 명시적 형변환 데이터 손실이 발생 할 수 도 있다)
		// char ch3 = (char) intch3;
		
		// 2. 해결방법 (받는 그릇을 크게)
		// int ch3 = intch3;
		
		/*
		1. 할당에 있어서 값을 보지말고 값이 가지는 타입을 보자
		1.1 리터럴 값에 대해서 (개발자가 직접 입력하는 숫자 문자열을 리터럴이라 한다)
		1.1.1 정수 리터럴의 기본 타입(기본그릇)은 int
		1.1.2 실수 리터럴의 기본 타입(기본그릇)은 double
		
		2. 암시적 형변환, 명시적 형변환
		2.1 큰 타입에 작은 타입을 넣는 것은 암시적 형변환을 통해서 개발자가 건드릴것은 없다.
		2.2 작은 타입에 큰 타입을 넣고자 한다면 자동 형변환을 지원하지 않는다. 명시적형변환(강제적 형변환)
		2.2.1 접미사( L, l) or (int) 정수
		KEY POINT : 강제적 형변환은 데이터 손실을 감수 (책임은 개발자)
		ex) char c = (char)int 손실발생 가능성 
		
		String 8 + 1 ( String)
		값타입 처럼 써도 문제 없다.
		문자열은 엄격히 따지면 존재하지 않는다. 문자의 집합이기때문에 ex) 문자열 "가나다" >> ['가']['나']['다'] >> 문자열은 char의 집합이다.
		int , long 동일하게 사용
				
		*/
		String name = "홍길동";
		name = "홍길동 바보";
		// 엄격히 따지면 스텍과 힙에 홍길동이라고 쓴다. 네임에 홍길동 바보를 추가하면 힙에 새로 홍길동 바보를 만들고 스택에서는 홍길동의 주소와의 연결을 단절시킨다. 스텍에서는 마지막 변수의 주소값을 가진다.
		
		String color = "red";
		color = color + " 방가방가";
		System.out.println(color);
		
		//TIP)
		//연산자 언어마다 표현이 다르다
		// JAVA > + 산술, 결합
		// Oracle > + 산술 , 결합 연산자 || > '안녕'  || '방가방가'
		
		//TIP)
		// 자바는 타입에 엄격한 언어
		/*
		 * let i;
		 * i = 100; 이때 타입이 결정 (number)
		 * 자바스크립트는 이런식으로 엄격하지 않음
		 * 이걸 엄격하게 하기 위해서나온것이 typescript 
		 */
		//Java 에서 특수문자 처리하기
		//char sing = ' '; 스페이스
		//char sing = '''; //Invalid character constant
		//이스케이프 문자 : 특정 문자앞에 \ 그 다음값은 데이터로 인정
		char sing = '\'';
		System.out.println(sing);
		
	//Quiz) 홍"길"동 이라는 문자열을 출력하기
		String userName = "홍\"길\"동";
		System.out.println(userName);
		
		String str1 = "10000"; //문자열이니 일공공공공 숫자형 문자
		String str2 = "10"; 
		String result = str1 + str2; //자바는 문자를 합친다 1000010. 오라클은 문자껍데기를떼 숫자를 더한다 10010
		System.out.println(result);
		
		System.out.println("100"+100);
		System.out.println(100 + "100");
		System.out.println(100 +"100"+100);
		System.out.println(100+(100+"100"));
		System.out.println(100+"100"+100);
		
		
		//quiz 경로 C:\Temp 문자열로 String 변수에 담아서 출력
		String path = "C:\\Temp"; //Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		System.out.println("path : " + path);
		
		// \t tab, \n newline
		path ="C;\\T\t\te\tm\np";
				System.out.println("path : " + path);
				
		//byte : 네트워크 데이터 교환 ... 파일처리 ( 파일 업로드 다운로드)		
		//byte[] ...배열로 활용				
		// long : 금융 화폐
				
		// 실수형(부동소수점)
		// float 4byte
		// double 8byte (실수 리터럴의 기본 타입 : double)
		//float f = 3.14; //Type mismatch: cannot convert from double to float
		
		float f = 3.14f; //주로 사용됨 
		float f2 = (float)3.14;
		//둘다 데이터 손실 발생 가능
		
		double d = 3.14;
		//처음부터 타입을 크게 잡고
		
		float data = 1.123456789f;
		System.out.println("float data :" + data);
		// 출력결과물 float data :1.1234568
		// 8이 반올림되어서 7이 8로됨

		double data2 = 1.12345689123456789;
		System.out.println("double data2 :" + data2);
		// double data2 :1.123456891234568
		// 두번째 7이 반올림되서 8 됨
		
		// *** 자바는 BigDecimal 클래스를 만들어 정밀한 수를 표현 가능하게 함 (화폐 단위) *****
		
		// quiz 1)
		double data3 = 100;
		//결과값
		System.out.println("data3 :" + data3);
		// data3 :100.0
		
		//Quiz 2)
		double data4 = 100;
		int number = 100;
		// double + int 결과 double
		// int result2 = data4 + number;
		// int result2 = (int)(data4 + number); //손실이 발생할 수도
		double result2 = data4 + number; //선택 (받는 쪽을 크게)
		System.out.println("result2 :" + result2);
		//result2 :200.0
		
		//Quiz 3)
		int number2 = 100;
		//byte b2 = number2;
		//a1.  byte b2 = (byte)number2;
		//a2.  int b2 = number2;
		
		//Today Point
		//1. 큰타입 + 작은 타입 연산결과는 큰 타입
		//2. 타입간 변환에 있어서  변수가 가지는 값을 보지말고 변수의 타입을 보자
		//3. 명시적(강제적) 형변환은 데이터의 손실을 가져올수 있다. (고민하자)
		
		int data5 = 100;
		byte b3 = (byte)data5; //명시적 (강제적) 형변환
		
		byte b4 = 20;
		//int data6= b4;
		//int data6 = (int)b4; // 이쪽을 컴파일러가 더 선호함 컴파일러가 변환할일이 줄어든다 하지만 생략이 안되서 안함
		// 컴파일러가 자동으로 처리하는 코드는 ... 암시적 변환되니 하지말자
		int data6 = b4;
		
		double result3 = data4 + number;
		System.out.println("result3 :"+ result3);
		//
		
	
	
	}
}
