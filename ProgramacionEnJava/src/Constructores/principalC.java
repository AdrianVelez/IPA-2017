package Constructores;

import java.util.Scanner;


public class principalC {

    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        int x,y;

        System.out.println("Ingrese el primer numero: " );
        x = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: " );
        y = teclado.nextInt();



        EjemploC obj1= new EjemploC(x,y);
        obj1.multiplicacion();


    }

}
