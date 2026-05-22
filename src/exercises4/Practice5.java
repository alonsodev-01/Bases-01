package exercises4;

public class Practice5 {
    public static void main(String[] args) {
        int[][] matriz1 = { //is same like new int [2][3]
                {2, 2, 1},
                {1, 5, 3}
        };
        int[][] matriz2 = {
                {4, 4, 6},
                {6, 9, 9}
        };

        System.out.println("Matriz 1: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }

        int[][] sum_matriz = new int[2][3];
        for (int i = 0; i < sum_matriz.length; i++) {
            for (int j = 0; j < sum_matriz[i].length; j++) {
                sum_matriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Suma de matrices: ");
        for (int i = 0; i < sum_matriz.length; i++) {
            for (int j = 0; j < sum_matriz[i].length; j++) {
                System.out.print(sum_matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
