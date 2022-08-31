package behavioral.template;

public abstract class Game {

    abstract void starts();
    abstract void play();
    abstract void end();

    public final void onTheGame() {
        starts();
        play();
        end();
    }
}
