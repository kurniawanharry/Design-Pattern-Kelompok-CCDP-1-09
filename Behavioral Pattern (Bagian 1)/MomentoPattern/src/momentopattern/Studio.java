package momentopattern;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private List<Bioskop> bioskopList = new ArrayList<Bioskop>();

   public void add(Bioskop state){
      bioskopList.add(state);
   }

   public Bioskop get(int index){
      return bioskopList.get(index);
   }
}
