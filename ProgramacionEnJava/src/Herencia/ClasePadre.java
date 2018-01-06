package Herencia;

public class ClasePadre {
int resultado,operador1,operador2;


    public void metodoPadre(int x, int y){
        operador1=x;
        operador2=y;
        resultado = operador1 * operador2;
    }

    public void metodoPadre2(){
        System.out.println("Este es el resultado de mi operacion clase padre: " + resultado);

    }


}
