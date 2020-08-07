package mediatorpattern;
class Penonton {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Penonton(String name){
      this.name  = name;
   }

   public void nontonBioskop(String film){
      Bioskop.tampilBioskop(this,film);
   }
}
