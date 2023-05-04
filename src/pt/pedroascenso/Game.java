package pt.pedroascenso;

/**
 * The Game class represents a game of Rock-Paper-Scissors-Lizard-Spock
 * between two players.
 */
public class Game {

    private final Player player1; // first player in the game
    private final Player player2; // second player in the game
    private int rounds; // number of rounds in the game

    /**
     * Creates a new game with the given players and number of rounds.
     *
     * @param player1 The first player in the game.
     * @param player2 The second player in the game.
     * @param rounds The number of rounds in the game.
     */
    public Game(Player player1, Player player2, int rounds){
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
    }

    /**
     * Plays a fixed number of rounds in the game.
     * If the number of rounds is 0, the method prints an error message and returns.
     */
    public void playFixedRounds(){

        // Check if the number of rounds is 0
        if( this.rounds == 0){
            System.out.println("You can't play with no rounds");
            return;
        }

        System.out.println("Let's start the ROCK-PAPER-SCISSORS-LIZARD-SPOCK!!!");
        System.out.println("####################################################");

        int ties = 0;

        // Play the game until the number of rounds are equal to 0
        while (rounds > 0) {

            System.out.println("You have: " + this.rounds + " left.");

            // Have both players choose their move
            player1.setChoice();
            player2.setChoice();
            Generator p1Pick = player1.getChoice();
            Generator p2Pick = player2.getChoice();
            System.out.println(player1.getName() + " choose " + p1Pick.getName());
            System.out.println(player2.getName() + " choose " + p2Pick.getName());

            // Determine the winner of the round
            if (p1Pick == p2Pick) {

                // If it's a tie, display the result
                System.out.println("It's a tie!!!");
                System.out.println("####################################################");
                rounds--;
                ties++;
            } else{

                // If there is a winner, call the roundWinner method
                roundWinner(player1,player2);
                rounds--;
            }
        }
        if (player1.getVictories() == player2.getVictories()){

            // If it's a tie, display the result
            System.out.println("####################################################");
            System.out.println("IT'S A TIE BETWEEN " + player1.getName() + " and " + player2.getName());
            System.out.println("AMAZING!!!");

        } else {

            // Check the winner of the game
            checkWinner(player1, player2);
            System.out.println("There was: " + ties + " tied rounds.");
        }
    }

    /**
     * Plays a game where the first player to win the majority of the rounds wins the game.
     * If the number of rounds is 0, the method prints an error message and returns.
     */
    public void playBestOf(){

        // Check if the number of rounds is 0
        if( this.rounds == 0){
            System.out.println("Error: Cannot play with 0 rounds.");
            return;
        }

        System.out.println("Starting ROCK-PAPER-SCISSORS-LIZARD-SPOCK game!");
        System.out.println("####################################################");

        int roundsToWin = Math.round(this.rounds/2);

        // Play the game until a player has won the required number of rounds
        while (player1.getVictories() <= roundsToWin && player2.getVictories() <= roundsToWin ) {

            // Have both players choose their move
            player1.setChoice();
            player2.setChoice();
            Generator p1Choice = player1.getChoice();
            Generator p2Choice = player2.getChoice();

            System.out.println(player1.getName() + " choose " + p1Choice.getName());
            System.out.println(player2.getName() + " choose " + p2Choice.getName());

            // Determine the winner of the round
            if (p1Choice == p2Choice) {

                // If it's a tie, display the result
                System.out.println("It's a tie!");
                System.out.println("####################################################");

            } else{

                // If there is a winner, call the roundWinner method
                roundWinner(player1,player2);
            }
        }

        // Check the winner of the game
        checkWinner(player1,player2);
    }

    /**
     * Determines the winner of a round of the game and updates the score.
     *
     * @param player1 The first player in the game.
     * @param player2 The second player in the game.
     */
    private void roundWinner(Player player1, Player player2){

        Generator p1Choice = player1.getChoice();
        Generator p2Choice = player2.getChoice();
        Player winner = null;

        // Determine the winner based on their choice
        if(p1Choice == Generator.ROCK){
            if(p2Choice == Generator.SCISSORS || p2Choice == Generator.LIZARD){
                winner = player1;
            } else {
                winner = player2;
            }
        } else if(p1Choice == Generator.PAPER){
            if(p2Choice == Generator.ROCK || p2Choice == Generator.SPOCK){
                winner = player1;
            } else {
                winner = player2;
            }
        }else if(p1Choice == Generator.SCISSORS){
            if(p2Choice == Generator.PAPER || p2Choice == Generator.LIZARD){
                winner = player1;
            } else {
                winner = player2;
            }
        } else if(p1Choice == Generator.LIZARD){
            if(p2Choice == Generator.PAPER || p2Choice == Generator.SPOCK){
                winner = player1;
            } else {
                winner = player2;
            }
        } else if(p1Choice == Generator.SPOCK){
            if(p2Choice == Generator.ROCK || p2Choice == Generator.SCISSORS){
                winner = player1;
            } else {
                winner = player2;
            }
        }

        // Display the winner along with the current score
        System.out.println(winner.getName() + " won this round!");
        winner.setVictories(winner.getVictories()+1);
        System.out.print("Current Score:");
        System.out.println(player1.getName() + ": " + player1.getVictories()
                + " ||| " + player2.getName() + ": " + player2.getVictories());
        System.out.println("####################################################");
    }

    /**
     * Determines the winner of the game and prints the results.
     *
     * @param player1 The first player in the game.
     * @param player2 The second player in the game.
     */
    private void checkWinner(Player player1, Player player2){

        // Determine the winner and loser based on the number of victories
        Player winner = player1.getVictories() > player2.getVictories() ? player1 : player2;
        Player looser = winner.equals(player1) ? player2 : player1;

        // Display the winner and loser along with the number of rounds won
        System.out.println("####################################################");
        System.out.println(winner.getName() + " is the winner!");
        System.out.println(winner.getName() + " won: " + winner.getVictories() + " rounds.");
        System.out.println(looser.getName() + " won: " + looser.getVictories() + " rounds.");

    }

}
