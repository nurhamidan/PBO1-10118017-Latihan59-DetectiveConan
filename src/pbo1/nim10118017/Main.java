package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main, dimana class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pembuatan karakter
        DetektifAnakAnakMenciut detektifAnakAnakMenciut1 = new DetektifAnakAnakMenciut("Shinichi Kudo", "Conan Edogawa", "Laki-laki", 7);
        DetektifAnakAnakMenciut detektifAnakAnakMenciut2 = new DetektifAnakAnakMenciut("Shiho Miyano", "Ai Haibara", "Perempuan", 7);
        KarakterDewasa karakterDewasa1 = new KarakterDewasa(false, "Kazuha Toyama", "Perempuan", 17);
        KarakterDewasa karakterDewasa2 = new KarakterDewasa(false, "Sonoko Suzuki", "Perempuan", 17);
        DetektifDewasa detektifDewasa1 = new DetektifDewasa(false, "Heiji Hattori", "Laki-laki", 17);
        DetektifDewasa detektifDewasa2 = new DetektifDewasa(false, "Ran Mouri", "Perempuan", 17);
        DetektifDewasa detektifDewasa3 = new DetektifDewasa(true, "Kogoro Mouri", "Laki-laki", 38);
        Pengacara pengacara1 = new Pengacara(true, "Eri Kisaki", "Perempuan", 38);
        Ilmuan ilmuan1 = new Ilmuan(true, "Agasa Hiroshi", "Laki-laki", 53);
        DetektifAnakAnak detektifAnakAnak1 = new DetektifAnakAnak("Genta Kojima", "Laki-laki", 7);
        DetektifAnakAnak detektifAnakAnak2 = new DetektifAnakAnak("Mitsuhiko Tsuburaya", "Laki-laki", 7);
        DetektifAnakAnak detektifAnakAnak3 = new DetektifAnakAnak("Ayumi Yoshida", "Perempuan", 7);
        
        //Pengaturan karakter
        detektifDewasa3.setStatusPerkawinan("Menikah");
        detektifDewasa3.setNamaPasangan(pengacara1.getNama());
        pengacara1.setStatusPerkawinan("Menikah");
        pengacara1.setNamaPasangan(detektifDewasa3.getNama());
        detektifDewasa3.setNamaAnak(new String[]{detektifDewasa2.getNama()});
        pengacara1.setNamaAnak(detektifDewasa3.getNamaAnak());
        ilmuan1.setStatusPerkawinan("Duda");
        
        //Pemanggilan karakter
        System.out.println("Daftar Karakter Detective Conan Berdasarkan Gambar Studi Kasus:\n");
        detektifAnakAnakMenciut1.tampilkanProfil();
        System.out.println();
        detektifAnakAnakMenciut2.tampilkanProfil();
        System.out.println();
        karakterDewasa1.tampilkanProfil();
        System.out.println();
        detektifDewasa1.tampilkanProfil();
        System.out.println();
        karakterDewasa2.tampilkanProfil();
        System.out.println();
        detektifDewasa3.tampilkanProfil();
        System.out.println();
        pengacara1.tampilkanProfil();
        System.out.println();
        ilmuan1.tampilkanProfil();
        System.out.println();
        detektifAnakAnak1.tampilkanProfil();
        System.out.println();
        detektifAnakAnak2.tampilkanProfil();
        System.out.println();
        detektifAnakAnak3.tampilkanProfil();
    }
    
}
