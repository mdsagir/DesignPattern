package behavioral.template;

public class Main {

    public static void main(String[] args) {
        Game footBallGame = new FootBallGame();
        footBallGame.onTheGame();
        Game cricketGame = new CricketGame();
        cricketGame.onTheGame();
    }
}
