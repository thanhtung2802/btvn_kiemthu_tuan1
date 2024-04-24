package btvn_tuan1;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class SoNguyenToTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private SoNguyenTo createTestSubject() {
		return new SoNguyenTo();
	}

	
	@Test
	public void testIsPrime() throws Exception {
		int number = 0;
		boolean result;

		// test 1 1
		number = 1;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 2 2
		number = 0;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 3 3
		number = 2;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 4
		number = 1;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 5
		number = 0;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 6
		number = 2;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);
	}

	
	@Test
	public void testMain() throws Exception {
		String[] args = new String[] { "" };

		// default test
		SoNguyenTo.main(args);
	}

	
	@Test
	public void testIsPrime_1() throws Exception {
		int number = 0;
		boolean result;

		// test 1 1
		number = 1;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 2 2
		number = 0;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 3 3
		number = 2;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 4
		number = 1;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 5
		number = 0;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);

		// test 6
		number = 2;
		result = SoNguyenTo.isPrime(number);
		Assert.assertEquals(false, result);
	}
}