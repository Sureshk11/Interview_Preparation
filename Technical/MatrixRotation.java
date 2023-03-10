package Technical;

public class MatrixRotation 
{

	
	
	 public static void rotateMatrix(int[][] matrix){
	        int row = matrix.length;
		
	        for (int i = 0; i < row; i++){
	            for (int j = i; j < row; j++){
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
		
	        for (int i = 0; i< row; i++)
	        {
	            for(int j = 0; j< row/2; j++)
	            {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][row - 1 - j];
	                matrix[i][row - 1 - j] = temp;
	            }
	        }

	
	
	
	
	
	 }
	
	
	
	public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        MatrixRotation .rotateMatrix(matrix);
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

	
	
	
	
}

