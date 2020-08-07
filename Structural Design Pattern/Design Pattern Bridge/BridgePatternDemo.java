public class BridgePatternDemo {
    public static void main(String[] args) {
        Film theaterOne = new TheaterBiasa(new TheaterSatu(), "Interstellar", 30000, "Standar");
        Film theaterTwo = new TheaterBiasa(new TheaterDua(), "Inception", 30000, "Standar");

        theaterOne.tampil();
        theaterTwo.tampil();
    }
}