
class Apt {
	//설계도 (데이터 타입: 사용자 정의 타입) : 작은 타입
	// 설계도는 구체화 되지 않으면 의미가 없다 (종이와 같다)
	// 목적 : Apt 설계도 똑같은 아파트를 무한히 생산하겠다.
	//생성된 설계도의 목적: 재사용성 
	String doorColor; 
}


public class Ex04_Object_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apt apt; // apt 지역변수는 Apt 아파트의 주소를 담을 수 있다.
		apt = new Apt(); //힙메모리에 아파트(Apt)가 한채 지어지고 생성된 아파트의 주소를 apt라는 변수가 받는다.
		
		System.out.println("apt 주소: "+ apt); //apt 주소: Apt@7d6f77cc
		
		Apt apt2 = new Apt(); // new 할때마다 힙에 apt가 새로 생성되기에 apt2는 메모리 주소값이 다르다
		// 증명
		System.out.println(apt == apt2); //출력값 false 가나오니 다름을 증명함

		Apt apt3 = apt; // 주소값 apt3 메모리를 가져옴 (주소값은 공통됨) 스택은 생성 힙에서는 주소값 그대로 복붙
		System.out.println(apt3 == apt); //true

		int i = 10;
		int j = i;
		j = 100000;
		//i 값 
		//10
		
		
		apt2.doorColor = "red";
		System.out.println(apt2.doorColor);
		
		/*
		 * javac Ex04_Object_variable.java > Ex04_Object_variable.class
		 * java Ex04_Object_Variable 엔터실행
		 * 
		 * 1. JVM > os > 빌려줘 > memory
		 * 2. memory 정리 (자료구조) 할당
		 * 3. main함수 실행
		 * 주소를 담는 칸은 4바이트
		 * 타입이 원시타입(기본타입)의 int면 4byte long면 8byte 이됨
		 * */
	}

}
