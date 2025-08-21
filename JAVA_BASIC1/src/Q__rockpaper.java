import java.util.Scanner;

public class Q__rockpaper {

	public static void main(String[] args) {

		double random = Math.random();
		System.out.println(random);
		random = (3*random+1);
		System.out.println((int)random);

		int randomInt = (int)random;
		//int comChoice = randomInt;
		
		Scanner sc = new Scanner(System.in);
		
		int inputData = 0;		
		int whoWin = 0;
		
		do { 
			System.out.println("가위, 바위, 보 게임을 시작합니다");
			System.out.println("유저님 입력하세요");
			inputData = Integer.parseInt(sc.nextLine());
	
			whoWin = randomInt - inputData;
			System.out.println("컴퓨터가 낸것 :"+ randomInt);
			
			if (inputData==3) {
				if(random==2) {
					System.out.println("com 승리");
					
				} else {
					
					System.out.println("유저 승리");
					
				}
			} else if(inputData==2) {
				if(random==1) {
					
					System.out.println("com 승리");
				} else {
					
					System.out.println("유저 승리");
					
				}
			} else if(inputData==1) {
				if(random==3) {
					System.out.println("유저 승리");
					
				
				} else {
					System.out.println("com 승리");
				}
				
			
			}
			


			} while( whoWin >= 0 );
		

	}
}
