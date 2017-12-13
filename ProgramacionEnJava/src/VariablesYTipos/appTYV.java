package VariablesYTipos;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

import javax.xml.bind.SchemaOutputResolver;

public class appTYV {

    public static void main(String[] args){//Estructura principal del proyecto

        int entero;
        boolean elige;
        String soyUnaPalabra;
        float soydecimal;
        double soymaspreciso;
        char palabracorta;

        entero= 23;
        elige=true;
        soyUnaPalabra="Hola mundo";
        soydecimal= 14.34f;
        soymaspreciso=23.34;
        palabracorta='a';

        int resultado;

        resultado = (int)(soydecimal * entero);

        System.out.println(resultado);

        //System.out.println(entero + soyUnaPalabra + soydecimal +soymaspreciso + soyUnaPalabra);


    }

}
