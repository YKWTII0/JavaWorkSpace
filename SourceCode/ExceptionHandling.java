public class ExceptionHandling {
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{3,4,5}};
        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.println("Original Matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        try {
            System.out.println(" ");
            System.out.println("Row sum");
            for (int i = 0; i < rows; i++) {
                int rowSum = 0;
                for (int j = 0; j < columns; j++) {
                    rowSum += matrix[i][j];
                }
                System.out.println("Sum of " + (i+1) + "th row : " + rowSum);
            }

            System.out.println(" ");
            System.out.println("Column Sum");
            for (int j = 0; j < columns; j++) {
                int colSum = 0;
                for (int i = 0; i < rows; i++) {
                    colSum += matrix[i][j];
                }
                System.out.println("Sum of " + (j+1) + "th column : " + colSum);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Matrix is not rectangular.");
        }

    }
}
