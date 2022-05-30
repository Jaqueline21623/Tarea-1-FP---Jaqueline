import java.util.Scanner;

public class ejercicio {
    public static void imprimeif_1(String[] args) {
        Scanner obtener = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = obtener.nextInt();
        if (numero > 999 & numero > 100000){
            int a = numero / 1000;
            int b = numero - (a*1000);
            int c = b / 100;
            int d = b - (c*100);
            int e = d / 10;
            int f = d - (e*10);
            int g = (f*1000)+(e*100)+(c*10)+0;
            System.out.println("*\n");
        }System.out.println("imprime if: "); imprimeif_1; ;
    }
}
