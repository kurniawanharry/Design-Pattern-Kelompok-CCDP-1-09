package strategypattern;

public class Hitungppn implements Strategy{
   
   public int ppnFilm(int ppn1, int ppn2, int pembagi) {
      return ppn1 * ppn2 / pembagi;
   }
}
