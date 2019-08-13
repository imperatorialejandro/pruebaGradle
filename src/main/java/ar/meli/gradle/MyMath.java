package ar.meli.gradle;

public class MyMath {
    
	public Integer divideBySuccesiveSubtractions(Integer number, Integer another) {
		Integer count = 0;
		while(number > 0) {
			number -= another;
			count++;
		} 
		return count;
	}
	
	public Integer multiplyBySuccesiveSums(Integer number, Integer another) {
		while(another > 0) {
			number *= another;
			another--;
		} 
		return number;
	}
}
