class FilmRecord implements Prototype{  
      
private String id_film, Judul_film, genre, thn_produksi, rumah_produksi, durasi, tgl_mulai, tgl_selesai, gambar, deskripsi;
      
   public FilmRecord(){  
            System.out.println("   Film ");  
            System.out.println("---------------------------------------------");  
            System.out.println("id"+"\t"+"Judul"+"\t"+"genre"+"\t"+"thn_produksi"+"\t"+"rumah_produksi"+"\t"+"durasi"+"\t"+"tgl_mulai"+"\t"+"tgl_selesai"+"\t"+"gambar"+"\t"+"deskripsi");  
      
}  
  	
 public  FilmRecord(String id_film, String Judul_film, String genre, String thn_produksi, String rumah_produksi, String durasi, String tgl_mulai, String tgl_selesai, String gambar, String deskripsi) {  
          
        this();  
        this.id = id;  
        this.name = name;  
        this.designation = designation;  
        this.salary = salary;  
        this.address = address;  

this.id_film = id_film;
this.Judul_film = Judul_film;
this.genre = genre;
this.thn_produksi  = thn_produksi;
this.rumah_produksi = rumah_produksi;
this.durasi = durasi;
this.tgl_mulai = tgl_mulai;
this.tgl_selesai = tgl_selesai;
this.gambar = gambar;
this.deskripsi = deskripsi;

    }  
      
  public void showRecord(){  
          
        System.out.println("id"+"\t"+"Judul"+"\t"+"genre"+"\t"+"thn_produksi"+"\t"+"rumah_produksi"+"\t"+"durasi"+"\t"+"tgl_mulai"+"\t"+"tgl_selesai"+"\t"+"gambar"+"\t"+"deskripsi");  
   }  
  
    @Override  
    public Prototype getClone() {  
          
        return new FilmRecord(id,Judul,genre,thn_produksi,rumah_produksi,durasi,tgl_mulai,tgl_selesai,gambar,deskripsi);  
    }  
}
