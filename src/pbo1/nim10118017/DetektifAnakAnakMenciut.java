package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Detektif anak-anak yang menciut karena obat dalam film
 *                        Detective conan pasti mereka mengganti nama, makanya ada
 *                        atribut nama asli.
 * 
 */
public class DetektifAnakAnakMenciut extends DetektifAnakAnak {
    private final String namaAsli;

    public DetektifAnakAnakMenciut(String namaAsli, String nama, String jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
        this.namaAsli = namaAsli;
    }

    public String getNamaAsli() {
        return namaAsli;
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("Nama Asli\t: " + namaAsli);
        super.tampilkanProfil(); //To change body of generated methods, choose Tools | Templates.
    }
}
