import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántas contraseñas desea generar: ");
        int cantidad = sc.nextInt();

        System.out.print("¿Cuál es la longitud que desea de la contraseña : ");
        int longitud = sc.nextInt();

        Password[] passwords = new Password[cantidad];
        boolean[] fuertes = new boolean[cantidad];

        for (int i = 0; i < cantidad; i++) {
            passwords[i] = new Password(longitud); // Crear contraseña
            fuertes[i] = passwords[i].esFuerte(); // Comprobar si es fuerte
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(passwords[i].getContraseña() + " " + fuertes[i]);
        }

        sc.close();
    }
}
