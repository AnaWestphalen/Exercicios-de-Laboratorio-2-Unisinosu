import java.util.Scanner;

//Exercício 3: Escreva um método que leia 10 valores double do teclado e armazene-os em uma
//matriz de dimensões 2x5. Seu método deve retornar esta matriz.

public class Exercicio3 {
    public double[][] doubleMatrix() {
        Scanner s = new Scanner(System.in);
        double[][] matriz = new double[2][5];

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o próximo valor decimal:");
                matriz[i][j] = Double.parseDouble(s.next());
            }
        return matriz;
    }
}
