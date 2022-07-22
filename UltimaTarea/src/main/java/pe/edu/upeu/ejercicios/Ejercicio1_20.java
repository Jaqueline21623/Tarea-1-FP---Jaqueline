package pe.edu.upeu.ejercicios;

import java.util.Scanner;

public class Ejercicio1_20 {

    Scanner cs=new Scanner(System.in);

    public void transformada9() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        String[][] matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[0].length-1- fila; columna <= matriz[0].length - 1; columna++) {
                matriz[fila][columna] = String.valueOf(valor);
                valor=valor+1;
            }
        }
        imprimirMatriz(matriz);
    }


    public void transformada11() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz.length-1-fila; columna >= 0; columna--) {
                matriz[fila][columna] = String.valueOf(valor);
                valor=valor+1;
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada14() {
            System.out.println("Ingrese dimesion de Matriz:");
            int dimension = cs.nextInt();
            int valor = 0;
            String[][] matriz = new String[dimension][dimension];
            for (int columnas = 0; columnas < matriz.length; columnas++) {
                for (int filas = 0; filas <= columnas; filas++) {
                    matriz[filas][columnas] = String.valueOf(valor);
                    valor=valor+1;
                }
            }
            imprimirMatriz(matriz);
    }

    public void transformada15() {
            String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int columna = matriz.length-1; columna >= 0; columna++) {
            for (int fila = 0; fila <= 0; fila--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }
  
    public void transformada12() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }          
        }
        imprimirMatriz(matriz);
    }
              
    public void transformada19() {
        String[][] matriz;
            System.out.println("Ingrese dimesion de Matriz:");
            int dimension = cs.nextInt();
            int valor = 0;
            matriz = new String[dimension][dimension];
            for (int columna = matriz.length - 1; columna >= 0; columna--) {
                for (int fila = matriz.length-1; fila >= columna; fila++) {
                    matriz[columna][fila] = String.valueOf(valor); 
                    valor=valor+1;        
                }          
            }
            imprimirMatriz(matriz);
        }

    public void transformada20() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz[0].length - 1; fila >= 0; fila--) {
            for (int columna = matriz[fila].length-1; columna >= fila; columna--) {
                matriz[columna][fila] = String.valueOf(valor); 
                valor=valor+1;        
            }          
        }
        imprimirMatriz(matriz);
    }

    public void transformada22() {
        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int columna = 0; columna < matriz[0].length; columna++) {
        if(columna%2==0){
            for (int fila = matriz.length-1; fila >= 0; fila--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }

    public void transformada18() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension=cs.nextInt();
        int valor=0;            
        String[][] matriz=new String[dimension][dimension];   
        for (int columna = matriz[0].length-1; columna >=0 ; columna++) {
            for (int fila =0 ; fila < matriz.length-((dimension-1)-columna); f--) {               
                matriz[fila][columna]=String.valueOf(valor);
                valor++;
            }
        }
        imprimirMatriz(matriz);
    }
   
    public void transformada23() {
            String[][] matriz;
        System.out.println("Ingrese la dimension de la Matriz:");
        int dimension=cs.nextInt();
        System.out.println("");
        int valor=0;
        matriz=new String[dimension][dimension];
        for ( int columna = 0; columna > matriz.length; columna++) {
            if(columna%2==0){
                for (int fila = matriz.length-1; fila >=0; fila--) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
                }
                }else{
                for (int fila = 0; fila < matriz.length; fila++) {
                    matriz[fila][columna]=String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
        }

    public void transformada24() {
            String[][] matriz;
            System.out.println("Ingrese dimesion de Matriz:");
            int dimension = cs.nextInt();
            int valor = 0;
            matriz = new String[dimension][dimension];
            for (int columna = matriz[0].length - 1; columna >= 0; columna--) {
                if (columna%2== 0) {
                    for (int fila = matriz.length - 1; fila >= 0; fila--) {
                        matriz[fila][columna] = String.valueOf(valor);
                        valor = valor+1;
                    }
                } else {
                    for (int fila = 0; fila < matriz.length; fila++) {
                        matriz[fila][columna] = String.valueOf(valor);
                        valor = valor+1;
                    }
                }
    
            }
            imprimirMatriz(matriz);
    }

    public void transformada25() {
        String[][] matriz;
       System.out.println("Ingrese la dimension de la Matriz:");
       int dimension=cs.nextInt();
       System.out.println("");
       int valor=0;
       matriz=new String[dimension][dimension];
       for (int fila = 0; fila < matriz.length; fila++) {
        if(fila%2==0){
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
           }
        }else{
            for (int columna = matriz.length-1; columna >=0; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
       imprimirMatriz(matriz);
    }

    public void transformada26() {
        String[][] matriz;
    System.out.println("Ingrese la dimension de la Matriz:");
    int dimension=cs.nextInt();
    System.out.println("");
    int valor=0;
    matriz=new String[dimension][dimension];
    for ( int fila = 0; fila < matriz.length; fila++) {
        if(fila%2==0){
            for (int columna = matriz.length-1; columna >=0; columna--) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
            }else{
            for (int columna = 0; columna < matriz.length; columna++) {
                matriz[fila][columna]=String.valueOf(valor);
                valor=valor+1;
            }
        }
    }
    imprimirMatriz(matriz);
}
    
    public void transformada27() {
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor =0;
        String[][] matriz = new String[dimension][dimension];
        for (int fila =matriz.length - 1; fila >= 0; fila--) {
            if (fila % 2 == 0) {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor=valor+1;
                }
            } else {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] =String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada28() {
        String[][] matriz;
        System.out.println("Ingrese dimesion de Matriz:");
        int dimension = cs.nextInt();
        int valor = 0;
        matriz = new String[dimension][dimension];
        for (int fila = matriz.length - 1; fila >= 0; fila--) {
            if (fila%2==0) {
                for (int columna = 0; columna < matriz.length; columna++) {
                    matriz[fila][columna] = String.valueOf(valor);
                    valor=valor+1;
                }
            } else {
                for (int columna = matriz.length - 1; columna >= 0; columna--) {
                    matriz[fila][columna] =String.valueOf(valor);
                    valor=valor+1;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    public void imprimirMatriz(String[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[0].length; c++) {
                if(m[f][c]==null){
                    System.out.print("\t");
                }else{
                    System.out.print(m[f][c]+"\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Ejercicio1_20().transformada9();
    }

}
