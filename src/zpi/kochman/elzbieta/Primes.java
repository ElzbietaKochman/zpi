package zpi.kochman.elzbieta;

import java.util.ArrayList;
import java.util.List;

public class Primes {
	public final int primes_num = 10001;
	public static List<Long> primes;

	public Primes(){
		primes = new ArrayList<Long>();
		primes.add(2L);
		primes.add(3L);
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
}
