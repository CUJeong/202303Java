package chanung.submit07;

import java.util.ArrayList;

public class Submit07 {
	public static void main(String[] args) {
		// Q.01 ArrayList에 10~20 랜덤 숫자 10개 담기
		ArrayList<Integer> intList = new ArrayList<>();
		
		// 1~45 => (int)(Math.random() * 45) + 1; 
		// 15~30 => (int)(Math.random() * 16) + 15;
		// 0~10 => (int)(Math.random() * 11);
		// 10~20 => (int)(Math.random() * 11) + 10;
		// a~b => (int)(Math.random() * (b-a+1)) + a;
		for(int i = 0; i < 10; i++) {
			intList.add(makeRandom(10, 20));
		}
		
		System.out.println(intList);
		
		System.out.println("\n===============================\n");
		
		// 중복 제거
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i = 0; i < intList.size(); i++) {
			// newList안에 현재의 intList.get(i) 가 존재하지
			// 않는 경우에만 추가해주기
			if(!newList.contains(intList.get(i))) {
				newList.add(intList.get(i));
			}
		}
		System.out.println(newList);
		
		
		// 중복 제거 두번째 방법
		for(int i = 0; i < intList.size(); i++) {
			for(int k = intList.size()-1; k > i ; k--) {
				if(intList.get(i) == intList.get(k)) {
					intList.remove(k);
				}
			}
		}
		System.out.println(intList);
		
		System.out.println("\n==============================\n");
		
		// Q.02
		ArrayList<String> wipeList = new ArrayList<>();
		wipeList.add("냉장고");
		wipeList.add("로봇청소기");
		wipeList.add("세탁기");
		wipeList.add("에어컨");
		wipeList.add("건조기");
		
		ArrayList<String> husList = new ArrayList<>();
		husList.add("노트북");
		husList.add("TV");
		husList.add("에어컨");
		husList.add("플스");
		husList.add("로봇청소기");
		
		// 서로 사고 싶은 물건 목록
		ArrayList<String> wantBuy = new ArrayList<>();
		for(int i = 0; i < wipeList.size(); i++) {
			if(husList.contains(wipeList.get(i))) {
				wantBuy.add(wipeList.get(i));
			}
		}
		System.out.println(wantBuy);
		
		// 교집합을 위한 .retainAll()
		wantBuy.clear();
		wantBuy.addAll(wipeList);  // 아내의 구매목록 전부를 담기
		wantBuy.retainAll(husList);
		System.out.println(wantBuy);
		
		// 전체 구매 목록 (합집합)
		ArrayList<String> allBuy = new ArrayList<>();
		
		allBuy.addAll(wipeList);
		System.out.println(allBuy);
		
		for(int i = 0; i < husList.size(); i++) {
			if(!allBuy.contains(husList.get(i))) {
				allBuy.add(husList.get(i));
			}
		}
		System.out.println(allBuy);
		
		
	} // main 끝
	
	public static int makeRandom(int a, int b) {
		return (int)(Math.random() * (b-a+1)) + a;
	}
	
	
	
}
