public class FilmPatternDemo {

    public static void main (String[] args) {
        Filmrepository filmrepository = new Filmrepository();

        for (Film ilm = filmrepository.getFilm(); ilm.hasNext();){
            String name = (String)ilm.next();
            System.out.println("Film yang tayang : " + name);
        }
    }
}