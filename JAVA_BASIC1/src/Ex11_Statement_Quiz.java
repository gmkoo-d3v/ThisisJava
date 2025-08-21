import java.util.Scanner;

public class Ex11_Statement_Quiz {

	public static void main(String[] args) {
	
		//메뉴를 보여주고 사용자에 선택 ....
				//원하시는 메뉴를 선택하지 않으면 강제로 다시 메뉴를 보여 주세요
						
				//1.예금
				//2.출금
				//3.잔고
				//4.종료  조건 판단 while 탈출 (어떤 조건이 일치하면 강제 break)
						
						
				//잔액 변수를 생성 (balance)
				//예금 처리  + 누적
				//출금 처리  - 누적
				//잔고      balance  출력
				//종료      프로그램 끝 (함수의 종료  , 프로그램의 강제 종료) : 
				//논리적 종료 ( return (x) 함수 종료방식 , exit(x) 프로그램 강종 안되요)
		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			
//			int balance = 0;
//			int inputData = 0;
//			
//			do { 
//				System.out.println("1.예금\n2.출금\n3.잔고\n4.종료");
//				inputData = Integer.parseInt(sc.nextLine());
//			} while(inputData >= 1);{
//				//예금 	
//				Scanner cashIn = new Scanner(System.in);
//				int inputcashIn = 0;
//				balance = balance + inputcashIn;
//				
//				while(inputData >= 2){
//					// 출금	
//					Scanner cashout = new Scanner(System.in);
//					int inputcashout = 0;
//					balance = balance-inputcashout;
//					
//					while(inputData >= 3){
//						//잔고						
//						while(inputData >=4){
//							inputData=5;
//									while(inputData >=5) {
//										break;
//									}
//							
//								}
//						System.out.println("남은 잔고는 :"+ balance);	
//							}
//					
//					System.out.println("남은 잔고는 :"+ balance);
//					
//						}
//				balance++;
//				System.out.println("남은 잔고는 :"+ balance);	
//					
//					}
//					
//
//				}
		// 강사님 예제
		boolean auto = true;
		int balance = 0; //잔액
		Scanner sc = new Scanner(System.in); //다른 소스 ctrl + shift + o
		
		while(true) {
			System.out.println("***************************");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("***************************");
			
			System.out.println("선택하세요");
			int input = Integer.parseInt(sc.nextLine());
			//판단
			switch(input) {
				case 1 : System.out.println("예금처리..");
				           balance += Integer.parseInt(sc.nextLine());
				         break;
				case 2 : System.out.println("출금처리..");
		         		   balance -= Integer.parseInt(sc.nextLine());
		         		 break;
				case 3 : System.out.println("잔고..");
		                 break;
				case 4 : System.out.println("종료합니다");
						 auto =false;
		                 break;
		        default : System.out.println("올바른 메뉴를 선택하세요");         
			
			}
			
			if(auto == false) {
				break; //또는  
			}
	}
	}

}

