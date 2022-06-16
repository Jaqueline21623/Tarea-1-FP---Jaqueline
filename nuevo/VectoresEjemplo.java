package nuevo;

import java.util.Scanner;

import modelo.Persona;

/**
 * VectoresEjemplo
 */
public class VectoresEjemplo {
    public void vectoresX() {
        int edades[]=new int [10];//forma uno
        edades=new int[12];
        edades[0]=20;
        edades[1]=18;
        edades[11]=30;
        System.out.println("Edades:");
        System.out.println("Indice 0:"+edades[0]);
        System.out.println("Indice 11:"+edades[11]);
        //forma dos
        System.out.println("Forma dos");
        int edadesX[]={20,18,30,40,16};
        System.out.println(edadesX.length);
        System.out.println("indice 0:"+edadesX[0]);
        System.out.println("indice 4:"+edadesX[4]);
    }
    public void vectorObjetos() {
        Persona[] p=new Persona[27];
        p[0]=new Persona(codigo:"202210712", nombres:"Jaqueline Huahuaccapa Ccama", asistencia:false);
        p[26]=new Persona(codigo:"43631917", nombres:"David Mamani Pari", asistencia:false);

        Persona[] pp={
        new Persona(codígo:"202211714", nombres:"HANCCO SUCARI Henrry Lidhuardo ", asistencia:true),
        new Persona(codígo:"", nombres:"USCAMAYTA MAMANI YHOJANA MAGALY", asistencia:true)};

        for (int i = 0; i < pp.length; i++) {
            System.out.println(pp{i}.codigo+"\t"+pp{i}.nombres+"\t"+pp{i}.asistencia);
        };
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < pp.length; i++) {
            System.out.println(pp{i}.codigo+"\t"+pp{i}.nombres+"\t");
            System.out.println("presente?");
            pp[i].asistencias=sc.nextBoolean();
            System.out.println("");
        }
        System.out.println("*******************Registro Asistencia*******************");
        for (int i = 0; i < pp.length; i++) {
            System.out.println(pp{i}.codigo+"\t"+pp{i}.nombres+"\t"+pp{i}.asistencia);
        }
    }
    public static void main(String[] args) {
        VectoresEjemplo objx=new VectoresEjemplo();
        //objx.vectoresX();
        objx.vectoresX();
        //
    }
}