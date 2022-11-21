import java.util.Scanner;

public class EjercicioTRES {
    public static void main(String[] args) {

        System.out.println("Ejercicio 3- Con el ciclo Do-While solicitar un número y cuando  se ingrese uno mayor que 500 debe detenerse,\n así que la condición para que se siga ejecutando es que el numero sea menor a 500. Si para que se detenga, el numero debe ser mayor a 500,\n entonces para seguirse ejecutando el numero debe ser menor o igual a 500");
        Scanner lectura = new Scanner(System.in);
        System.out.println();
        int numero=0;
        do {
            System.out.println("Ingrese un numero");
            numero = lectura.nextInt();
         }while (numero <=500);
        System.out.println("Numero encontrado");
    }
}
