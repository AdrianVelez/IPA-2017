package Encapsulamiento;

public class Principal {
    public static void main(String[] args) {
        ClaseRestringida objeto1=new ClaseRestringida();
        ClasedeAcceso objeto2=new ClasedeAcceso();

        objeto1.accesoaMetodoPorDefecto("Hola mundo");




        objeto2.defineCadena1("Hola soy una cadena que se agrega a una variable privada");
        System.out.println(objeto2.consigueCadena1());

        objeto2.defineVariable1(5);
        System.out.println(objeto2.consigueVariable1());


    }
}
