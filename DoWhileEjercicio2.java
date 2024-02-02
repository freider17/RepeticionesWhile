import java.util.Scanner;

public class DoWhileEjercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; // Variable para almacenar la cantidad de puntos a procesar
        int contador = 1; // Variable para llevar el conteo de puntos ingresados
        int cuadrante1 = 0; // Variable para contar los puntos en el primer cuadrante
        int cuadrante2 = 0; // Variable para contar los puntos en el segundo cuadrante
        int cuadrante3 = 0; // Variable para contar los puntos en el tercer cuadrante
        int cuadrante4 = 0; // Variable para contar los puntos en el cuarto cuadrante

        // Pedir al usuario que ingrese la cantidad de puntos a procesar
        System.out.print("Ingrese la cantidad de puntos a procesar: ");
        n = scanner.nextInt(); // Leer la cantidad de puntos a procesar

        // Utilizamos un bucle do-while para procesar los n puntos ingresados
        do {
            System.out.print("Ingrese las coordenadas (x, y) del punto " + contador + ": ");
            double x = scanner.nextDouble(); // Leer la coordenada x del punto
            double y = scanner.nextDouble(); // Leer la coordenada y del punto

            // Verificar en qué cuadrante se encuentra el punto utilizando los valores de x
            // e y
            if (x > 0 && y > 0) {
                cuadrante1++; // Si el punto se encuentra en el primer cuadrante, incrementamos el contador
                              // del primer cuadrante
            } else if (x < 0 && y > 0) {
                cuadrante2++; // Si el punto se encuentra en el segundo cuadrante, incrementamos el contador
                              // del segundo cuadrante
            } else if (x < 0 && y < 0) {
                cuadrante3++; // Si el punto se encuentra en el tercer cuadrante, incrementamos el contador
                              // del tercer cuadrante
            } else if (x > 0 && y < 0) {
                cuadrante4++; // Si el punto se encuentra en el cuarto cuadrante, incrementamos el contador
                              // del cuarto cuadrante
            }

            contador++; // Incrementar el contador para pasar al siguiente punto
        } while (contador <= n); // Repetir el ciclo hasta que se ingresen n puntos

        scanner.close();

        // Mostrar la cantidad de puntos ingresados en cada cuadrante
        System.out.println("Cantidad de puntos en el primer cuadrante: " + cuadrante1);
        System.out.println("Cantidad de puntos en el segundo cuadrante: " + cuadrante2);
        System.out.println("Cantidad de puntos en el tercer cuadrante: " + cuadrante3);
        System.out.println("Cantidad de puntos en el cuarto cuadrante: " + cuadrante4);
    }
}
