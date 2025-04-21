import java.util.Scanner;

public class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public static Persona[] ingresarPersonas(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese Persona:");
            System.out.print(" Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print(" Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            personas[i] = new Persona(nombre, edad);
        }
        return personas;
    }
    public static void mostrarEdades(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.print(personas[i].edad);
            if (i < personas.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }
    public static void ordenarPorEdadBurbuja(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (personas[j].edad > personas[j + 1].edad) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public static int busquedaBinariaRecursiva(Persona[] personas, int edadBuscada, int bajo, int alto) {
        if (bajo > alto) {
            return -1; 
        }
    
        int centro = bajo + (alto - bajo) / 2;
        int valorCentro = personas[centro].edad;
    
        System.out.print("bajo=" + bajo + " ");
        System.out.print("alto=" + alto + " ");
        System.out.print("centro=" + centro + " ");
        System.out.print("valorCentro=" + valorCentro + " --> ");
    
        if (valorCentro == edadBuscada) {
            while (centro > 0 && personas[centro - 1].edad == edadBuscada) {
                centro--;
            }
            System.out.println("ENCONTRADO");
            return centro;
        } else if (valorCentro < edadBuscada) {
            System.out.println("DERECHA");
            return busquedaBinariaRecursiva(personas, edadBuscada, centro + 1, alto);
        } else {
            System.out.println("IZQUIERDA");
            return busquedaBinariaRecursiva(personas, edadBuscada, bajo, centro - 1);
        }
    }
}