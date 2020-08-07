public class Transaksi {

   private static Transaksi instance = new Transaksi();
   private Transaksi(){}
   //Get the only object available
   public static Transaksi getInstance(){
      return instance;
   }
   public void showMessage(){
      System.out.println("Transaksi Berhasil!");
   }
}
