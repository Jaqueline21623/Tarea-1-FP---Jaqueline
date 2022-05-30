import java.util.Scanner;

public class ejercicio48JHC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        double deposito, suma;
        suma = 0;
        for (i=1; i<=10; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de deposito: ");
            deposito = in.nextDouble();
            in.nextLine();
            suma=suma*1.08+deposito;
            System.out.println();
        }
        System.out.println("Valor de suma: " + suma);
    }

}