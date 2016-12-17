package tdd.xtr;

public class StringCalculator {

	public int checksum(String string) {
		if(string.isEmpty()){
			return 0; 
		}
		return Integer.parseInt(string);
	}

}
