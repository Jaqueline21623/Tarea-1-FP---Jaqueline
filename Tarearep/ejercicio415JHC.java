import java.util.Scanner;
public class ejercicio415JHC {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String cad="";
      double c=1;
      int sel,q,u=1;
     System.out.println("elige una opcion\n");
     System.out.println("1. Mostrar los 20 primeros cubos\n");
     System.out.println("2. Mostrar los cubos que tengan hasta 4 digitos\n");
     System.out.println("3. Mostrar los cubos que exactamente tengan 4 digitos\n");
     sel=sc.nextInt();
     if(sel==1){
         for(q=1;q<21;q++){
             cad=cad+" "+Math.pow(q, 3);
         }
     }
     if(sel==2){
         while(c<10000){
             cad=cad+" "+c;
             u++;
             c=Math.pow(u, 3);
         }
     }
     if(sel==3){
         while(c<10000){
             if(c>=1000){
                 cad=cad+" "+c;                 
             }
              u++;
              c=Math.pow(u, 3);
         }
     }
     System.out.println(cad);
    }
}