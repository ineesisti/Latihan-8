public class Angka implements I1, D1 {
double bil, pecahan,bulat;
    
    @Override
    public void I1() {
        System.out.println("Angka yang di inputkan termasuk tipe data Integer");
    }

    @Override
    public void D1() {
        System.out.println("Angka yang di inputkan termasuk tipe data Double");
    }
    
}
