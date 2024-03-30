//Exercício 11: Crie um método que recebe uma matriz de inteiros e retorna um array unidimensional que contém apenas
// os elementos positivos desta matriz.

public class Exercicio11 {

    public int[] positiveValues(int[][] matrix) {
        int[] positiveArray = new int[matrix.length * matrix[0].length];
        int contador = 0;

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                if(matrix[i][j] >= 0)
                    positiveArray[contador++] = matrix[i][j];

        return positiveArray;
    }
}
