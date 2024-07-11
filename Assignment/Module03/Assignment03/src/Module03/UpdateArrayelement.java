package Module03;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayelement {
	public static void main(String[] args) {
		
		List<String> list_strings = new ArrayList<String>();
		list_strings.add("Blue");
		list_strings.add("Orange");
		list_strings.add("White");
		list_strings.add("Gray");
		
		System.out.println(list_strings);
		list_strings.set(2, "Yellow");
		System.out.println(list_strings);
		
	}

}
