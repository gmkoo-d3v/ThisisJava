import java.nio.file.FileSystemNotFoundException;

public class Ex06_Operation {

	public static void main(String[] args) {
		// 대입 연산자
		// += -= *= /=
		int sum = 10;
		sum += 1; // sum = sum + 1;
		System.out.println(sum);
		sum -= 1; // sum = sum - 1;
		System.out.println(sum);

		/*
		 * if(조건식) {} if(조건식) {} else {} if(조건식) else if (조건식) {} else if(조건식).... else
		 * {} 오라클로 qlsql 가능 엘스이프 없다고함 ??
		 * 
		 * 간단한 학점 계산기 학점 : A+, A-, B+, B-, ...... F
		 * 
		 * 
		 * 판단기준 : 90점 이상 이고 95점 이하이면 90 A > 다시판단 95 A+ , A- 80 B > 다시판단 85 B+ , B-
		 * 
		 */
		int score = 76;
		String grade = ""; // 빈문자열("")로 초기화한다. 초기화는 null로하는거 보단 빈문자열이 좋다.
// A+ A- C+ C-
		System.out.println("당신의 점수는 :" + score);
		// 논리구문
		if (score >= 96) {
			grade = "A";

			/*
			 * if(score>=95) { grade="A+"; } else { grade="A-"; }
			 */
			grade = (score >= 95) ? (grade += "+") : (grade += "-");
		} else if (score >= 80) {
			grade = "B";
			grade = (score >= 85) ? (grade += "+") : (grade += "-");
//			if(score>=85) {
//				grade="B+";
//			} else {
//				grade="B-";
//			}
//			
		} else if (score >= 70) {
			grade = "C";
			grade = (score >= 75) ? (grade += "+") : (grade += "-");
//			if(score>=75) {
//				grade="C+";
//			} else {
//				grade="C-";
//			}
		} else {
			grade = "F";
		}

		System.out.println("당신의 학점은 : " + grade);

		// A~ z
		// for
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.println(i);
		}

		System.out.println(); // 개행 엔터처리
		for (int i = 65; i <= 90; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " "); // 개행이 없다.
		}
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if (i % 10 == 0) {
				System.out.println();
			}

		}
		// 입사시험 3번
		// 구구단
		// 행열 개념
		// 2 ~ 9
		// 1 ~ 9
		for (int n = 2; n <= 9; n++) {
			for (int m = 1; m <= 9; m++) {
				// System.out.print(n + "*" + m + "=" +n*m + "\t");
				System.out.printf("%d*%d=%d\t", n, m, n * m); // %d<-n %d<-m %d<-n*m
			}
			System.out.println();

		}

	}

}
