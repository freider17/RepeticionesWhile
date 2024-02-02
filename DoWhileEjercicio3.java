import java.util.Scanner;

public class DoWhileEjercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int sumaUltimos5 = 0;
        int[] numeros = new int[10]; // Creamos un arreglo para almacenar los 10 números

        do {
            System.out.print("Ingrese el número " + (contador + 1) + ": ");
            numeros[contador] = scanner.nextInt(); // Almacenamos el número ingresado en el arreglo
            contador++;
        } while (contador < 10); // Repetimos el ciclo hasta que se ingresen 10 números

        // Calculamos la suma de los últimos 5 valores ingresados
        for (int i = 5; i < 10; i++) {
            sumaUltimos5 += numeros[i];
        }

        scanner.close();

        System.out.println("La suma de los últimos 5 números ingresados es: " + sumaUltimos5);
    }
}
