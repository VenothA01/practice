package TrickyAlgorithm;

public class MatrixTranspose {



    static void reverseRow(int[][] matrix)
    {
        int outerIndex,innerIndex,k ;

        for(outerIndex=0;outerIndex<matrix.length;outerIndex++)
        {
            k = matrix.length -1 ;

            for(innerIndex=0;innerIndex<k;innerIndex++)
            {
                int temp = matrix[outerIndex][innerIndex];
                matrix[outerIndex][innerIndex] = matrix[outerIndex][k];
                matrix[outerIndex][k] = temp ;

                k-- ;

            }
        }
    }

    static void printMatrix(int[][] matrix)
    {
        int row     = matrix.length ;
        int col     = matrix[0].length ;

        int i, j ;

        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(matrix[i][j]);
            }

            System.out.println(" ");
        }
    }

    static void transposre(int[][] matrixA,int[][] matrixB)
    {
        int innerIdx,outerIdx ;

        for(outerIdx=0; outerIdx<matrixA.length;outerIdx++)
        {


            for(innerIdx=0;innerIdx<matrixA[0].length;innerIdx++)
            {

                matrixB[outerIdx][innerIdx] = matrixA[innerIdx][outerIdx] ;
            }
        }

    }
    public static void main(String args[])
    {
        int[][] matrixA = {{1,1,1,1},
                            {2,2,2,2},
                            {3,3,3,3},
                            {4,4,4,4}};


        int rowSize     = matrixA.length ;
        int colSize     = matrixA[0].length ;

        int[][] matrixB = new int[colSize][rowSize];

        transposre(matrixA,matrixB);
        reverseRow(matrixB);

        printMatrix(matrixB);



    }
}
