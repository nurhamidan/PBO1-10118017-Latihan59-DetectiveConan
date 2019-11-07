package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Alasan membuat class ini karena detektif dewasa memiliki
 *                        kemungkinan untuk menikah daripada detektif anak anak.
 * 
 */
public class KarakterDewasa extends Karakter {
    private boolean menikah;
    private String statusPerkawinan;
    private String namaPasangan;
    private String[] namaAnak = new String[0];

    public KarakterDewasa(boolean menikah, String nama, String jenisKelamin, int umur) {
        super(nama, jenisKelamin, umur);
        this.menikah = menikah;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    
    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getNamaPasangan() {
        return namaPasangan;
    }

    public void setNamaPasangan(String namaPasangan) {
        this.namaPasangan = namaPasangan;
    }

    public String[] getNamaAnak() {
        return namaAnak;
    }

    public void setNamaAnak(String[] namaAnak) {
        this.namaAnak = namaAnak;
    }

    @Override
    public void tampilkanProfil() {
        super.tampilkanProfil(); //To change body of generated methods, choose Tools | Templates.
        if (menikah) {
            System.out.println("\tStatus Perkawinan\t: " + statusPerkawinan);
            if (namaPasangan == null) {
                System.out.println("\tNama Pasangan\t\t: Tidak diketahui");
            } else {
                System.out.println("\tNama Pasangan\t\t: " + namaPasangan);
            }
            if (namaAnak.length > 0) {
                System.out.print("\tDaftar Anak\t\t: ");
                for (String namaAnak1 : namaAnak) {
                    System.out.println("- " + namaAnak1);
                }
            }
        }
    }
}
