public class TheaterBiasa extends Film{

    private String Judul;
    private double Harga;
    private String Standar;

    public TheaterBiasa(CinemasAPI cApi, String Judul, double Harga, String Standar) {
        super(cApi);
        // TODO Auto-generated constructor stub
        this.Judul = Judul;
        this.Harga = Harga;
        this.Standar = Standar;
    }

    @Override
    public void tampil() {
        // TODO Auto-generated method stub
        cinemasAPI.cinemasCGV(Judul, Harga, Standar);
    }
    
}