package EncapsulamientoEjemplo;

public class ModificadoresdeAcceso {
    private int numAleatorio;
    private String accesodefault;
    protected String accesoparcial;
    public String accesoPublico;


    //Este es un metodo privado
    private void accesoaMetodoPrivado(){
        System.out.println("Este metodo solo se puede ver en esta clase, por ser de tipo privado. ");
        System.out.println(numAleatorio);
    }
    //Este es un metodo publico
    public void accesoaMetodoPublico(String accesoPublico){
        this.accesoPublico=accesoPublico;
        System.out.println(this.accesoPublico);
    }
    //Este es un metodo por default
    void accesoaMetodoPorDefecto(String accesodefault){
        this.accesodefault= accesodefault;
        System.out.println(this.accesodefault);
    }
    //Este es un metodo protegido.
    protected void accesoaMetodoProtegido(String accesoparcial){
        this.accesoparcial= accesoparcial;
        System.out.println(this.accesoparcial);
    }



}
