package ch15_file;

import java.io.File;

public class TreasureHunter {

	public static void main(String[] args) {
		String path = "/home/ssam/today/treasure";
		
		// treasure 폴더 내 파일을 먼저 찾기!!
		// 선착순 3명 커피쿠폰~~
		
		// Winner!!
		// 1st. 신경호
		// 2nd. 고동욱
		// 3rd. 배준호
		
		File folder = new File(path);
		System.out.println(folder);
		
		findFile(folder);
		
	} // main 끝
	
	public static void findFile(File folder) {
		File[] inner = folder.listFiles();
		for(int i = 0; i < inner.length; i++) {
			if(inner[i].isDirectory()) {
				findFile(inner[i]);
			}else {
				System.out.println(inner[i]);
			}
		}
	}
	
	
	
	
	

}
