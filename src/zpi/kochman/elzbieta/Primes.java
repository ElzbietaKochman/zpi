package zpi.kochman.elzbieta;

import java.util.ArrayList;
import java.util.List;

public class Primes {
	public final int primes_num = 10001;
	public List<Long> primes;

	public Primes(){
		primes = new ArrayList<Long>();
	}

	public static void main(String args[]){
		
	}

	public boolean isNumberDividible(long number, long divider){
		if(number % divider!=0){
			return false;
		}
		return true;
	}

	
	public int addNextPrime(long prime){
		primes.add(prime);
		return primes.size();
	}
}
