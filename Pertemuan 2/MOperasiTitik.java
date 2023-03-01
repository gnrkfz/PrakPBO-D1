/**
* File : MOperasiTitik.java
* Penulis : Ganar Khatir Faza Zain - 24060121130079
* Deskripsi : Kelas yang berisi program untuk menjalankan kelas OperasiTitik.
**/ 

public class MOperasiTitik{
    public static void main(String[] args){
        Titik t = new Titik(4,4);
        OperasiTitik op = new OperasiTitik();
        System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");

        op.refleksiX(t);
        System.out.println("Titik setelah refleksi X : ("+t.getAbsis()+","+t.getOrdinat()+")");

        op.refleksiY(t);
        System.out.println("Titik setelah refleksi Y : ("+t.getAbsis()+","+t.getOrdinat()+")");
    }
}
