package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Detektif pasti memiliki kasus yang harus dipecahkan.
 * 
 */
public class DetektifDewasa extends KarakterDewasa {
    private String namaKasus;

    public DetektifDewasa(boolean menikah, String nama, String jenisKelamin, int umur) {
        super(menikah, nama, jenisKelamin, umur);
    }

    public String getNamaKasus() {
        return namaKasus;
    }

    public void setNamaKasus(String namaKasus) {
        this.namaKasus = namaKasus;
    }
}
