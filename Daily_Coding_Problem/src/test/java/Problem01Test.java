import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.truth.Truth;

public class Problem01Test {
	
	private Problem01		aProblem;
	
	@Before
	public void setUp() {
		this.aProblem = new Problem01();
	}
	
	/**
	 * This problem was recently asked by Google.
	 * 
	 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
	 * 
	 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
	 * 
	 * Bonus: Can you do this in one pass?
	 */
	@Test
	public void testOriginalScenario() {
		// Arrange
		List<Integer>	list	=	Arrays.asList(10, 15, 3, 7);
		int				number	=	17;
		
		// Act
		boolean response	=	this.aProblem.thereIsCoupleNumbersAddedUpTo(list, number);
		
		// Assert
		boolean expected	=	true;
		Truth.assertThat(response).isEqualTo(expected);
	}

}
