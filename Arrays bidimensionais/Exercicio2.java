import java.util.Scanner;

//Exercício 2: Crie um método que retorna uma matriz de inteiros com números aleatórios positivos
//menores que 100. O tamanho da matriz deve ser solicitado pelo teclado dentro do método

public class Exercicio2 {
    public int[][] randomNumbers(){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o número de linhas:");
        int linhas = Integer.parseInt(s.next());
        System.out.println("Informe o número de colunas:");
        int colunas = Integer.parseInt(s.next());

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i<matriz.length; i++)
            for (int j = 0; j<matriz[i].length; j++)
               matriz[i][j] = (int)(Math.random()*100);

        return matriz;
    }
}
