import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  
class PrototypeDemo{  
     public static void main(String[] args) throws IOException {  
          
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
          
        System.out.print("Enter id film: ");  
        String ename=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter judul film: ");  
        String ename=br.readLine();  
        System.out.print("\n");  
          
        System.out.print("Enter genre: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        System.out.print("Enter thn produksi: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        System.out.print("Enter rumah produksi: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        System.out.print("Enter durasi: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        System.out.print("Enter tgl mulai: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        System.out.print("Enter tgl selesai: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        System.out.print("Enter gambar: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        System.out.print("Enter deskripsi: ");  
        String ename=br.readLine();  
        System.out.print("\n");  

        FilmRecord f1=new FilmRecord(id,Judul,genre,thn_produksi,rumah_produksi,durasi,tgl_mulai,tgl_selesai,gambar,deskripsi);  
          
        f1.showRecord();  
        System.out.println("\n");  
        FilmRecord f2=(FilmRecord) f1.getClone();  
        f2.showRecord();  
    }     
}
