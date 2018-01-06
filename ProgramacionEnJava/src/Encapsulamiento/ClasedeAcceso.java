package Encapsulamiento;

public class ClasedeAcceso {

    private int variable1;
    private int variable2;
    private int variable3;
    private int variable4;
    private String cadena1;
    private String cadena2;
    private String cadena3;


    public int consigueVariable1() {
        return variable1;
    }

    public void defineVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public int consigueVariable2() {
        return variable2;
    }

    public void defineVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public int consigueVariable3() {
        return variable3;
    }

    public void defineVariable3(int variable3) {
        this.variable3 = variable3;
    }

    public int consigueVariable4() {
        return variable4;
    }

    public void defineVariable4(int variable4) {
        this.variable4 = variable4;
    }

    public String consigueCadena1() {
        return cadena1;
    }

    public void defineCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public String consigueCadena2() {
        return cadena2;
    }

    public void defineCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    public String consigueCadena3() {
        return cadena3;
    }

    public void defineCadena3(String cadena3) {
        this.cadena3 = cadena3;
    }
}
