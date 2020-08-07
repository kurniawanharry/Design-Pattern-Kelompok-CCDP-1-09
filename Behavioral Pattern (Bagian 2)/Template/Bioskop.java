public abstract class Bioskop {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();


public final void play() {

    initialize();

    startPlay();

    endPlay();
}
}