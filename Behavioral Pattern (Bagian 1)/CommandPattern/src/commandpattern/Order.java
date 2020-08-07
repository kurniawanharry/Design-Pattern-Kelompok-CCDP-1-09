package commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Beli> daftarOrder = new ArrayList<Beli>(); 
    
    public void ambilOrder(Beli beli){
      daftarOrder.add(beli);		
   }
    
   public void keranjang(){
   
      for (Beli beli : daftarOrder) {
         beli.execute();
      }
      daftarOrder.clear();
   }

}
