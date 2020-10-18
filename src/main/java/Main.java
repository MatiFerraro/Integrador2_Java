public class Main {
    public static void main(String args[]){
        Coupe miAuto = new Coupe();
        miAuto.agregarAdicional("TC");
        miAuto.agregarAdicional("AA");
        miAuto.agregarAdicional("ABS");
        miAuto.agregarAdicional("AB");
        miAuto.agregarAdicional("LL");

        Float costoMiAuto = miAuto.calcularCosto();
        System.out.println(costoMiAuto);
    }
}
