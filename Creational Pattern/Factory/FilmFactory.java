public class FilmFactory {
   public Film getFilm(String filmType){
      if(filmType == null){
         return null;
      }		
      if(filmType.equalsIgnoreCase("Horor")){
         return new Horor();
         
      } else if(filmType.equalsIgnoreCase("Action")){
         return new Action();
         
      } else if(filmType.equalsIgnoreCase("Drama")){
         return new Drama();
      }
      return null;
   }
}
