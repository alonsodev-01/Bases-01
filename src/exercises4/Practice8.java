package exercises4;

import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese valores enteros para la matriz 3x3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese valor para la fila " + (i + 1) + ",columna " + (j + 1) + ": ");
                int num = scanner.nextInt();
                matriz[i][j] = num;
            }
        }

        int sum_fila = 0;
        System.out.println("Suma por fila");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum_fila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sum_fila);
            sum_fila = 0;
        }

        int sum_columna = 0;
        System.out.println("Suma por columna");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum_columna += matriz[j][i];
            }
            System.out.println("Columna " + (i + 1) + ": " + sum_columna);
            sum_columna = 0;
        }
    }
}
