package tdd.xtr;

public class FizzBuzz {

	private int num;
	
	public FizzBuzz(int num) {
		this.num = num;
	}
	
	public String myMethod() {
		
		if(num%3 == 0) {
			return "Fizz";
		}
		
		return String.valueOf(num);
	}
	
}
