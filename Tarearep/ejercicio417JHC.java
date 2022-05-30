import java.util.Scanner;
public class ejercicio417JHC {
    public static void main(String[] args) {
        double P, ahorros, i, n;
        n=2021-1961;
        P=1500.0;
        i=15.0/100.0;
        ahorros=P*Math.pow(1.0+i,n);
        System.out.println("Valor de P: " + P);
        System.out.println("Valor de ahorros: " + ahorros);
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de n: " + n);
    }

}