package exercises4;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese 6 números enteros:");
        int[] lista_numeros = new int[6];

        for (int i = 0; i < lista_numeros.length; i++) {
            lista_numeros[i] = scanner.nextInt();
        }

        int num_menor = lista_numeros[1];
        for (int i = 0; i < lista_numeros.length; i++) {
            int temp = lista_numeros[i];
            if (temp <= num_menor) {
                num_menor = temp;
            }
        }

        int num_mayor = lista_numeros[1];
        for (int i = 0; i < lista_numeros.length; i++) {
            int temp = lista_numeros[i];
            if (temp >= num_mayor) {
                num_mayor = temp;
            }
        }

        System.out.println("Mayor valor: " + num_mayor);
        System.out.println("Menor valor: " + num_menor);
    }
}
