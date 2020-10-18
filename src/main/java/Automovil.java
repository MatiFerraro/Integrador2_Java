import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Automovil {
    protected Float precioBase;
    protected ArrayList<String> adicionales = new ArrayList<String>(5);
    Map<String, Float> adicionalesCosto = new HashMap<String, Float>(){{
        put("TC", 12000f);
        put("AA", 20000f);
        put("ABS", 14000f);
        put("AB", 7000f);
        put("LL", 12000f);
    }};

    protected Automovil(){

    }

    public void agregarAdicional(String unAdicional){
        adicionales.add(unAdicional);
    }

    public Float calcularCosto(){
        String adicAux;
        Float costoAux;
        Float costoFinal = precioBase;
        if(adicionales.size() != 0){
            for(int i = 0; i < 5; i++){
                adicAux = adicionales.get(i);
                costoAux = adicionalesCosto.get(adicAux);
                costoFinal += costoAux;
            }
        }
        return costoFinal;
    }
}
