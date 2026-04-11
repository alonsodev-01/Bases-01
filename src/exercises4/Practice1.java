package exercises4;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 5 notas:");
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ":");
            double nota = sc.nextDouble();
            notas[i] = nota;
        }

        double promedio = Arrays.stream(notas).sum() / notas.length;
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
