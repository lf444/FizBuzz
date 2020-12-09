import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizz;
	@Before
	public void setUp() throws Exception {
		this.fizz = new FizzBuzz();
	}

	@After
	public void tearDown() throws Exception {
		this.fizz=null;
	}

	@Test
	public void test1() {
		assertEquals("1",fizz.Translate(1));
		
	}

	@Test
	public void test2() {
		assertEquals("Fizz",fizz.Translate(3));
	}
	
	@Test
	public void test3() {
		assertEquals("Buzz",fizz.Translate(5));
	}
	
	@Test
	public void test4() {
		assertEquals("FizzBuzz",fizz.Translate(15));
	}

}
