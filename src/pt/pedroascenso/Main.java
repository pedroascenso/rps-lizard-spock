package pt.pedroascenso;

public class Main {

    public static void main(String[] args) {

        Player pedro = new Player("Pedro");
        Player andre = new Player("Andre");

        Game spock = new Game(pedro, andre, 99);

        spock.playFixedRounds();
        //spock.playBestOf();

    }
}
