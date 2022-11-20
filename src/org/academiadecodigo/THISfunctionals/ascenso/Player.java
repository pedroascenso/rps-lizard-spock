package org.academiadecodigo.THISfunctionals.ascenso;

public class Player {

    //Class proprieties
    private final String name;
    //Class constructor
    public Player(String name){
        this.name = name;
    }
    //Define methods
    //Method to get object name
    public String getName(){
        return name;
    }
    //Method to get a random object from Generator class
    public Generator getRandomOpt(){
        return Generator.randomOpt();
    }

}
