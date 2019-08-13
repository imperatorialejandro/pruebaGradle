package ar.meli.gradle;

import org.assertj.core.api.Assertions;
import org.junit.Test;
public class MyMathTest {
    
	@Test 
    public void testMyMathDivideBySuccesiveSubtractions() {
        MyMath myMath = new MyMath();
        Integer result = myMath.divideBySuccesiveSubtractions(10, 2);
        Assertions.assertThat(result).isEqualTo(5);
    }
	
	@Test 
    public void testMyMathMultiplyBySuccesiveSums() {
        MyMath myMath = new MyMath();
        Integer result = myMath.multiplyBySuccesiveSums(10, 2);
        Assertions.assertThat(result).isEqualTo(20);
    }
}
