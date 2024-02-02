import java.util.Scanner;

public class DoWhileEjercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEstudiantesManana = 5;
        int totalEstudiantesTarde = 6;
        int totalEstudiantesNoche = 11;

        int contadorManana = 0;
        int contadorTarde = 0;
        int contadorNoche = 0;

        int sumaEdadesManana = 0;
        int sumaEdadesTarde = 0;
        int sumaEdadesNoche = 0;

        // Leer las edades de los estudiantes del turno mañana
        System.out.println("Ingrese las edades de los estudiantes del turno mañana:");
        do {
            System.out.print("Estudiante " + (contadorManana + 1) + ": ");
            int edad = scanner.nextInt();
            sumaEdadesManana += edad;
            contadorManana++;
        } while (contadorManana < totalEstudiantesManana);

        // Leer las edades de los estudiantes del turno tarde
        System.out.println("Ingrese las edades de los estudiantes del turno tarde:");
        do {
            System.out.print("Estudiante " + (contadorTarde + 1) + ": ");
            int edad = scanner.nextInt();
            sumaEdadesTarde += edad;
            contadorTarde++;
        } while (contadorTarde < totalEstudiantesTarde);

        // Leer las edades de los estudiantes del turno noche
        System.out.println("Ingrese las edades de los estudiantes del turno noche:");
        do {
            System.out.print("Estudiante " + (contadorNoche + 1) + ": ");
            int edad = scanner.nextInt();
            sumaEdadesNoche += edad;
            contadorNoche++;
        } while (contadorNoche < totalEstudiantesNoche);

        scanner.close();

        // Calcular los promedios de cada turno
        double promedioManana = (double) sumaEdadesManana / totalEstudiantesManana;
        double promedioTarde = (double) sumaEdadesTarde / totalEstudiantesTarde;
        double promedioNoche = (double) sumaEdadesNoche / totalEstudiantesNoche;

        // Imprimir los promedios de cada turno
        System.out.println("Promedio de edades del turno mañana: " + promedioManana);
        System.out.println("Promedio de edades del turno tarde: " + promedioTarde);
        System.out.println("Promedio de edades del turno noche: " + promedioNoche);

        // Determinar el turno con el promedio de edades mayor
        if (promedioManana > promedioTarde && promedioManana > promedioNoche) {
            System.out.println("El turno mañana tiene el promedio de edades mayor.");
        } else if (promedioTarde > promedioManana && promedioTarde > promedioNoche) {
            System.out.println("El turno tarde tiene el promedio de edades mayor.");
        } else if (promedioNoche > promedioManana && promedioNoche > promedioTarde) {
            System.out.println("El turno noche tiene el promedio de edades mayor.");
        } else {
            System.out.println("Hay más de un turno con el mismo promedio de edades mayor.");
        }
    }
}
