package ProgramacionOO;

public class recipiente{
    boolean statusdelVaso;
    String colordeRecipiente = "azul", tamaño = "chico";


    public void llenarRecipiente() {
        System.out.println("El recipiente se ha llenado ");
        statusdelVaso= true;

    }

    public void vaciarVaso() {
        System.out.println("El recipiente esta vacio ");
        statusdelVaso = false;
    }

     public void estatusVaso(){

        if (statusdelVaso){
            System.out.println("El recipiente esta lleno ");

        }else{
            System.out.println("El recipiente esta vacio ");
        }


    }

}