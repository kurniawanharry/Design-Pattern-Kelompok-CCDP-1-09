package commandpattern;

public class BliStock implements Beli{
    private Stock FastAndFurious9Stock;

   public BliStock(Stock FastAndFurious9Stock){
      this.FastAndFurious9Stock = FastAndFurious9Stock;
   }

   public void execute() {
      FastAndFurious9Stock.bli();
   }
}
