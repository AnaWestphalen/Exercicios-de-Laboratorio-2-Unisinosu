//Exercício 6: Crie um método que recebe uma matriz de double e retorna um String de saída para ela, com seus valores
// separados por um hífen, mas mantendo o formato da matriz.

public class Exercicio6 {
    public String conversionString(double [][] matrix) {
        String conversion = "";

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                conversion += j == matrix[i].length-1 ? matrix[i][j] + "\n" : matrix[i][j]+" - ";

        return conversion;
    }
}
