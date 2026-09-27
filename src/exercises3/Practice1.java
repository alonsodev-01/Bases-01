package exercises3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Detener conteo");
        System.out.println("Conteo del 1 al 100");

        System.out.println("En que numero desea detener el conteo");
        int num = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i == num) break;
        }

        System.out.println("Fin del bucle");
    }
}
