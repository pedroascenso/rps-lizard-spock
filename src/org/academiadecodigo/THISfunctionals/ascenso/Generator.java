package org.academiadecodigo.THISfunctionals.ascenso;

public enum Generator {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors"),
    LIZARD("Lizard"),
    SPOCK("Spock");


    //Class proprieties
    private  final String name;
    //Class constructor
    Generator(String name){
        this.name = name;
    }

    //Define methods
    //Method to get object name
    public String getName(){
        return name;
    }
    //Method to get a random object through Class.values() array index
    public static Generator randomOpt(){
        return values()[ (int) (Math.random() * values().length) ];
    }
}


