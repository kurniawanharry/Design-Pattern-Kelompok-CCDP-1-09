public class BuilderPatternDemo {
   public static void main(String[] args) {
   
      FilmBuilder FilmBuilder = new FilmBuilder();

      Film Film1 = filmBuilder.prepareFilm1();
      System.out.println("Film1");
      Film1.showItems();
      System.out.println("Total Cost: " + Film1.getCost());
   }
}
