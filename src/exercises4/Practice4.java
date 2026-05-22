package exercises4;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros");
        int[] numeros =  new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el numero a buscar");
        int search = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == search) {
                contador++;
            }
        }

        System.out.println("El numero " + search + " aparece " + contador + " veces");
    }
}
