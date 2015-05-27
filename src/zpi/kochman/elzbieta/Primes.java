package zpi.kochman.elzbieta;

public class Primes {
	final int primes = 10001;
	
	
	public static void main(String args[]){
		
	}
	
	public boolean isNumberDividible(long number, long divider){
		if(number % divider!=0){
			return false;
		}
		return true;
	}
}
