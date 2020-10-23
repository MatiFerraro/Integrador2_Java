public class Familiar extends Automovil{

    private Float precioBase = 245000f;

    public Familiar(){
        super();
    }

    @Override
    public Float calcularCosto(){
        String adicAux;
        Float costoAux = 0f;
        if(adicionales.size() > 0){
            for(int i = 0; i < adicionales.size(); i++){
                adicAux = adicionales.get(i);
                costoAux += costoAdicionales.get(adicAux);
            }
            costoAux += precioBase;
            return costoAux;
        }
        return precioBase;
    }

}
