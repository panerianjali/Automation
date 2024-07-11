package Module03;



public class FibonaciSeries {
	public static void main(String[] args) {
		int n = 10, ft=0, st=1;
		System.out.println("Fibanacii Series till");
		
		for(int i =1; i<=n; ++i) {
			System.out.println(","+ft);
			
			int nt = ft + st;
			ft= st;
			st = nt;
		}
		 
		 	}

}
