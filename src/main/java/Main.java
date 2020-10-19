public class Main {
    public static void main(String args[]){
        Automovil0 miCoupe = new Automovil0("Coupe", "TC");
        Automovil0 miOtroCoupe = new Automovil0("Coupe", "TC", "AA", "ABS", "AB", "LL");

        Sedan miSedan = new Sedan();
        miSedan.agregarAdicional("AA");
        miSedan.agregarAdicional("ABS");
        miSedan.agregarAdicional("LL");

        Familiar miFamiliar = new Familiar();

        System.out.println("Coupe con TC: $" + miCoupe.calcularCosto());
        System.out.println("Coupe con todos los adicionales: $" + miOtroCoupe.calcularCosto());
        System.out.println("Sedan con AA, ABS y LL: $" + miSedan.calcularCosto());
        System.out.println("Familiar sin nada: $" + miFamiliar.calcularCosto());
    }
}
