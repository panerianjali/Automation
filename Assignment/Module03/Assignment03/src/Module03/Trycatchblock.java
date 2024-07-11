package Module03;

public class Trycatchblock {
	public static void main(String[] args) {
		try {
			int mynumber[] = {1,2,3,4};
			System.out.println(mynumber[10]);
		}
		catch(Exception e){
			System.out.println("Not proper");
		}
	}
}
