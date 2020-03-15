import java.util.List;

public interface IProblem01 {
	
	public boolean thereIsCoupleNumbersAddedUpTo(
		List<Integer>	pList,
		int				pNumber
	);
	
	/**
	 * This method should generate a bidimensional Matrix, with both dimensional sizes equals to the List Size.
	 * 
	 * Each position should be the sum of the Element at that index position. 
	 * The Diagonal values should be -1,  indication that an element of the list should not be summed to .
	 * Example:
	 *  - Assuming this List [10, 15, 3, 7].
	 *  - The resultant Matrix should be this one:
	 *
	 *	  -1		10+15			10+3		10+7
	 *  15+10		-1				15+3		15+7
	 *  3+10		3+15			-1			3+7
	 *  7+10		7+15			7+3			-1
	 *  
	 *  
	 *  	-1		10+15=25		10+3=13		10+7=17
	 *  15+10=25		-1			15+3=18		15+7=22
	 *  3+10=13		3+15=18				-1		3+7=10
	 *  7+10=17		7+15=22			7+3=10			-1
	 *  
	 *  
	 *  	-1			25			13			17
	 *  	25			-1			18			22
	 *  	13			18			-1			10
	 *  	17			22			10			-1
	 * 
	 * @param pList
	 * @return
	 */
	public int[][] generateSumMatrix(List<Integer> pList);
	
}