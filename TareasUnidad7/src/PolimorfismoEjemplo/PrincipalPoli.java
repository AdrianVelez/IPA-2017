package PolimorfismoEjemplo;

public class PrincipalPoli {
    public static void main(String[] args){

        //El polimorfismo es parecido a la sobrecarga de metodos, solo que a diferencia de las sobrecargas el polimorfismo se da en diferentes clases.
        //A los metodos que repiten su nombre en diferentes clases, se les llama polimorfismo, a si realicen otras actividades.
        //En la sobrecarga es necesario cambiar los parametros de los metodos para que puedan llamarse igual y en el polimorfismo no es nesesario.

        Polimorfismo1 poli1=new Polimorfismo1();
        poli1.MetodoEjemplo(10,5);

        System.out.println("\n");

        //Con este objeto creamos una instancia hacia el metodo de ejemplo.
        Polimorfismo2 poli2 = new Polimorfismo2();
        poli2.MetodoEjemplo(10,5);
    }

}
