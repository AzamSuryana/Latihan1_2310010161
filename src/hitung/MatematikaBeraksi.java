package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika bagus = new Matematika(6,1);
        
        System.out.println("Hasil Penjumlahan: "+bagus.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+bagus.setPengurangan());
        System.out.println("Hasil Perkalian: "+bagus.setPerkalian());
        System.out.println("Hasil Pembagian: "+bagus.setPembagian());
    }
}
