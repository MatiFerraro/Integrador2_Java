public class Main {

    public static void main(String args[]){

        Coupe miCoupe = new Coupe();
        miCoupe.agregarAdicional("AA");
        miCoupe.agregarAdicional("ABS");
        miCoupe.agregarAdicional("LL");

        Sedan miSedan = new Sedan();
        miSedan.agregarAdicional("TC");
        miSedan.agregarAdicional("AA");
        miSedan.agregarAdicional("ABS");
        miSedan.agregarAdicional("AB");
        miSedan.agregarAdicional("LL");

        Familiar miFamiliar = new Familiar();

        System.out.println("Coupe con AA, ABS y LL: $" + miCoupe.calcularCosto());
        System.out.println("Sedan full: $" + miSedan.calcularCosto());
        System.out.println("Familiar sin nada: $" + miFamiliar.calcularCosto());
    }

}
