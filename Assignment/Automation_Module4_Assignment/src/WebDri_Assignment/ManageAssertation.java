package WebDri_Assignment;

import org.junit.Assert;
import org.junit.Test;

public class ManageAssertation {
	//public static void main(String[] args) 
	//{
		@Test
		public void test() {
			
			int a=5, b=6, c=5;
			
			int[] a1 = {1,2,3};
			int[] b1 = {1,2,3,5};
			
			String s1=null, s2="tops";
			
			//Assert.assertArrayEquals(a1, b1);
			//Assert.assertTrue(a>b);
			//Assert.assertFalse(a<b);
			
			//Assert.assertNull(s1);
			//Assert.assertNull(s2);
			
			Assert.assertNotNull(s2);//-   =>    -    ==  +
			//Assert.assertNotNull(s1);//-   =>    +    ==  -
			
			//Assert.assertSame(a, c);
			//Assert.assertNotSame(a, b);
			
			//Assert.assertEquals(a, c);
			//Assert.assertNotEquals(a, b);
		}

	}

//}
