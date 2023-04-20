package chanung.submit02;

import java.util.Scanner;

public class Submit02 {

	public static void main(String[] args) {
		// Q.01
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print(">>> ");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력");
		System.out.print(">>> ");
		int kor = Integer.parseInt(scan.nextLine());
		
		System.out.println("영어 점수를 입력");
		System.out.print(">>> ");
		int eng = Integer.parseInt(scan.nextLine());
		
		System.out.println("수학 점수를 입력");
		System.out.print(">>> ");
		int math = Integer.parseInt(scan.nextLine());
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		
		double avg = (kor + eng + math) / 3.0;
		System.out.printf("평균: %.2f", avg);
		System.out.println();
		
		String grade = (avg >= 90) ? ("A") : ((avg >= 80) ? ("B") : ("C"));
		System.out.println("등급: " + grade);
		
		System.out.println("\n================================\n");
		
		// Q.02
		
		String idBack = "1231476";
		
		String first = idBack.substring(0, 1);
		System.out.println(first);
		
		char start = idBack.charAt(0);
		System.out.println(start);
		
		String strStart = start + "";
		System.out.println(strStart);
		
		int num = Integer.parseInt(strStart);
		
		String gender = (num % 2 == 0) ? ("여") : ("남");
		System.out.println(gender);
		
		
	}

}
