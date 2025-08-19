import kr.or.kosa.Emp;
import kr.or.kosa.Car;

public class Ex01 {

	public static void main(String[] args) {
		// System.out.println("hello");

		//모든 클래스는 메모리에 올라가야 사용가능하다.
		//현실 아파트 설게도 (종이) > 구체화 > 땅 집을 짓는 것 > 주소 건물 
		int i = 10;
		// 4바이트의 공간을 만들어라 그것의 이름은 I 이다.
		// int Emp 타입 e i 변수 사용자가 만드는 타입은 4바이트
		// emp 타입의 램 스택에서의 공간이름은 e임 않에 할당되는 값은 null이다.
		Emp e = new Emp(); // 컨트롤 스페이스로 다른것 임포트가능
		// new 가나오니 힙에 공간할당 그안에 emp같은 변수 할당
		// 이것을 인스턴스 객체
		// 객체변수는 emp 같은 변수 
		// .은 주소를 찾아가는 연산자이다
		// e 는 객체의 주소를 가지고 있다.
		e.empno = 7788;
		e.ename = "홍길동";
		//둘다 힙 new 객체 안에 각각 7788 홍길동이 들어가게됨
		// e.data = 10000; DATA가 프라이빗이기에 호출불가
		e.info();
	
		// 자동차 만들기
		// 만들자 = 메모리에 올리자 (문법)
		Car samsungCar = new Car();
		samsungCar.carInfoPrint();
		// 기본값은 0 0.0 이기에 0으로 나옴 스트링은 클래스이기에 빈값 null이 찍힘
		// 논리적으로 부정을 기본으로하고 트루로 주는것이 편하다고함
		samsungCar.setDoor(2);
		samsungCar.setCarColor("red");
		samsungCar.carInfoPrint();
		
		Car lgCar = new Car();
	}

}
