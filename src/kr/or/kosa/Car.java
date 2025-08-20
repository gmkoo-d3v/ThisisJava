package kr.or.kosa;
// 요구사항 : 클래스 설계 만족 : 최소한의 조건
// 정보(고유정보 + 상태정보) + 행위 >> 설계도 >> 데이터 타입(작은 타입이 모여있는)

// 자동차는 문을 갯수를 가지고 있다
// 자동차는 색상을 가지고 있다
// 고유:차종같이 고정된것 상태: 속도같이 변하는것

public class Car {
	private int door; // 속성 혹은 정보 //캡슐화
  	private String carColor; // member field (instance variable)

  	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
  	
  	//캡슐화 자원에 대해서 READ WRITE 가능한 특수한 목적의 기능 (method)
  	// setter , getter 
  	// 추상화란 누구나 똑같이 인식하는것 멀리 있는 사람을 보고 사람이네 가까이오면 누구네 뭘입고있네 이것이 구체화

	//일반함수(기능)
	public void carInfoPrint() {
		System.out.println(this.door + " / " + this.carColor);
	}
	
	
}
