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
