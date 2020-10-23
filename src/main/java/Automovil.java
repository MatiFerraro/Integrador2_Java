import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public abstract class Automovil {

    protected List<String> adicionales;
    Map<String, Float> costoAdicionales = new HashMap<String, Float>(){{
        put("TC", 12000f);
        put("AA", 20000f);
        put("ABS", 14000f);
        put("AB", 7000f);
        put("LL", 12000f);
    }};

    protected Automovil(){
        adicionales = new ArrayList<String>();
    }

    public void agregarAdicional(String unAdicional){
        adicionales.add(unAdicional);
    }

    public abstract Float calcularCosto();

}
