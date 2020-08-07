package strategypattern;

public class StrategyPattern {

    public static void main(String[] args) {
      Context context = new Context(new Hitungppn());		
      System.out.println("Harga Tiket Film Fast And Furious 8: 15000 ,Harga PPN 10% dari 15000 = " + context.executeStrategy(15000, 10, 100));
    }
    
}
