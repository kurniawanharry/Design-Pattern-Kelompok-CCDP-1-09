public interface TransaksiPartVisitor {
    public void visit(Transaksi transaksi);
    public void visit(Harga harga);
    public void visit(JamTayang jamtayang);
    public void visit(NamaFilm namafilm);
}