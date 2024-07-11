package Module03;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArray {
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        list.add(2);

        System.out.println("Original list: " + list);

        
        list.remove(2);

        System.out.println("List after removing the third element: " + list);
    }

}
