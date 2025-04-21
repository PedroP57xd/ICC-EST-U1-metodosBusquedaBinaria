import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cantidad de Personas del listado: 9");
        Persona[] personas = Persona.ingresarPersonas(9);

        Persona.ordenarPorEdadBurbuja(personas);

        Persona.mostrarEdades(personas);

        System.out.print("Edad de la persona buscada: ");
        int objetivo = scanner.nextInt();

        int resultado = Persona.busquedaBinariaRecursiva(personas, objetivo, 0, personas.length - 1);

        if (resultado != -1) {
            System.out.println("La persona con la edad " + objetivo + " es " + personas[resultado].nombre);
        } else {
            System.out.println("No se encontró ninguna persona con esa edad.");
        }

    }
}
