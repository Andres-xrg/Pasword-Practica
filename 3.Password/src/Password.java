import java.util.Random;

public class Password {

    private int longitud;
    private String contraseña;

    private static final int LONGITUD_DEFECTO = 8;

    public Password() {
        this.longitud = LONGITUD_DEFECTO;
        this.contraseña = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    private String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder pass = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            pass.append(caracteres.charAt(index));
        }

        return pass.toString();
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return (mayusculas > 2 && minusculas > 1 && numeros > 5);
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }
}
