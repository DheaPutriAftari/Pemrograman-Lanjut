package TugasNim;

import java.util.Scanner;

public class NIMRun {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Nama Mahasiswa     :"); 
        String nama = input.nextLine();
        
        System.out.print("NIM                :"); 
        String nim = input.nextLine();
        NIM Nim = new NIM(); 
        Nim.setNim(nim); 
    
    
    
   System.out.println("Jenjang Pendidikan :" + Nim.getJenjangPendidikan()); 
    
   System.out.println("Tahun masuk        :" + Nim.getTahunMasuk()); 
    
   System.out.println("Fakultas           :" + Nim.getFakultas());
    
   System.out.println("Jurusan            :" + Nim.getJurusan());
    
   System.out.println("Jenis Kelamin      :" + Nim.getJenisKelamin()); 
    
   System.out.println("Nomor Urut         :" + Nim.getNomorUrut()); 
    
    }  
}
