package momentopattern;

public class Film {
    private String filmState;

   public void setState(String filmState){
      this.filmState = filmState;
   }

   public String getState(){
      return filmState;
   }

   public Bioskop simpanStateKeBioskop(){
      return new Bioskop(filmState);
   }

   public void AmbilStateDariBioskop(Bioskop bioskop){
      filmState = bioskop.getState();
   }
}
