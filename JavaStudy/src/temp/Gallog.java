package temp;

import java.util.Scanner;

public class Gallog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Display disp = new Display();
		disp.start();
		
		while(true) {
			int arrow = Integer.parseInt(sc.nextLine());
			
			if(arrow == 4) {
				if(disp.x > 0) {
					disp.x -= 1;
					disp.y = 5;
				}
			}else if(arrow == 6) {
				if(disp.x < 6) {
					disp.x += 1;
					disp.y = 5;
				}
			}else if(arrow == 0) {
				disp.isRun = false;
			}
		}
		
	}

}
