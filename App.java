class Mahasiswa{
    String Nama;
    String NIM;
    String Prodi;
    int Umur;
    Double IPK;

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //Membuat objek
        Mahasiswa mhs_1 = new Mahasiswa();

        //Memberikan nilai pada objek
        mhs_1.Nama = "M. NABIL";
        mhs_1.NIM = "23241090";
        mhs_1.Prodi = "Pendidikan Teknologi Informasi";
        mhs_1.Umur = 18;
        mhs_1.IPK = 2.8;
        
        //Mencetak objek
        System.out.println("Nama    : " + mhs_1.Nama);
        System.out.println("NIM     : " + mhs_1.NIM);
        System.out.println("Prodi   : " + mhs_1.Prodi);
        System.out.println("Umur    : " + mhs_1.Umur);
        System.out.println("IPK     : " + mhs_1.IPK);
    }
}