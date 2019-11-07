package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini adalah class tertinggi dalam hirarki.
 * 
 */
public class Karakter {
    private String nama;
    private final String jenisKelamin;
    private int umur;

    public Karakter(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void tampilkanProfil() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenisKelamin);
        System.out.println("Umur\t\t: " + umur);
    }
}
