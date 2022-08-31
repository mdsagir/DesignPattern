package behavioral.template;

public class FootBallGame extends Game {
    @Override
    void starts() {
        System.out.println("FootBall game starts.");
    }

    @Override
    void play() {
        System.out.println("Play FootBall game.");
    }

    @Override
    void end() {
        System.out.println("End FootBall game.");
    }
}
