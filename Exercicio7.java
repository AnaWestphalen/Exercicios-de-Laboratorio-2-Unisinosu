//Exercício 7: Crie um método que recebe uma matriz de double e retorna o maior valor da matriz.

public class Exercicio7 {

    public double highestValue(double [][] matrix) {
        double highValue = matrix[0][0];

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                if(matrix[i][j] > highValue)
                    highValue = matrix[i][j];

        return highValue;
    }
}
