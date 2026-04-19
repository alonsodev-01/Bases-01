package exercises4;

public class Practice3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Array original");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nArray invertido");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
