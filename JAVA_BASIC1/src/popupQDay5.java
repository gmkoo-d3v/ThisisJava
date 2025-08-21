

//		   쿼즈	  
//		   우리는 백화점 경품 시스템을 만들려고 한다
//	 	   경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
//	       경품 추첨시 1000 점수가 나오면
//	       경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
//	       경품 추첨시 900 점수가 나오면
//	       경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
//	       경품 추첨시 800 점수가 나오면
//	       경품으로  냉장고 , 한우세트 , 휴지
//	       경품 추첨시 700 점수가 나오면
//	       경품으로  한우세트 , 휴지
//	       경품 추첨시 600 점수가 나오면
//	       경품으로  휴지
//	       그외 점수는 100 ~ 500 까지는 칫솔 
//	       경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
//		   사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
//	       
//	       프로그램을 한번 실행하면 그 때 랜덤값이 나오고 그 랜덤값에 의해서 경품을 출력하면 되요


public class popupQDay5 {

	public static void main(String[] args) {
// --------------------------내가 짠 코드--------------------------		
//		int jumsu = ((int)(Math.random()*1000)+1);
//		System.out.println(jumsu);
//		switch(jumsu) {
//		case 1000:
//	//		if 문에 천점넘으면 조건4개를 랜덤넣어서 구현?
//			System.out.println("Tv NoteBook 냉장고 한우세트 휴지");
//			break;
//			
//		case 900:
//			
//			System.out.println("notebook 냉장고 한우세트 휴지");
//			break;
//			
//		case 800:
//			
//			System.out.println("냉장고 한우세트 휴지");
//			break;
//			
//		case 700:
//		
//			System.out.println("한우세트 휴지");
//			break;
//			
//		case 600:
//			
//			System.out.println("당신의 경품은 휴지 입니다");
//			break;
//			
//		default:
//			
//			System.out.println("당신의 경품은 칫솔입니다");
//			
//		}
		
	// ----- 베스트프랙티스 ------------	
		int jumsu1 = ((int)(Math.random()*10)+1)*100;
		String msg="";//초기화
		msg+= "고객님의 점수는 :" + jumsu1 + "이고 상품은 : ";
		switch(jumsu1) {
		case 1000:msg+="tv"; //연산자 학습
		case 900:msg+="노트북 ";
		case 800:msg+="냉장고 ";
		case 700:msg+="한우 ";
		case 600:msg+="휴지 ";
					break;
		default:msg+="칫솔";
	}
 System.out.println(msg);


// switch(조건) 여기서 조건은 정수만...아니죠
// 문자열도 문자 가능
// String m = "F"
// switch(m) case "A"
		
		
	}	
		
		
	

}
