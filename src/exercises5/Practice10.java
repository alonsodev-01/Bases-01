package exercises5;

public class Practice10 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        };

        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.println("\nDiagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i + j) == matriz.length - 1){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
