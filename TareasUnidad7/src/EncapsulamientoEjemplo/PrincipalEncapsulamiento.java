package EncapsulamientoEjemplo;

public class PrincipalEncapsulamiento {

    public static void main (String[]args){
        ClaseProtected protect = new ClaseProtected();
        ModificadoresdeAcceso objeto1 = new ModificadoresdeAcceso();
        ClasedeAcceso objeto2 = new ClasedeAcceso();

        //Estos metodos son visibles por nuestro objeto, a excepcion del metodo privada. Esa metodo solo puede ser usado en su propia clase.
        //Si bien el metodo protected tambien puede ser instanciado por objeto1 ya que hereda de su paquete, no lo colocamos, esto con el fin
        //de ver que tambien puede ser instanciado desde una clase hijo que hereda de la clase padre.

        objeto1.accesoaMetodoPublico("Este es un metodo de acceso publico, puede ser visto por quien sea ");
        objeto1.accesoaMetodoPorDefecto("Este es un metodo por defecto pueden verlo todos menos otro paquete");

        //Clase protected que hereda de la clase Modificadores de Acceso como ejemplo para instanciar el metodo protegido.
        protect.hijoHeredaProtected();

        System.out.println("\nEn este apartado se muestran ejemplos de los metodos Set y Get\n");

        //Metodos Guetter  y Setter
        objeto2.setEntero1(10);
        System.out.println(objeto2.getEntero1());

        objeto2.setCadena1("Este metodo inicializa la cadena");
        System.out.println(objeto2.getCadena1());

        objeto2.setEstado(true);
        System.out.println(objeto2.isEstado());


    }

}
