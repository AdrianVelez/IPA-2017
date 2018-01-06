package ClasesyObjetos;

public class principalCO {

    public static void main (String[]args){
        Automovil auto=new Automovil();

        System.out.println("Las caracteristicas del automovil son "+" color: "+ auto.colorAuto+ " tipo: "+ auto.tipo + " marca: " +auto.marca);

        //Primeros metosos de la clase  Automovil
        System.out.println("\nPrimeros metodos de la clase del Automovil");
        auto.AvanzandoAuto();
        System.out.println("Estatus:");
        auto.estatusAuto();

        System.out.println("\nSegundos metodos de la clase del Automovil");
        auto.DeteniendoAuto();
        System.out.println("Estatus:");
        auto.estatusAuto();

    }

}
