package exercises5;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa valores al array");
        int[] num_array = new int[5];

        for (int i = 0; i < num_array.length; i++) {
            num_array[i] = input.nextInt();
        }

        System.out.println("Imprimiendo elementos del array");
        for (int i = 0; i < num_array.length; i++) {
            System.out.print(num_array[i] + " ");
        }
    }
}
