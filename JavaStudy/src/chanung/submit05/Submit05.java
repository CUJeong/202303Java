package chanung.submit05;

public class Submit05 {

	public static void main(String[] args) {
		// Q.01 n층 트리 메소드

		makeTree(3);
		makeTree(7);

		// Q.02 로꾸꺼 메소드
		
		String input = "내일은 금요일";
		String reverse = reverseStr(input);
		System.out.println(reverse);
		
		System.out.println("\n==============================\n");
		
		// Q.03 십진수를 이진수로 변환
		// (자바에서 이진수, 16진수 등등은 문자열)
		// 17 -> "10001"
		String binaryString = Integer.toBinaryString(23);
		System.out.println(binaryString);
		
		binaryString = makeBinary(23);
		System.out.println(binaryString);
		
	}
	
	public static String makeBinary(int num) {
		// num에 17이 들어왔다.
		// 17을 2로 나눠서 나머지 1 / 몫은 8
		//  8을 2로 나눠서 나머지 0 / 몫은 4
		//  4를 2로 나눠서 나머지 0 / 몫은 2
		//  2를 2로 나눠서 나머지 0 / 몫은 1
		//  1을 2로 나눠서 나머지 1 / 몫은 0 (스탑)
		
		// 반복횟수와 기준이 애매하면 while(true)
		String result = "";
		while(num > 0) {
			result += num % 2;
			num = num / 2;
		}
		 
		return reverseStr(result);
 	}
	 
	public static String reverseStr(String input) {
		String result = "";
		for(int i = 0; i < input.length(); i++) {
			String str = input.substring(i, i+1);
			// 로꾸꺼
			result = str + result;
		}
		return result;
	}
	
	
	public static void makeTree(int floor) {
		for (int i = 0; i < floor; i++) {
			String space = "";
			for (int k = 0; k < floor-1 - i; k++) {
				space += " ";
			}
			String stars = "";
			for (int k = 0; k < (i * 2) + 1; k++) {
				stars += "*";
			}
			System.out.println(space + stars);
		}
	}
	
	
	
	
	
	

}
