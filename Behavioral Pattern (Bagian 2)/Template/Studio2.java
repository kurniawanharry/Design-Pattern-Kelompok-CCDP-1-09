public class Studio2 extends Bioskop{

    @Override
    void endPlay() {
        System.out.println("Studio 2 berakhir");
    }

    @Override
    void initialize() {
        System.out.println("Studio 2 segera dimulai");
    }

    @Override
    void startPlay() {
        System.out.println("Studio 2 dimulai");
    }
}