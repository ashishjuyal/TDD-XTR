package tdd.xtr;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	public int checksum(String string) {
		if(string.isEmpty()){
			return 0; 
		}
		
		String[] splitted=string.split(",|\n");
		int sum=0;
		List<Integer> _NegativeNumbers=new ArrayList<>();
		for(String value:splitted){
			int nummber=Integer.parseInt(value);
			if(nummber<0){
				_NegativeNumbers.add(nummber);
			}else{
			sum+=nummber;
			}
		}
		
		if(_NegativeNumbers.isEmpty()){
			return sum;
		}else{
			throw new RuntimeException("Happened"+_NegativeNumbers.toString());
		}
	}
}
