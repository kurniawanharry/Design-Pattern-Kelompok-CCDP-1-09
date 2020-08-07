package momentopattern;

public class MomentoPattern {

    public static void main(String[] args) {
      
      Film film = new Film();
      Studio studio = new Studio();
      
      film.setState("Film Ke - 1 yaitu Fast And Furious 6");
      film.setState("Film ke - 2 yaitu Fast And Furious 7");
      studio.add(film.simpanStateKeBioskop());
      
      film.setState("Film ke - 3 yaitu Fast And Furious 8");
      studio.add(film.simpanStateKeBioskop());
      
      film.setState("Fast And Furious 9");
      System.out.println("Film : " + film.getState());		
      
      film.AmbilStateDariBioskop(studio.get(0));
      System.out.println("Tayang Ke-1 : " + film.getState());
      film.AmbilStateDariBioskop(studio.get(1));
      System.out.println("Tayang Ke-2 : " + film.getState());
      
    }
    
}
