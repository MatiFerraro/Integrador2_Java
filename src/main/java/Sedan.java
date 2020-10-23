public class Sedan extends Automovil{

    private Float precioBase = 230000f;

    public Sedan(){
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
