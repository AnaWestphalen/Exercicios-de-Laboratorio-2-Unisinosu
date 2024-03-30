//Exercício 4: Crie um método que recebe um array bidimensional de double e retorna a quantidade de elementos deste array.

public class Exercicio4 {

    public int quantityElements(double [][] matrix) {
        int totalElements = 0;

        int lines = matrix.length;
        int columns = matrix[0].length;

        totalElements = (lines * columns);

        return totalElements;
    }
}

//Nessa solução assumi que todas as linhas tem o mesmo comprimento.
