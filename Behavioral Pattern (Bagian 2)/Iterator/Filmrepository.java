public class Filmrepository implements CFilm {

    public String names [] = {"Ad Asrtra", "Interstellar", "The Martian"};

    @Override
    public Film getFilm() {
        return new Filmbaru();
    }
    private class Filmbaru implements Film {
        int index;

        @Override
        public boolean hasNext() {
            
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}