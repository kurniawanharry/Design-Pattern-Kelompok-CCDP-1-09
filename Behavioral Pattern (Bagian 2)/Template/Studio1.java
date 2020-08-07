public class Studio1 extends Bioskop{

    @Override
    void endPlay() {
        System.out.println("Studio 1 berakhir");
    }

    @Override
    void initialize() {
        System.out.println("Studio 1 segera dimulai");
    }

    @Override
    void startPlay() {
        System.out.println("Studio 1 dimulai");
    }
}