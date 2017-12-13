package paqueteFOR;

public class EstructuraFOR {

    public static void main (String[] args){

     int resultado;
        //presentacion
        System.out.println("Nombre: Felix Adrian Salmeron Velez");
        System.out.println("Curso: Introduccion a la programacion de aplicaciones moviles \n");

        //Nombre del ejemplo
        System.out.println("Tabla de multiplicacion del 1 al 10 con el uso de dos ciclos FOR anidados: \n");

     int i;
     int j;                 //En el primer For
     for(i=1; i<=10; i++ ){ //El valor de i es el que decide hasta que numero debe continuar la tabla, en este caso deje hasta 5 como ejemplo.

                                 //En el segundo For
         for (j=1; j<=10; j++) {//El valor de j sera el numero multiplicativo, para que lleve una secuencia hasta 10 multiplicaciones.

             resultado = (i * j); //En la variable resultado guardamos la multiplicacion que ocurre entre la posicion i con la posicion j
             System.out.println("multiplicacion de: " + i + " por " + j + " es: " + resultado);//Solo muestra el resultado ordenado.

             if (j==10){ //En caso de que la tabla de multiplicar llegue a 10 pues solo se le da un espacio.
                 System.out.println("\t");//Esta linea solo es para darle un tabulador al las tablas de multiplicar y asi se entiendan mejor.
             }

         }

     }




      }




}
