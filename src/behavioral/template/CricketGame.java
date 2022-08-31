package behavioral.template;

public class CricketGame extends Game{
    @Override
    void starts() {
        System.out.println("CricketGame game starts.");
    }

    @Override
    void play() {
        System.out.println("Play CricketGame game.");
    }

    @Override
    void end() {
        System.out.println("End CricketGame game.");
    }
}
