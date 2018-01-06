package PolimorfismoEjemplo;


public class Polimorfismo2 {

    int operador1,operador2,result;

    public void MetodoEjemplo(int x, int y){

        operador1=x;
        operador2=y;

        System.out.println("Este metodo se encuentra en la clase polimorfismo2.");
        result = (operador1 + operador2);
        System.out.println("El resultado de la suma de : "+operador1 +" + "+ operador2+" es: "+ result);
    }



}
