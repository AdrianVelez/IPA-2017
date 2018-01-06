package ClasesyObjetos;

public class Automovil {

    boolean statusAuto;
    String colorAuto = "Rojo", tipo = "convertible", marca="ferrari";

    public void AvanzandoAuto() {
        System.out.println("El automovil avanza en este metodo ");
        statusAuto= true;
    }

    public void DeteniendoAuto() {
        System.out.println("El automovil se detiene en este metodo");
        statusAuto = false;
    }

    public void estatusAuto() {

        if (statusAuto) {
            System.out.println("El Automovil esta avanzando");

        } else {
            System.out.println("El Automovil esta detenido");
        }

    }


    }
