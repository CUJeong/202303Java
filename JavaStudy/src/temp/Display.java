package temp;

import java.util.ArrayList;

public class Display extends Thread{
	public int x = 2;   // 비행기의 위치(인덱스 map[6][x])
	public int y = 5;	// 총알의 위치 (인덱스 map[y][x])
	public boolean isRun = true;	// run 메소드 내 while문을 Gallog에서 멈출 수 있도록 함
	String[][] map = new String[7][7];
	ArrayList<Bullet> bullList = new ArrayList<>();
	
	public Display() {
		for(int i = 0; i < map.length; i++) {
			for(int k = 0; k < map[i].length; k++) {
				if(i >= map.length-2) {
					map[i][k] = " ";  // 아래 2줄은 여백
				}else {
					map[i][k] = "□";  // 위 5줄은 네모로 채우기
				}
			}
		}
	}
	
	// 현재 블록 상황 출력
	public void printMap() {
		for(int i = 0; i < map.length; i++) {
			for(int k = 0; k < map[i].length; k++) {
				if(i == map.length-1 && k == x) {
					System.out.print("▲");	// 비행기 위치에 비행기 출력
				}else if(i == map.length-2 && k == x){
					System.out.print("↑");  // 비행기 바로 위에 총알 탄생
					bullList.add(new Bullet(k, i));
				}else {
					// 탄생했던 총알의 좌표와 일치하는 지점에 총알 표기
					for(Bullet bu : bullList) {
						if(bu.x == k && bu.y == i) {
							if(map[i][k].equals(" ")) {
								System.out.print("↑");
								bu.y -= 1;
								
								if(bu.y < 0) {
									bullList.remove(bu);
								}
							}else {
								System.out.print(" ");
								map[i][k] = " ";
								bullList.remove(bu);
							}
						}
					}
					
					System.out.print(map[i][k]);
				}
				

				
				
				
			}
			System.out.println();
		}
	}
	
	// 콘솔창에 줄바꿈 20회 입력
	private void cleanConsole() {
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
	// 모든 블록을 삭제했는지 여부 리턴
	private boolean isClear() {
		boolean result = true;
		for(int i = 0; i < map.length; i++) {
			for(int k = 0; k < map[i].length; k++) {
				if(!map[i][k].equals(" ")) {
					result = false;
				}
			}
		}
		// 전부 띄어쓰기면 true리턴
		return result;
	}
	
	@Override
	public void run() {
		while(isRun) {
			cleanConsole();
			printMap();
			
			if(isClear()) {
				System.out.println("클리어!!");
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
}
