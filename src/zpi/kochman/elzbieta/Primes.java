package zpi.kochman.elzbieta;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ela
 *
 */
public class Primes {
	public final int expected_prime_number = 10001;
	public static List<Long> primes;

	public Primes(){
		primes = new ArrayList<Long>();
		primes.add(2L);
		primes.add(3L);
	}

	/**
	 * Metoda sprawdzająca podzielność liczb
	 * @param number - dzielna
	 * @param divider - dzielnik
	 * @return [boolean] odpowiedź czy <b>divider</b> jest dzielnikiem <b>number</b>
	 */
	public boolean isNumberDividible(long number, long divider){
		if(number % divider!=0){
			return false;
		}
		return true;
	}


	/**
	 * Metoda dodająca liczbę pierwszę do listy aktualnych liczb pierwszych
	 * @param prime - liczba pierwsza
	 * @return [int] rozmiar listy liczb pierwszych po dodaniu danej liczby pierwszej
	 */
	public int addNextPrime(long prime){
		primes.add(prime);
		return primes.size();
	}

	/**
	 * Metoda szukająca kolejną liczbę pierwszą na podstawie listy już znalezionych
	 * @param primes - lista już otrzymanych liczb pierwszych
	 * @return [long] kolejna liczba pierwsza
	 */
	public long getNextPrime(List<Long> primes){
		long new_prime = primes.get(primes.size()-1)+1;
		while(true){
			for(Long i : primes){
				if(isNumberDividible(new_prime, i)){
					break;
				}
				else if(new_prime/i <= i){
					return new_prime;
				}
			}
			new_prime++;
		}
	}

	
	/**
	 * Metoda zwracająca odpowiedź do zadania - 10001-ta liczba pierwsza
	 * @return [long] odpowiedź na zadanie - szukana liczba pierwsza
	 */
	public long getAnswer(){
		while(Primes.primes.size() != expected_prime_number)
			Primes.primes.add(getNextPrime(Primes.primes));

		return Primes.primes.get(expected_prime_number-1);
	}
}
