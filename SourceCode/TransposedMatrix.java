public class TransposedMatrix{
    public static void main(String[] args){
        int originalMatrix[][] = {{1,2},{3,4}};
        int rows = originalMatrix.length;
        int columns = originalMatrix[0].length;

        int transposedMatrix[][] = new int[columns][rows];

        System.out.println("Original Matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(originalMatrix[i][j] + " ");
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Transposed Matrix");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

