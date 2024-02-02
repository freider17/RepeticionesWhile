import java.util.Scanner;

public class DoWhileEjercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0; // Variable para llevar el conteo de números ingresados
        int cantidadNegativos = 0; // Variable para contar la cantidad de números negativos ingresados
        int cantidadPositivos = 0; // Variable para contar la cantidad de números positivos ingresados
        int cantidadMultiplos15 = 0; // Variable para contar la cantidad de números múltiplos de 15 ingresados
        int acumuladorPares = 0; // Variable para acumular la suma de los números pares ingresados

        // Utilizamos un bucle do-while para solicitar la carga de 10 valores enteros
        // por teclado
        do {
            System.out.print("Ingrese el número " + (contador + 1) + ": ");
            int numero = scanner.nextInt(); // Leer el número ingresado por el usuario

            // Verificar si el número ingresado es negativo o positivo y aumentar los
            // contadores respectivos
            if (numero < 0) {
                cantidadNegativos++;
            } else if (numero > 0) {
                cantidadPositivos++;
            }

            // Verificar si el número ingresado es múltiplo de 15 y aumentar el contador
            // correspondiente
            if (numero % 15 == 0) {
                cantidadMultiplos15++;
            }

            // Verificar si el número ingresado es par y sumar su valor al acumulador de
            // pares
            if (numero % 2 == 0) {
                acumuladorPares += numero;
            }

            contador++; // Incrementar el contador para pasar al siguiente número ingresado
        } while (contador < 10); // Repetir el ciclo hasta que se ingresen 10 números

        scanner.close();

        // Mostrar por pantalla las estadísticas solicitadas
        System.out.println("Cantidad de valores ingresados negativos: " + cantidadNegativos);
        System.out.println("Cantidad de valores ingresados positivos: " + cantidadPositivos);
        System.out.println("Cantidad de múltiplos de 15: " + cantidadMultiplos15);
        System.out.println("Valor acumulado de los números ingresados que son pares: " + acumuladorPares);
    }
}
