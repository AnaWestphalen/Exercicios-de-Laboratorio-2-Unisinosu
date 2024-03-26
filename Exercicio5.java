//Exercício 5: Crie um método que recebe um array bidimensional de double e retorna a quantidade de elementos deste array.

public class Exercicio5 {
    public int quantityElements(double [][] matrix) {
        int totalElements = 0;

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                totalElements++;

        return totalElements;
    }
}

//Nessa solução assumi que as linhas do array podem ter tamanhos variados.