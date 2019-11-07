package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ilmuan pasti memiliki beberapa penemuan.
 * 
 */
public class Ilmuan extends KarakterDewasa {
    private String[] penemuan;

    public Ilmuan(boolean menikah, String nama, String jenisKelamin, int umur) {
        super(menikah, nama, jenisKelamin, umur);
    }

    public String[] getPenemuan() {
        return penemuan;
    }

    public void setPenemuan(String[] penemuan) {
        this.penemuan = penemuan;
    }
}
