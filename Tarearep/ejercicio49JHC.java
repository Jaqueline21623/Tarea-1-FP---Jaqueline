import java.util.Scanner;

public class ejercicio49JHC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad, i, n;
        double promedio;
        promedio = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de edad: ");
            edad = in.nextInt();
            in.nextLine();
            promedio=promedio+edad;
            System.out.println();
        }
        if (n == 0) {
            promedio = 0;
        } else {
            promedio=promedio/n;
        }
        System.out.println("Valor de promedio: " + promedio);
    }

}