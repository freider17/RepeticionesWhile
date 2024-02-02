import java.util.Scanner;

public class DoWhileEjercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n; // Variable para almacenar la cantidad de triángulos que se van a ingresar
        int contador = 1; // Variable para llevar el conteo del triángulo actual
        int cantidadEquilateros = 0; // Variable para contar la cantidad de triángulos equiláteros
        int cantidadIsosceles = 0; // Variable para contar la cantidad de triángulos isósceles
        int cantidadEscalenos = 0; // Variable para contar la cantidad de triángulos escalenos

        System.out.print("Ingrese la cantidad de triángulos: ");
        n = scanner.nextInt(); // Leer la cantidad de triángulos que se van a ingresar

        do {
            System.out.print("Ingrese los lados del triángulo " + contador + ": ");
            double lado1 = scanner.nextDouble(); // Leer el primer lado del triángulo
            double lado2 = scanner.nextDouble(); // Leer el segundo lado del triángulo
            double lado3 = scanner.nextDouble(); // Leer el tercer lado del triángulo

            // Verificar si los lados ingresados forman un triángulo utilizando la función
            // esTriangulo()
            if (esTriangulo(lado1, lado2, lado3)) {
                // Si es un triángulo válido, determinar su tipo utilizando las funciones
                // esEquilatero() y esIsosceles()
                if (esEquilatero(lado1, lado2, lado3)) {
                    System.out.println("El triángulo " + contador + " es equilátero.");
                    cantidadEquilateros++; // Incrementar el contador de triángulos equiláteros
                } else if (esIsosceles(lado1, lado2, lado3)) {
                    System.out.println("El triángulo " + contador + " es isósceles.");
                    cantidadIsosceles++; // Incrementar el contador de triángulos isósceles
                } else {
                    System.out.println("El triángulo " + contador + " es escaleno.");
                    cantidadEscalenos++; // Incrementar el contador de triángulos escalenos
                }
            } else {
                System.out.println("Los lados ingresados no forman un triángulo.");
            }

            contador++; // Incrementar el contador para pasar al siguiente triángulo
        } while (contador <= n); // Repetir el ciclo hasta que se ingresen n triángulos

        scanner.close();

        // Mostrar la cantidad total de triángulos de cada tipo
        System.out.println("Cantidad de triángulos equiláteros: " + cantidadEquilateros);
        System.out.println("Cantidad de triángulos isósceles: " + cantidadIsosceles);
        System.out.println("Cantidad de triángulos escalenos: " + cantidadEscalenos);
    }

    // Función para verificar si los lados ingresados forman un triángulo
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    // Función para determinar si el triángulo es equilátero (tres lados iguales)
    public static boolean esEquilatero(double lado1, double lado2, double lado3) {
        return lado1 == lado2 && lado1 == lado3;
    }

    // Función para determinar si el triángulo es isósceles (dos lados iguales)
    public static boolean esIsosceles(double lado1, double lado2, double lado3) {
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }
}
