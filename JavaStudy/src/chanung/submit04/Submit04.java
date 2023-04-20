package chanung.submit04;

import java.util.Scanner;

public class Submit04 {

	public static void main(String[] args) {
		// Q.01 로꾸꺼
		Scanner scan = new Scanner(System.in);
		
		System.out.print("거꾸로 뒤집을 문자열 입력: ");
		String input = scan.nextLine();
		
		// 한글자씩 잘라보기
		String result = "";
		// 로꾸꺼
		// substring(2, 3) -> 꺼
		// substring(1, 2) -> 꾸
		// substring(0, 1) -> 로
		for(int i = 0; i < input.length(); i++) {
			String str = input.substring(i, i+1);
			
			System.out.println(str);
			// 로꾸꺼
			result = str + result;
		}
		System.out.println("뒤집은 문자열: " + result); 
		
		
		System.out.println("\n==================================\n");
		
		int elevatorA = 10; // 엘리베이터 A의 위치는 10층
		int elevatorB = 4;  // 엘리베이터 B의 위치는 4층
		
		while(true) {
			System.out.println("\n============== 희영빌딩 엘리베이터 ================\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA);
			System.out.println("승강기 B의 현재 위치: " + elevatorB);
			System.out.print("몇층에 계시나요?[종료는 q 또는 exit]: ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("q") || inputText.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			int floor = Integer.parseInt(inputText);
			
			// 층수 차이 계산
			int diffA = Math.abs(elevatorA - floor); // 10 - 9 = 1
			int diffB = (elevatorB < floor) ? (floor - elevatorB) : (elevatorB - floor);
			
			if(diffA > diffB) {
				System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
				elevatorB = floor;
			}else if(diffA < diffB) {
				System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
				elevatorA = floor;
			}else {
				if(elevatorA > elevatorB) {
					System.out.println("엘리베이터 A가 " + floor + "층으로 이동하였습니다.");
					elevatorA = floor;
				}else {
					System.out.println("엘리베이터 B가 " + floor + "층으로 이동하였습니다.");
					elevatorB = floor;
				}
			}
			
		}
		
		
	}

}
