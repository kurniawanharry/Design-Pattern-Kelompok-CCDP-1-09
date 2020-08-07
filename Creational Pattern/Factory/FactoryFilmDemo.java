public class FactoryFilmDemo {

   public static void main(String[] args) {
      FilmFactory filmFactory = new FilmFactory();

      
      Film film1 = filmFactory.getFilm("Horor");
      film1.film();

      Film film2 = FilmFactory.getFilm("Action");
      film2.film();

      Film film3 = FilmFactory.getFilm("Drama");
      film3.film();
   }
}
