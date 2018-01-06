package Encapsulamiento;

public class ClaseRestringida {
    private int numAleatorio=12345;
    private String accesodenied= "Soy una variable cadena restingida";
    protected String accesoparcial= "Soy un acceso parcial protected";

    private void accesoaMetodoPrivado(){
        System.out.println(numAleatorio);

    }
    public void accesoaMetodoPublico(int numAleatorio){
        this.numAleatorio= numAleatorio;
        System.out.println(this.numAleatorio);
    }


    void accesoaMetodoPorDefecto(String accesodenied){
        this.accesodenied = accesodenied;
        System.out.println(this.accesodenied);

    }

    protected void accesoaMetodoProtegido(String accesoparcial){
        this.accesoparcial= accesoparcial;
        System.out.println(this.accesoparcial);

    }

}
