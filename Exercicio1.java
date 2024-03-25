//a) Crie um método chamado exercicio1a, que retorna o array de inteiros abaixo:
//0 1 2 3 4 5 6 7 8 9
//0 1 2 3 4 5 6 7 8 9
//0 1 2 3 4 5 6 7 8 9

//b) Crie um método chamado exercicio1b, que retorna o array de inteiros abaixo:
//0 1 4 9 16 25 36 49 64 81
//0 1 4 9 16 25 36 49 64 81
//0 1 4 9 16 25 36 49 64 81
//0 1 4 9 16 25 36 49 64 81
//0 1 4 9 16 25 36 49 64 81

//c) Crie um método chamado exercicio1c, que retorna o array de inteiros abaixo:
//0 0 0 0 0 0
//1 1 1 1 1 1
//2 2 2 2 2 2
//3 3 3 3 3 3
//4 4 4 4 4 4
//5 5 5 5 5 5

//d) Crie um método chamado exercicio1d, que retorna o array de inteiros abaixo:
//-1 -1 -1 -1 -1 -1
//0 0 0 0 0 0
//-1 -1 -1 -1 -1 -1
//0 0 0 0 0 0
//-1 -1 -1 -1 -1 -1
//0 0 0 0 0 0
//-1 -1 -1 -1 -1 -1
//0 0 0 0 0 0
//-1 -1 -1 -1 -1 -1

public class Exercicio1 {
    public int[][] exercicio1a() {
        int[][] array = new int[3][10];
        for (int i = 0; i<array.length; i++)
            for(int j = 0; j<array[i].length; j++)
                array[i][j] = j;

        return array;
    }

    public int[][] exercicio1b() {
        int[][] array = new int [5][10];
        for (int i = 0; i<array.length; i++)
            for(int j = 0; j<array[i].length; j++)
                array[i][j] = j * j;

        return array;
    }

    public int[][] exercicio1c() {
        int[][] array = new int [6][6];
        for (int i = 0; i<array.length; i++)
            for(int j = 0; j<array[i].length; j++)
                array[i][j] = i;

        return array;
    }

    public int[][] exercicio1d() {
        int[][] array = new int [9][6];
        for (int i = 0; i< array.length; i++)
            for(int j = 0; j<array[i].length; j++)
                if(i % 2 == 0)
                    array[i][j] = -1;
                else
                    array[i][j] = 0;

        return array;
    }
}
