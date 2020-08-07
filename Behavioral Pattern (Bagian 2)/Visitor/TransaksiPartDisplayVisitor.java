public class TransaksiPartDisplayVisitor implements TransaksiPartVisitor {

    @Override
    public void visit (Transaksi transaksi) {
        System.out.println("Tampilkan transaksi.");
    }

    @Override
    public void visit (Harga harga) {
        System.out.println("Tampilkan harga.");
    }

    @Override
    public void visit (JamTayang jamTayang) {
        System.out.println("Tampilkan jam tayang.");
    }

    @Override
    public void visit (NamaFilm namaFilm) {
        System.out.println("Tampilkan nama film.");
    }
}