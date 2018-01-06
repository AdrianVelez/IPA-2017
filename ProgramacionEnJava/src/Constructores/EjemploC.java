package Constructores;

public class EjemploC {
    int n1,n2,result;

    public EjemploC(int n1, int n2){
        this.n1=n1;
        this.n2=n2;

        System.out.println("datos ingresados: " + "Primer Numero: "+this.n1 +" Segundo Numero: "+ this.n2);

    }

    public void multiplicacion(){
        result = n1 * n2;
        System.out.println("El resultado de la multiplicacion es: " + result);

    }



}


