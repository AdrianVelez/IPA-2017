package paqueteIF;
import java.util.Scanner;

public class EstructuraIF {


     static String inscrito="¡Bienvenido al curso, gracias por inscribirte!";
     static String  noinscrito="Todavia puedes ser parte del curso, ¡inscribete ya!";

    public static void main(String[] args){

        System.out.println("Nombre: Felix Adrian Salmeron Velez");
        System.out.println("Curso: Introduccion a la programacion de aplicaciones moviles \n");


        Scanner teclado=new Scanner(System.in);
         int respuesta;
         System.out.println("¿Estas inscrito al curso? \n 1.- Presione 1 en caso de estarlo.\n 2.- Si no lo esta presione cualquier otro numero \n ");
                respuesta=teclado.nextInt();

                        if (respuesta==1){
                            System.out.println("Tu respuesta fue 1, "+ inscrito + "\n");
                }
                else{
                    System.out.println("Tu respuesta fue otro numero, "+ noinscrito+"\n");
                }
    }
}
