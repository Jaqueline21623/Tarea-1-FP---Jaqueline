import java.util.Scanner;
public class ejercicio420JHC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int monedas_de_1, monedas_de_2, monedas_de_5, billetes_de_10, billetes_de_20, billetes_de_50;
        int cantidad_de_dinero;
        System.out.print("Ingresa el valor de monedas de 1: ");
        monedas_de_1 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 2: ");
        monedas_de_2 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de monedas de 5: ");
        monedas_de_5 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 10: ");
        billetes_de_10 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 20: ");
        billetes_de_20 = in.nextInt();
        in.nextLine();
        System.out.print("Ingresa el valor de billetes de 50: ");
        billetes_de_50 = in.nextInt();
        in.nextLine();
        cantidad_de_dinero=(monedas_de_1*1)+(monedas_de_2*1)+(billetes_de_10*1)+(billetes_de_20*1)+(billetes_de_50*1);
        System.out.println("Valor de cantidad de dinero: " + cantidad_de_dinero);
    }

}