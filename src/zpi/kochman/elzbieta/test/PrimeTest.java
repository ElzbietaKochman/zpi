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
		
		// Test sprawdzający poprawność konstruktora
		// new Primes()
		assertEquals(Primes.primes.size(), 2);
		
		// Testy sprawdzające poprawność podzielności liczb przez siebie
		// isNumberDividible
		assertTrue(prime.isNumberDividible(20, 5));
		assertFalse(prime.isNumberDividible(23, 4));
		
		
		// Test sprawdzający dodawanie 100 dowolnych licz do tablicy
		// addNextPrime
		for(int i =0 ; i < 100 ; i++)
			assertEquals(prime.addNextPrime(i), Primes.primes.size());
		
		prime = new Primes();
		
		// Test sprawdzający 10 pierwszych licz pierwszych
		// getNextPrime
		for(int i = 0 ; i < 10 ; i++){
			long pr = prime.getNextPrime(Primes.primes);
			long j = 2;
			while(j <= pr /2){
				if(pr % j == 0) 
					fail("Non prime detected!");
				j++;
			}
		}
		
	}

}
