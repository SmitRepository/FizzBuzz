import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void testNumber() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int number = 1;
		String actualResult = fizzbuzz.check(number);
		assertEquals("1", actualResult);
	}
	
	@Test
	public void testFizz(){
		FizzBuzz fizzbuzz = new FizzBuzz();
		int number = 3;
		String actualResult = fizzbuzz.check(number);
		assertEquals("Fizz", actualResult);
	}
}
