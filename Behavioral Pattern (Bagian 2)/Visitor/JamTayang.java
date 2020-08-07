public class JamTayang implements TransaksiPart {

    @Override
    public void accept (TransaksiPartVisitor transaksiPartVisitor) {
        transaksiPartVisitor.visit(this);
    }
}