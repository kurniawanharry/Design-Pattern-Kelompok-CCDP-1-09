public class BioskopPatternDemo {
    public static void main(String[] args){

        Bioskop bioskop = new Studio1();
        bioskop.play();
        System.out.println();
        bioskop = new Studio2();
        bioskop.play();
    }
}