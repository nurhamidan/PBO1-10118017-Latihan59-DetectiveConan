package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini adalah turunan dari class Karakter, berfungsi untuk
 *                        mengatur object detektif anak-anak.
 * 
 */
public class DetektifAnakAnak extends Karakter {
    private String namaKasus;
    private String gadget;

    public DetektifAnakAnak(String nama, String jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
    }

    public String getNamaKasus() {
        return namaKasus;
    }

    public void setNamaKasus(String namaKasus) {
        this.namaKasus = namaKasus;
    }

    public String getGadget() {
        return gadget;
    }

    public void setGadget(String gadget) {
        this.gadget = gadget;
    }
}
