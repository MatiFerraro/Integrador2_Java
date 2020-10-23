import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

    /* Main de Automovil0
        Automovil0 miCoupe = new Automovil0("Coupe", "TC");
        Automovil0 miOtroCoupe = new Automovil0("Coupe", "TC", "AA", "ABS", "AB", "LL");
     */

public class Automovil0 {
    // Paso variante de auto y adicionales en el constructor
    // Automovil0 NO es clase abstracta
    // Funciona con x cantidad de parámetros


    private String variante;
    private String ad1;
    private String ad2;
    private String ad3;
    private String ad4;
    private String ad5;

    public Automovil0(String variante, String ad1, String ad2, String ad3, String ad4, String ad5){
        this.variante = variante;
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

    public Automovil0(String variante, String ad1, String ad2, String ad3, String ad4){
        this(variante, ad1, ad2, ad3, ad4, null);
    }

    public Automovil0(String variante, String ad1, String ad2, String ad3){
        this(variante, ad1, ad2, ad3, null, null);
    }

    public Automovil0(String variante, String ad1, String ad2){
        this(variante, ad1, ad2, null, null, null);
    }

    public Automovil0(String variante, String ad1){
        this(variante, ad1, null, null, null, null);
    }

    public Automovil0(String variante){
        this(variante, null, null, null, null, null);
    }

    private Float getPrecioBase(){
        if(variante == "Sedan" || variante == "sedan"){
            return 230000f;
        }
        else if(variante == "Coupe" || variante == "coupe"){
            return 270000f;
        }
        else if(variante == "Familiar" || variante == "familiar"){
            return 245000f;
        }
        return null;
    }

    private List<String> adicionales = new ArrayList<String>();

    Map<String, Float> costoAdicionales = new HashMap<String, Float>(){{
        put("TC", 12000f);
        put("AA", 20000f);
        put("ABS", 14000f);
        put("AB", 7000f);
        put("LL", 12000f);
    }};

    public Float calcularCosto(){
        String adicAux;
        Float precioBase = getPrecioBase();
        Float costoAux = 0f;
        if(adicionales.size() > 0){
            for(int i = 0; i < adicionales.size(); i++){
                if(adicionales.get(i) != null) {
                    adicAux = adicionales.get(i);
                    costoAux += costoAdicionales.get(adicAux);
                }
            }
            costoAux += precioBase;
        }
        return costoAux;
    }

}
