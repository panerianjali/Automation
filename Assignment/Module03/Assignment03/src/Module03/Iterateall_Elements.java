package Module03;

import java.util.ArrayList;
import java.util.List;

public class Iterateall_Elements {
	public static void main(String[] args) {
		List<String> List_strings = new ArrayList<String>();
		List_strings.add("Burger");
		List_strings.add("Dabeli");
		List_strings.add("VadaPau");
		List_strings.add("SounthIndian");
		List_strings.add("Chaines");
		
		for(String element : List_strings) {
			System.out.println(element);
		}
	}

}
