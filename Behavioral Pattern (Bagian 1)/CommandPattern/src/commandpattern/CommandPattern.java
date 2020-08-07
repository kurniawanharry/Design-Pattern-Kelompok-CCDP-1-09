package commandpattern;

public class CommandPattern {

    public static void main(String[] args) {
         Stock FastAndFurious9Stock = new Stock();
         
         BliStock bliStockOrder = new BliStock(FastAndFurious9Stock);
         JualStock jualStockOrder = new JualStock(FastAndFurious9Stock);
         
          Order order = new Order();
          order.ambilOrder(bliStockOrder);
          order.ambilOrder(jualStockOrder);
          
          order.keranjang();
    }
    
}
