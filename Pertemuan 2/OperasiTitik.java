/**
* File : OperasiTitik.java
* Penulis : Ganar Khatir Faza Zain - 24060121130079
* Deskripsi : Kelas yang berisi program untuk kelas OperasiTitik.
**/ 

public class OperasiTitik {

    public void refleksiX(Titik titik){
        refleksiSumbuX(titik);
    }

    public void refleksiY(Titik titik){
        refleksiSumbuY(titik);
    }

    private void refleksiSumbuX(Titik titik){
        titik.ordinat *= (-1);
    }

    private void refleksiSumbuY(Titik titik){
        titik.absis *= (-1);
    }

}
