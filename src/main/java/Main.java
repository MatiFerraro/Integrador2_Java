public class Main {
    public static void main(String args[]){
        Coupe miAuto = new Coupe("TC", "AA", "ABS", "AB", "LL");

        Float costoMiAuto = miAuto.calcularCosto();
        System.out.println(costoMiAuto);
    }
}
