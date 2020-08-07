package commandpattern;

public class Stock {
   private String namaFilm = "Fast And Furious 9";
   private int quantity = 5;

   public void bli(){
      System.out.println("Stock Tiket: "+namaFilm+", Quantity: " + quantity +" Tersedia");
   }
   public void jual(){
      System.out.println("Stock Tiket: "+namaFilm+", Quantity: " + quantity +" Habis");
   }
}
