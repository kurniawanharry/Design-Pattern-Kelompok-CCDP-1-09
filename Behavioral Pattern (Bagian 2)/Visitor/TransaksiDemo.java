public class TransaksiDemo {
    public static void main(String[] args) {

        TransaksiPart transaksi = new Transaksi();
        transaksi.accept(new TransaksiPartDisplayVisitor());
    }
}