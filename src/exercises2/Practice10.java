package exercises2;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TRIANGULO ASTERISCOS");

        System.out.println("¿Cuantos pisos deseas que tenga la figura?");
        int pisos = input.nextInt();

        for (int i = 1; i <= pisos; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
