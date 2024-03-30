//Exercício 8: Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.

public class Exercicio8 {
    public int sumValues(int [][] matrix) {
        int result = 0;

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                result += matrix[i][j];

        return result;
    }
}
