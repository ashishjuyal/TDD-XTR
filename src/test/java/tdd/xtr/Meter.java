package tdd.xtr;


public class Meter {

	private int length;
	
	Meter(int length) {
		this.length = length;
	}
	
	public Meter times(int multiplier) {
		return new Meter (this.length * multiplier);
	}


	@Override
	public boolean equals(Object obj) {
		Meter meterObj = (Meter) obj;
		return this.length == meterObj.length;
	}
	
}
