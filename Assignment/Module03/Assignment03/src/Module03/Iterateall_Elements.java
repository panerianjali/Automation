package Module03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterateall_Elements {
	public static void main(String[] args) {
		List<String> List_strings = new ArrayList<String>();
		List_strings.add("Burger");
		List_strings.add("Dabeli");
		List_strings.add("VadaPau");
		List_strings.add("SounthIndian");
		List_strings.add("Chaines");
		System.out.println("ArrayList : " +List_strings);
		
		ListIterator<String> iterate = List_strings.listIterator();
		System.out.println("Iterator over ArrayList");
		while(iterate.hasNext()) {
			System.out.println(iterate.next()+", ");
		}
		
		
	}

}
