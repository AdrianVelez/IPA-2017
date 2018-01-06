package EjemploHerencia;

public class ClasePadre {

    int operador1,operador2,result;

    public void MetodoMultiplicacionPadre(int operador1,int operador2){
        this.operador1=operador1;
        this.operador2=operador2;

        result = (operador1 * operador2);
        System.out.println("El resultado de la multiplicacion de: "+operador1+" X "+operador2 +" es igual a :"+ result);
    }

    public void MetodoDivisionPadre(int operador1,int operador2){
        this.operador1=operador1;
        this.operador2=operador2;

        result = (operador1 / operador2);
        System.out.println("El resultado de la division de: "+ operador1 +" / "+operador2 +" es igual a :"+ result);
    }




}
