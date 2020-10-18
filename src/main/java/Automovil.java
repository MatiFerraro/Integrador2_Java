import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Automovil {
    protected String ad1 = "sin adicional";
    protected String ad2 = "sin adicional";
    protected String ad3 = "sin adicional";
    protected String ad4 = "sin adicional";
    protected String ad5 = "sin adicional";

    protected Float precioBase;
    protected ArrayList<String> adicionales = new ArrayList<String>();
    Map<String, Float> adicionalesCosto = new HashMap<String, Float>(){{
        put("TC", 12000f);
        put("AA", 20000f);
        put("ABS", 14000f);
        put("AB", 7000f);
        put("LL", 12000f);
    }};

    //protected Automovil(String ad1){
    //    this.ad1 = ad1;
    //}

    public Automovil(String ad1, String ad2, String ad3, String ad4, String ad5){
        if(ad1 != "sin adicional"){
            this.ad1 = ad1;
            adicionales.add(ad1);
            if(ad2 != "sin adicional"){
                this.ad2 = ad2;
                adicionales.add(ad2);
                if(ad3 != "sin adicional"){
                    this.ad3 = ad3;
                    adicionales.add(ad3);
                    if(ad4 != "sin adicional"){
                        this.ad4 = ad4;
                        adicionales.add(ad4);
                        if(ad5 != "sin adicional"){
                            this.ad5 = ad5;
                            adicionales.add(ad5);
                        }
                    }
                }
            }
        }
    }

    /*
    public Automovil3(String ad1, String ad2, String ad3, String ad4, String ad5) {
        ad1 = ad1 != null ? ad1 : 0;
        ad2 = ad2 != null ? ad2 : 0;
        ad3 = ad3 != null ? ad3 : 0;
        ad4 = ad4 != null ? ad4 : 0;
        ad5 = ad5 != null ? ad5 : 0;
    }

    public Automovil4(String ad1, String ad2, String ad3, String ad4, String ad5) {
       String ad1 = ad1.length > 0 ? ad1[0] : 0;
       String ad2 = ad2.length > 0 ? ad2[0] : 0;
       String ad3 = ad3.length > 0 ? ad3[0] : 0;
       String ad4 = ad4.length > 0 ? ad4[0] : 0;
       String ad5 = ad5.length > 0 ? ad5[0] : 0;
    }
    */

    public void agregarAdicional(String unAdicional){
        adicionales.add(unAdicional);
    }

    public Float calcularCosto(){
        String adicAux;
        Float costoAux;
        Float costoFinal = precioBase;
        if(adicionales.size() != 0){
            for(int i = 0; i < adicionales.size(); i++){
                adicAux = adicionales.get(i);
                costoAux = adicionalesCosto.get(adicAux);
                costoFinal += costoAux;
            }
        }
        return costoFinal;
    }
}
