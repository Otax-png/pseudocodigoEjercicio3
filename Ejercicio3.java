import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number, factorial;

        System.out.println("Ingrese un numero entero y se le devolvera el factorial del mismo");
        number = entrada.nextInt();
        factorial = 1;

        if (number >= 0) {
            for (int i = 1; i <= number ; i++) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + number + " es " + factorial);
        }
    }
}