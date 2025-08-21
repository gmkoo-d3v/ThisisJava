import java.utill.Scanner;

public class ex8_Operation_Q2 {
 public static void main(String)[] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("입력값:");
	 int numA = Integer.parseInt(sc.nextLine());
	 System.out.println("입력값(기호):");
	 String sign = sc.nextLine();
	 System.out.print("입력값:");
	 int numB = Integer.parseInt(sc.nextLine());
	 System.out.println("연산결고:");
	 switch(sign) {
	 
	 case "+" : System.out.printf("%d\n", numA+numb);
	 	break;
	 case "-" : System.out.printf("%d\n", numA-numb);
	 	break;
	 case "*" : System.out.printf("%d\n", numA*numb);
	 	break;
	 case "/" : System.out.printf("%d\n", numA/numb);
	 	break;
	 	
	 }
 }
}
