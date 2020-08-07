public class Harga implements TransaksiPart {

    @Override
    public void accept(TransaksiPartVisitor transaksiPartVisitor) {
        transaksiPartVisitor.visit(this);
    }
}