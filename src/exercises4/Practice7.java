package exercises4;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese valores para la matriz 3x3");
        for (int i =0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                System.out.print("Ingrese valor para la fila " + (i+1) + ",columna " + (j+1) + ": ");
                int num = scanner.nextInt();
                matriz[i][j] = num;
            }
        }

        System.out.println("Matriz actual: ");
        for (int i =0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Ingrese valor a buscar en matriz: ");
        int search = scanner.nextInt();

        boolean exist = false;
        for (int i =0; i<matriz.length; i++){
            for (int j =0; j<matriz[i].length; j++){
                if (matriz[i][j] == search){
                    exist = true;
                    System.out.println("El numero " + search + " existe en la matriz");
                }
            }
        }
        if (!exist){
            System.out.println("El numero " + search + " no existe en la matriz");
        }
    }
}
