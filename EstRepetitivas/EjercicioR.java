import java.util.Scanner;

/**
 * EjercicioR
 */
public class EjercicioR {

    public static void imprimirWhileN1_10() {
        int numInit=21;
        while (numInit<=20) {
            System.out.println(numInit);
            numInit=numInit+1;
        }
    }

    public static void imprimirDowhileN1_20() {
        int numInit=21;
        do{
            System.out.println(numInit);
            numInit++;
        } while (numInit<=20);
    }
    public static void imprimirForN1_20() {
        for (int numInit=1;numInit<=20;numInit++){
            System.out.println(numInit);
        }
    }
    public static void nombrevertical() {
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese su nombre:");
        String nombre=lt.next();
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
        }
    }
    public static void nombrebiseversa() {
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese su nombre:");
        String nombre=lt.next();
        for (int i = nombre.length()-1; i >= 0; i--) {
            System.out.println(nombre.charAt(i));
        }
    }
    public static void main(String[] args) {
        /*System.out.println("imprimi While:"); imprimirWhileN1_10();
        System.out.println("imprimi Do While:"); imprimirDowhileN1_20();
        System.out.println("imprime for:"); imprimirForN1_20();*/

        nombrevertical();
        nombrebiseversa();
    }
}