package pe.edu.upeu.jhc.examen;

/**
 * InnerResolucionExamen
 */

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class ResolucionExamen {
    public void ejercicio2() {
        
        Scanner in = new Scanner(System.in);
        int i, n;
        double tipo_1, tipo_2, tipo_3, clave, costo;
        double impuesto, impuesto_a_pagar;
        tipo_1 = 0;
        tipo_2 = 0;
        tipo_3 = 0;
        impuesto_a_pagar = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de clave: ");
            clave = in.nextDouble();
            in.nextLine();
            System.out.print("Ingresa el valor de costo: ");
            costo = in.nextDouble();
            in.nextLine();
            impuesto=0;
            if(clave==1)
            {
                impuesto=costo*0.1;
                tipo_1=tipo_1+impuesto;
            }
            if(clave==2)
            {
                impuesto=costo*0.07;
                tipo_2=tipo_2+impuesto;
            }
            if(clave==3)
            {
                impuesto=costo*0.05;
                tipo_3=tipo_3+impuesto;
            }
            impuesto_a_pagar=impuesto_a_pagar+impuesto;
            System.out.println("Valor de impuesto: " + impuesto);
            System.out.println();
        }
        System.out.println("Valor de tipo 1: " + tipo_1);
        System.out.println("Valor de tipo 2: " + tipo_2);
        System.out.println("Valor de tipo 3: " + tipo_3);
        System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
    }


    
    public void ejercicio3() {
        //definir variables
        int nut;
        System.out.println("dame la altura de X: ");
        nut = leer.nextInt();
        for (int i = 1; i <= nut; i++) {
            for (int h = 1; h <= nut ; h++) {
                if (i==h||i+h==nut+1) {
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
                System.out.println();
            }
        }
    }
    public void ejercicio4() {
        int i, l, suma, sec = 0;
        System.out.print("Introduzca numero >0: ");
        
        int cantidad = ls.nextInt();
        System.out.println("Binario: ");
        for (int i= 1; i > 0 ; i++) {
            suma=0;
            for (int l = 1; l < i; l++) {
                if (i % l == 0) {
                    suma = suma + l;
                }
            }
            if (i == suma) {
                sec++;
                if (sec<= cantidad) {
                    System.out.println(i);
                }else{
                    break;
                }
            }
        }
    }

    
    
    public void ejercicio5_1() {
        int n;
        do {
            System.out.print("Introduzca numero >0: ");
            n =lt.nextInt();
        } while (n < 0);
        System.out.print("Binario: ");
        ejer5_2(n);
    }
    public static void ejer5_2(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            ejer5_2(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
    public static void main(String[] args) {
        new ResolucionExamen().ejercicio3();
    }

}