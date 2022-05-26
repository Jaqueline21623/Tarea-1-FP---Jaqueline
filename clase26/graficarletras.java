package clase26;
import java.util.Scanner;

/**
 * practicas
 */
public class graficarletras {
    
        static Scanner leerT=new Scanner(System.in);

        public static void graficarA() {
            System.out.println("ingrese altura de la letra: ");
            int cantF=leerT.nextInt();
            System.out.println("ingrese numero de filas para linea: ");
            int numFilLine=leerT.nextInt();
            int medio=cantF+1;
            for (int f = 1; f <= cantF; f++) {
                for (int c = 1; c <= 2*cantF+1; c++) {
                    if (f==1 && medio==c){
                        System.out.print("*");
                    }else if(c==medio-f && f>1){
                        System.out.print("*");
                    }else if(c==medio+f && f>1){
                        System.out.print("*");
                    }else if(f==numFilLine && c>=medio-f && c<=medio+f){
                        System.out.print("*");
                    }else if(c==medio+f && f>1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }  
                }
                System.out.print("\n");
            }

            for (int f = 8; f <= cantF; f++) {
                for (int c = 6; c <= 8*cantF+1; c++) {
                    if (f==1 && medio==c){
                        System.out.print("*");
                    }else if(c==medio-f && f>3){
                        System.out.print("*");
                    }else if(c==medio+f && f>3){
                        System.out.print("*");
                    }else if(f==numFilLine && c>=medio-f && c<=medio+f){
                        System.out.print("*");
                    }else if(c==medio+f && f>3){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                System.out.println("\n");
            }
            System.out.println("");
        }
    }
public static void main(String[] args) {
    graficarA();
}
    
}
        