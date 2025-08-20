import kr.or.kosa.Emp;

public class Ex02_Variable {
	public static void main(String[] args) {  //메인도 함수이기에 지역함수로 볼수 있다.
		//변수 정의
		//타입이란
		//제어문 ...
		
		int value; // 변수 선언 (지역변수) 선언은 되어있지만 초기화 되지 않았다.
		// System.out.println(value);
		// The local variable value may not have been initialized
		
		// 초기화 : 변수의 초기화 : 변수가 [처음 값]을 갖는 것 (할당을 통해서)
		// 지역변수는 사용시 반드시 초기화를 선행 해야 한다.
		// 지역변수(local) 무조건 초기화 해라 ...
		value = 100;
		
		// 선언과 할당을 동시에
		int age = 50;
		System.out.println(age);
	
		 // 선언 (지역변수)
	//	System.out.println(emp); // 초기화 안되었길래 출력안됨
		// 초기화란 메모리에 올리는것 고로
	
//		Emp emp; // 선언 (지역변수)
		//                초기화함수(생성자)
		//		emp = new Emp(); //주소값이 할당 (초기화)
		
		Emp emp = new Emp();
		Emp emp3 = new Emp();
		//new Emp() 힙영역에 새로 하나 틀만들기 
		System.out.println(emp3);
		
		// new 연산자 클래스 구체화 메모리에 할당 > heap > 생성된 메모리 주소 생성
	    System.out.println(emp);	
	    // kr.or.kosa.Emp@73a28541
	    // 매번 실행시 안변하는 이유가 메모리 고정되서 추정
	    
	    // .연산자를 주소를 찾아가는 연산자
	  System.out.println(emp.empno);
	  
	  // 0
	  
	  Emp emp2 = emp; // emp가 가진 주소를 emp2에 넘겨주기에 emp2는 같은집에 동거한다고 볼수 있다.
	  emp2.empno = 5000; // 힙영역 emp empno값을 5000으로 변경한다 고로 emp.empno 도 5000됨
	  System.out.println(emp.empno); // 주소값 할당
	  
	  System.out.println(emp2 == emp); // 트루라면 같은장소에 있구나
	  
	  int a; //스텍메모리에 4바이트 할당하고 a라는 이름 할당하겠다
	  int a , b , c; // 같은 타입의 변수를 나열 이방식은 권장하지 않는다. >> 개발자성향상 배열로 만든다. 배열 int[] arr
	  // a = 100; b = 200; c = 300; 권장안함 배열쓰자

	  // int a = 500; 같은지역에 a가 두번선언되니 Duplicate locale variable 라는 에러가 뜬다.
	  
	  int result = a+b; //result 초기화 a+b들어간겂으로
	  System.out.println("result 값은 :" + result );
	  
	  int k = 100;
	  int y = k;
	  y = 200;
	  // k는 100이란값가짐. y에 100이란값을 넣음 y에 200값을 다시 덮어쓰기함 고로 y 호출하면 200나옴
	}
}
