public class Transaksi implements TransaksiPart {

    TransaksiPart[] parts;

    public Transaksi() {
        parts = new TransaksiPart[] {new JamTayang(), new NamaFilm(), new Harga()};
    }

    @Override
    public void accept(TransaksiPartVisitor transaksiPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(transaksiPartVisitor);
        }
        transaksiPartVisitor.visit(this);
    }
}