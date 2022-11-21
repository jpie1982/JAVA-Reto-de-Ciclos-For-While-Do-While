import java.util.Scanner;

public class EjercicioDOS {
    public static void main(String[] args) {

        System.out.println("Ejercicio 2- Utilizando el ciclo While,\n crear un menú de ejecución infinita hasta que el usuario desee terminar dicho ciclo.");
        Scanner lectura = new Scanner(System.in);
        int contador;
        do{
            System.out.println("Menu\n" + "1-Opcion 1\n" + "2-Opcion 2\n" + "3-Opcion 3\n" + "4-Salir\n");
            contador = lectura.nextInt();
        }

        while (contador != 4);
        System.out.println("SALIENDO MENU");
    }
}

