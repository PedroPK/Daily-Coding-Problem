import java.util.List;

public class Problem01 implements IProblem01 {

	public boolean thereIsCoupleNumbersAddedUpTo(List<Integer> pList, int pNumber) {
		boolean		response	=	false;
		
		int[][] matrix = generateSumMatrix(pList);
		
		matrix.toString();
		
		return response;
	}
	
	public int[][] generateSumMatrix(List<Integer> pList) {
		int[][]		matrix		=	new int[pList.size()][pList.size()];
		
		for (		int row = 0;	row < pList.size();		row = row + 1	) {
			for (	int col = 0;	col < pList.size();		col = col + 1	) {
				
				// To avoid sum a list element to itself
				if ( row == col ) {
					matrix[row][col]	=	-1;
				} else {
					matrix[row][col]	=	pList.get(row)		+		pList.get(col);
				}
			}
		}
		return matrix;
	}

}
