import java.util.Scanner;

public class EjercicioUNO {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1- Se requiere un programa que pueda crear la tabla de multiplicar del número que el usuario indique por medio del ciclo FOR;\n esta debe ser impresa del 1 al 10. Ejemplo, si el usuario indica que desea crear la tabla del 5,\n entonces el resultado debería ser el siguiente:");
        Scanner lectura = new Scanner(System.in);
        int multiplicador;
        System.out.println("Seleccione Multiplicador");
        multiplicador = lectura.nextInt();
        System.out.println("la tabla seleccionada es la del: "+multiplicador);
        for (int i = 0; i < 11; i++) {

            System.out.println(i+ "x" +multiplicador+ "= "+ i * multiplicador);
        }
    }
}
