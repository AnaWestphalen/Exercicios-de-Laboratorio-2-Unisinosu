//Exercício 10: Crie um método que devolve uma matriz de caracteres lidos do teclado. O número de linhas da matriz deve
//ser aleatório, entre 1 e 5, enquanto o número de colunas deve ser também aleatório, porém, entre 1 e 3.

import java.util.Scanner;

public class Exercicio10 {
    public char[][] charMatrix() {
        Scanner s = new Scanner(System.in);

        int lines = (int)(Math.random()*5+1);
        int columns = (int)(Math.random()*3+1);

        char[][] matrix = new char[lines][columns];

        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++){
                System.out.println("Digite o próximo valor (char):");
                matrix[i][j] = s.next().charAt(0);
            }

        return matrix;
    }
}
