package WebDri_Assignment;

import org.testng.AssertJUnit;
import org.apache.commons.math3.util.MathUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedDemo {
	
	@ParameterizedTest
	@ValueSource(ints = { 2, 7, 29, 67, 89 })
	void isPrime(int number) {
	  AssertJUnit.assertTrue(MathUtils.isPrime(number));
	}

}
