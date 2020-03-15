import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.*;

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
	public void test_thereIsCoupleNumbersAddedUpTo_OriginalScenario() {
		// Arrange
		List<Integer> list = getOriginalExampleList();
		int				number	=	17;
		
		// Act
		boolean response	=	this.aProblem.thereIsCoupleNumbersAddedUpTo(list, number);
		
		// Assert
		boolean expected	=	true;
		assertThat(response).isEqualTo(expected);
	}
	
	/**
	 * This is the expected Matrix
	 * 
	 * 		-1			25			13			17
	 *  	25			-1			18			22
	 *  	13			18			-1			10
	 *  	17			22			10			-1
	 *  
	 */
	@Test
	public void test_generateSumMatrix_OriginalScenario_legth() {
		// Arrange
		List<Integer> list	= getOriginalExampleList();
		
		// Act
		int[][] result		= this.aProblem.generateSumMatrix(list);
		
		// Assert
		assertThat(result.length).isEqualTo(list.size());
		assertThat(result[0].length).isEqualTo(list.size());
	}
	
	/**
	 * This is the expected Matrix
	 * 
	 * 		-1			25			13			17
	 *  	25			-1			18			22
	 *  	13			18			-1			10
	 *  	17			22			10			-1
	 *  
	 */
	@Test
	public void test_generateSumMatrix_OriginalScenario_firstRow() {
		// Arrange
		List<Integer> list	= getOriginalExampleList();
		
		// Act
		int[][] result		= this.aProblem.generateSumMatrix(list);
		
		// Assert
		assertThat(result[0][0]).isEqualTo(-1);
		assertThat(result[0][1]).isEqualTo(25);
		assertThat(result[0][2]).isEqualTo(13);
		assertThat(result[0][3]).isEqualTo(17);
	}
	
	private List<Integer> getOriginalExampleList() {
		List<Integer>	list	=	Arrays.asList(10, 15, 3, 7);
		return list;
	}
	
}
