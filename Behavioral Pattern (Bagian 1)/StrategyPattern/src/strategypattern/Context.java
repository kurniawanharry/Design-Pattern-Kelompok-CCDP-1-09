package strategypattern;

public class Context {
    private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int ppnFilm1, int ppnFilm2, int pembagi){
      return strategy.ppnFilm(ppnFilm1, ppnFilm2, pembagi);
   }
}
