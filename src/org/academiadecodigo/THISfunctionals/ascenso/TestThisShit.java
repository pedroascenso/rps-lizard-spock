package org.academiadecodigo.THISfunctionals.ascenso;

public class TestThisShit {

    public static void main(String[] args) {


        Player pedro = new Player("Pedro");
        Player andre = new Player("Andre");


        //Game xpto = new Game (new Player("Pedro"),  new Player("Andre"), 10);
        Game spock = new Game(pedro, andre, 99);


        //spock.play();

        spock.playBestOf();






    }
}
