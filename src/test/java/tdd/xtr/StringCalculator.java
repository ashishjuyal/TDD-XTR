package tdd.xtr;

public class StringCalculator {

	public int checksum(String string) {
		if(string.isEmpty()){
			return 0; 
		}
		String[] splitted=string.split(",");
		int sum=0;
		for(String value:splitted){
			sum+=Integer.parseInt(value);
		}
		return sum;
	}

}
