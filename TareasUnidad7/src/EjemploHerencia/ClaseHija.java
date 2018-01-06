package EjemploHerencia;


public class ClaseHija extends ClasePadre {


    public void HeredaPadre(){

        System.out.println("Este metodo hijo solo es para comprobar que se le han heredado todos los metodos de la clase padre: \n");
        MetodoMultiplicacionPadre(10,5);
        MetodoDivisionPadre(10,5);

    }

}
