package gui;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getJenjangPendidikan(){
        char NoJP = nim.charAt(0);
        if(NoJP == '1'){
            return "S1(Sarjana)";
        }else if(NoJP == '2'){
            return "S2(Magister)";
        }else if(NoJP == '3'){
            return "S3(Doktor)";
        }
        return "Kode Jenjang Pendidikan tidak ditemukan";
    }

    public String getTahunMasuk(){
        char NoTM1 = nim.charAt(1);
        char NoTM2 = nim.charAt(2);
        if( NoTM1 == '1' && NoTM2 == '9'){
            return "2019";
        }else if( NoTM1 == '2' && NoTM2 == '0'){
            return "2020";
        }else if( NoTM1 == '2' && NoTM2 == '1'){
            return "2021";
        }
        return "Kode tahun masuk tidak ditemukan";
    }

    public String getFakultas(){
        char NoMK = nim.charAt(3);
        if( NoMK == '1'){
            return "Tarbiyah dan Keguruan";
        }else if( NoMK == '2'){
            return "Syari'ah dan Hukum";
        }else if( NoMK == '3') {
            return "Ushuluddin";
        }else if( NoMK == '4') {
            return "Dakwah dan Komunikasi";
        }else if ( NoMK == '5') {
            return "Sains dan Teknologi";
        }else if ( NoMK  == '6') {
            return "Psikologi";
        }else if ( NoMK == '7') {
            return "Ekonomi dan Ilmu Sosial";
        }else if ( NoMK == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Kode Fakultas tidak ditemukan";
    }

    public String getJurusan(){
        char NoMJ1 = nim.charAt(4);
        char NoMJ2 = nim.charAt(5);

        if (NoMJ1 == '0' && NoMJ2 == '1') {
            return "Teknik Informatika";
        }else if (NoMJ1 == '0' && NoMJ2 == '2') {
            return "Teknik Industri";
        }else if (NoMJ1 == '0' && NoMJ2 == '3') {
            return "Sistem Informasi";
        }else if (NoMJ1 == '0' && NoMJ2 == '4') {
            return "Matematika";
        }else if (NoMJ1 == '0' && NoMJ2 == '5') {
            return "Teknik Elektro";
        }
        return "Kode Jurusan tidak ditemukan";
    }
    public String getJenisKelamin(){
        char NoJK = nim.charAt(6);
        if( NoJK == '1'){
            return "Laki-laki";
        }else if( NoJK == '2'){
            return "Perempuan";
        }
        return "Kode Jenis Kelamin tidak ditemukan";


    }
    public String getNomorUrut(){
        char NU1 = nim.charAt(7);
        char NU2 = nim.charAt(8);
        char NU3 = nim.charAt(9);
        char NU4 = nim.charAt(10);
        return"" + NU1 + NU2 + NU3 + NU4;

    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                '}';
    }
}


