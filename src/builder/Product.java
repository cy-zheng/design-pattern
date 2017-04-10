package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private List<String> parts = new ArrayList<>();
	
	public void add(String s) {
		parts.add(s);
	}
	
	public void show() {
		for (String s: parts){
			System.out.println(s);
		}
	}
}
