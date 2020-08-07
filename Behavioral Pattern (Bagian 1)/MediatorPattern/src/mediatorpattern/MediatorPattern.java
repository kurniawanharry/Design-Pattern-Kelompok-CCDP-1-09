package mediatorpattern;

public class MediatorPattern {

    public static void main(String[] args) {
      Penonton andi = new Penonton("Andi");
      Penonton budi = new Penonton("Budi");

      andi.nontonBioskop("Menonton FAST AND FURIOUS 9");
      budi.nontonBioskop("Menonton FAST AND FURIOUS 8");
    }
    
}
