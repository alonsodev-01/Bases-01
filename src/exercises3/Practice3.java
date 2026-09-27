package exercises3;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Buscando numero");

        System.out.println("Eliga el numero a buscar");
        int num = input.nextInt();

        System.out.println("Iniciando del 1 al 100 en busca del numero");

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) System.out.println("Buscando...");
            if (i == num) break;
        }
        System.out.println("..." + num);
        System.out.println("Encontrado!");
    }
}
