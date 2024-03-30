//Exercício 9: Crie um método que recebe um array bidimensional de double e retorna a média dos valores deste array.

public class Exercicio9 {
    public double averageValues(double [][] matrix) {
        double sum = 0;
        int totalElements = 0;
        double average = 0;

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                sum += matrix[i][j];
                totalElements ++;

        average = sum/totalElements;

        return average;
    }
}
