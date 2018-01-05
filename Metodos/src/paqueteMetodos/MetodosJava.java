package paqueteMetodos;

public class MetodosJava {

    public int suma(int a, int b) {
        int resultado = a + b;
        System.out.println("El resultado de la suma de: " + a + " + " + b + " es: " + resultado);
        return resultado;
    }

    public int multiplicacion(int a, int b) {
        int resultado = a * b;
        System.out.println("El resultado de la multiplicacion de: " + a + " x " + b + " es: " + resultado);
        return resultado;
    }

    public double division(double a, double b) {
        double resultado = a/b;
        System.out.println("El resultado de la division de: " + a + " entre " + b + " es: " + resultado);
        return resultado;
    }

    public void HolaMundo() {
        System.out.println("Hola Mundo");
    }

 public static void main(String[] args) {
     MetodosJava trae = new MetodosJava();

     //presentacion
     System.out.println("Nombre: Felix Adrian Salmeron Velez");
     System.out.println("Curso: Introduccion a la programacion de aplicaciones moviles \n");


     //Se invoca al metodo de multiplicacion mandadandole como parametros los argumentos de a y b
        trae.suma(20, 10);
        trae.multiplicacion(5,8);
        trae.HolaMundo();
        trae.division(3800, 127 );

 }

}
