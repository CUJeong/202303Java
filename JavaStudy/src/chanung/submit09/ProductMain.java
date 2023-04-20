package chanung.submit09;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain {

	public static void main(String[] args) {
		// Q.01 전자제품
		Product ref = new Product("냉장고", 2000000); // 101호
		Product tv = new Product("TV", 1000000);
		Product air = new Product("에어컨", 800000);
		Product com = new Product("컴퓨터", 1300000);
		Product fan = new Product("선풍기", 100000);
		
		ArrayList<Product> prodList = new ArrayList<>();
		prodList.add(ref);
		prodList.add(tv);
		prodList.add(air);
		prodList.add(com);
		prodList.add(fan);
		
		Collections.sort(prodList
				, (prodA, prodB) -> prodA.getPrice() - prodB.getPrice());
		
		for(int i = 0; i < prodList.size(); i++) {
			System.out.println(prodList.get(i));
		}
		
		// indexOf() 
		// ArrayList<String> ramen = ["신라면", "안성탕면", "진라면"]
		// ArrayList<Integer> number = [10, 20, 30]
		// ramen.indexOf("안성탕면") = 1
		
		// ArrayList<Product> prodList = [Product객체(냉장고), Product객체(TV), ...   ]
		// prodList.indexOf("TV") = 
		for(int i = 0; i < prodList.size(); i++) {
			if(prodList.get(i).getName().equals("TV")) {
				System.out.println(i);
			}
		}
		
		
	}

}
