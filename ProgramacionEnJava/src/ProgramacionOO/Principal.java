package ProgramacionOO;

import Encapsulamiento.ClaseRestringida;

public class Principal {

    public static void main(String[] args){

        ClaseRestringida objeto2 = new ClaseRestringida();
        objeto2.accesoaMetodoPublico(122);

        recipiente vasito= new recipiente();

        System.out.println("El tamaño del recipiente es "+vasito.tamaño+" El color del recipiente es: "+ vasito.colordeRecipiente);
        System.out.println("" + vasito.statusdelVaso);

        vasito.llenarRecipiente();

        vasito.estatusVaso();

        vasito.vaciarVaso();

    }

}
