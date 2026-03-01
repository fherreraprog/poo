import java.util.Scanner;

public class EjemploScanner_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edad = 0;
        double nota = 0;
        boolean datosValidos = false;

        System.out.println("=== Validación Preventiva con hasNextX() ===");

        // Validación de entero
        while (!datosValidos) {
            System.out.print("Ingrese su edad (número entero): ");

            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();

                if (edad > 0) {
                    datosValidos = true;
                } else {
                    System.out.println("La edad debe ser mayor que 0.");
                }

            } else {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.next(); // Descarta entrada inválida
            }
        }

        scanner.nextLine(); // Limpia buffer

        datosValidos = false;

        // Validación de decimal
        while (!datosValidos) {
            System.out.print("Ingrese su nota final (número decimal): ");

            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    datosValidos = true;
                } else {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }

            } else {
                System.out.println("Error: Debe ingresar un número decimal.");
                scanner.next(); // Descarta entrada inválida
            }
        }

        System.out.println("\nDatos ingresados correctamente:");
        System.out.println("Edad: " + edad);
        System.out.println("Nota final: " + nota);

        scanner.close();
    }
}
