package EjemploHerencia;

public class principalH {

    public static void main (String[]args){
        //Este es un ejemplo sencillo solo para ver herencia simple soportada por java.
        ClaseHija objetoHereda = new ClaseHija();
        objetoHereda.HeredaPadre();

        //En este apartado se traenlos metodos de la ClasePadre con instanciando un objeto de la ClaseHija
        System.out.println("\nDe forma directa: \n ");
        objetoHereda.MetodoMultiplicacionPadre(8,5);
        objetoHereda.MetodoDivisionPadre( 20,5);
    }
}
