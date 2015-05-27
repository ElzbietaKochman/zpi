/**
 * 
 */
package zpi.kochman.elzbieta.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import zpi.kochman.elzbieta.Primes;

/**
 * @author Elżbieta Kochman
 *
 */
public class PrimeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Primes prime = new Primes();
		assertTrue(prime.isNumberDividible(20, 5));
		assertFalse(prime.isNumberDividible(23, 4));
		
		for(int i =0 ; i < 100 ; i++)
			assertEquals(prime.addNextPrime(i), prime.primes.size());
		
		
		
	}

}
