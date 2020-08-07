package commandpattern;

public class JualStock implements Beli{
    
   private Stock FastAndFurious9Stock;

   public JualStock(Stock FastAndFurious9Stock){
      this.FastAndFurious9Stock = FastAndFurious9Stock;
   }

   public void execute() {
      FastAndFurious9Stock.jual();
   }

}
