import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Automovil2 {
    protected String ad1;
    protected String ad2;
    protected String ad3;
    protected String ad4;
    protected String ad5;

    protected Float precioBase;
    protected ArrayList<String> adicionales = new ArrayList<String>();
    Map<String, Float> adicionalesCosto = new HashMap<String, Float>(){{
        put("TC", 12000f);
        put("AA", 20000f);
        put("ABS", 14000f);
        put("AB", 7000f);
        put("LL", 12000f);
    }};

    protected Automovil2(String ad1){
        this.ad1 = ad1;
        adicionales.add(ad1);
    }
    protected Automovil2(String ad1, String ad2){
        this.ad1 = ad1;
        adicionales.add(ad1);
        this.ad2 = ad2;
        adicionales.add(ad2);
    }
    protected Automovil2(String ad1, String ad2, String ad3){
        this.ad1 = ad1;
        adicionales.add(ad1);
        this.ad2 = ad2;
        adicionales.add(ad2);
        this.ad3 = ad3;
        adicionales.add(ad3);
    }
    protected Automovil2(String ad1, String ad2, String ad3, String ad4){
        this.ad1 = ad1;
        adicionales.add(ad1);
        this.ad2 = ad2;
        adicionales.add(ad2);
        this.ad3 = ad3;
        adicionales.add(ad3);
        this.ad4 = ad4;
        adicionales.add(ad4);
    }
    protected Automovil2(String ad1, String ad2, String ad3, String ad4, String ad5){
        this.ad1 = ad1;
        adicionales.add(ad1);
        this.ad2 = ad2;
        adicionales.add(ad2);
        this.ad3 = ad3;
        adicionales.add(ad3);
        this.ad4 = ad4;
        adicionales.add(ad4);
        this.ad5 = ad5;
        adicionales.add(ad5);
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
                costoFinal = costoFinal + costoAux;
            }
        }
        return costoFinal;
    }
}
