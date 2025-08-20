package kr.or.kosa;

public class Emp {
	// main 함수 없어요 그러니 독자적 실행 안됨

	// 사원은 사원번호와 이름을 가지고 있다.
	public int empno;  //instance variable (앞으로 생성될 객체가 가지는 변수)
					   // 초기화 해도 되고 안해도 된다. (답: default 값)
					   // 생성되는 사원마다 다른 사번을 주고 싶어요.
	public String ename; // null store
	private int data;  // 0 store
	
	public void info() {
		System.out.println(this.empno + "/" + this.data);
	}// 안에 있으니 외부에서도  EMPNO DATA 호출가능
// 캡슐화의 장점은 직접접근을 막고 간접접근만 허용함으로써 내가 원하는 데이터만 필터링 가능
	
	public void  infoData() {
//		int number; // LOCAL VARIABLE 지역변수 초기화하지 않았기에 사용 불가
		int number=0;  //인포데이터로 호출되고 삭제될때 같이 날라감
	}


}


//Car car = new Car();
//car = null; car에 NULL 집어넣어서 Car객체를 가베지컬릭팅
// for( ; ; ) 하면 무한루프