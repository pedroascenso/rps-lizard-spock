package pt.pedroascenso;

/**
 * The Generator enum represents the different moves available in a game of rock-paper-scissors.
 */
public enum Generator {

    ROCK("Rock"), // the rock move
    PAPER("Paper"), // the paper move
    SCISSORS("Scissors"), // the scissors move
    LIZARD("Lizard"), // the lizard move
    SPOCK("Spock"); // the spock move

    private final String name; // the name of the move

    /**
     * Constructs a new Generator object with the given name.
     *
     * @param name the name of the move
     */
    Generator(String name){
        this.name = name;
    }

    /**
     * Returns the name of the move.
     *
     * @return the name of the move
     */
    public String getName(){
        return name;
    }

    /**
     * Returns a randomly generated move.
     *
     * @return a randomly generated move
     */
    public static Generator randomOpt(){
        return values()[ (int) (Math.random() * values().length) ];
    }
}
