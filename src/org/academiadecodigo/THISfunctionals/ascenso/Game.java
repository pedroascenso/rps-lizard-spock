package org.academiadecodigo.THISfunctionals.ascenso;

public class Game {


    //Class proprieties
    private final Player player1;
    private final Player player2;
    private int rounds;

    //Class constructor
    public Game(Player player1, Player player2, int rounds){
        this.player1 = player1;
        this.player2 = player2;
        this.rounds = rounds;
    }


    //Method to play a set number of rounds
    public void play(){

        //Check if got rounds
        if( this.rounds == 0){
            System.out.println("You can't play with no rounds");
            return;
        }
        //Start game
        System.out.println("Let's start the ROCK-PAPER-SCISSORS-LIZARD-SPOCK!!!");
        System.out.println("####################################################");
        int p1Wins = 0;
        int p2Wins = 0;
        int ties = 0;

        while (rounds > 0) {

            System.out.println("You have: " + this.rounds + " left.");
            Generator p1Pick = player1.getRandomOpt(); //Generate random pick for 1st player
            Generator p2Pick = player2.getRandomOpt(); //Generate random pick for 2nd player
            System.out.println(player1.getName() + " choose " + p1Pick.getName());
            System.out.println(player2.getName() + " choose " + p2Pick.getName());

            //Declaring conditions
            //If they pick the same it's a tie
            if (p1Pick == p2Pick) {
                System.out.println("It's a tie!!!");
                System.out.println("####################################################");
                rounds--;
                ties++;
            //All the possibilities of player 1 winning a round
            } else if ( (p1Pick == Generator.SCISSORS && p2Pick == Generator.PAPER) || (p1Pick == Generator.PAPER && p2Pick == Generator.ROCK) ||
            (p1Pick == Generator.ROCK && p2Pick == Generator.LIZARD) || (p1Pick == Generator.LIZARD && p2Pick == Generator.SPOCK) ||
            (p1Pick == Generator.SPOCK && p2Pick == Generator.SCISSORS) || (p1Pick == Generator.SCISSORS && p2Pick == Generator.LIZARD) ||
            (p1Pick == Generator.LIZARD && p2Pick == Generator.PAPER) || (p1Pick == Generator.PAPER && p2Pick == Generator.SPOCK) ||
            (p1Pick == Generator.SPOCK && p2Pick == Generator.ROCK) || (p1Pick == Generator.ROCK && p2Pick == Generator.SCISSORS) ) {

                System.out.println(player1.getName() + " won this round!");
                System.out.println("####################################################");
                p1Wins++;
                rounds--;
            //If there wasn't a tie and player 1 didn't won, then player 2 wins
            } else {
                System.out.println(player2.getName() + " won this round!");
                System.out.println("####################################################");
                p2Wins++;
                rounds--;
            }
        }
        if (p1Wins > p2Wins){

            System.out.println("####################################################");
            System.out.println(player1.getName() + " WON THIS SHIT");
            System.out.println(player1.getName() + " won: " + p1Wins + " rounds.");
            System.out.println(player2.getName() + " won: " + p2Wins + " rounds.");
            System.out.println("There was: " + ties + " tied rounds.");

        } else if (p2Wins > p1Wins) {

            System.out.println("####################################################");
            System.out.println(player2.getName() + " WON THIS SHIT");
            System.out.println(player2.getName() + " won: " + p2Wins + " rounds.");
            System.out.println(player1.getName() + " won: " + p1Wins + " rounds.");
            System.out.println("There was: " + ties + " tied rounds.");

        } else {

            System.out.println("####################################################");
            System.out.println("IT'S A TIE BETWEEN " + player1.getName() + " and " + player2.getName());
            System.out.println("AMAZING!!!");

        }

    }














    public void playBestOf(){


        if( this.rounds == 0){
            System.out.println("You can't play with no rounds");
            return;
        }


        System.out.println("Let's start the ROCK-PAPER-SCISSORS-LIZARD-SPOCK!!!");
        System.out.println("####################################################");

        int p1Wins = 0;
        int p2Wins = 0;

        while (p1Wins <= Math.round( this.rounds/2) && p2Wins <= Math.round( this.rounds/2) ) {

            Generator p1Pick = player1.getRandomOpt();
            Generator p2Pick = player2.getRandomOpt();

            System.out.println(player1.getName() + " choose " + p1Pick.getName());
            System.out.println(player2.getName() + " choose " + p2Pick.getName());

            if (p1Pick == p2Pick) {
                System.out.println("IT'S A TECHNICAL TIE!!!");
                System.out.println("####################################################");


            } else if ( (p1Pick == Generator.SCISSORS && p2Pick == Generator.PAPER) || (p1Pick == Generator.PAPER && p2Pick == Generator.ROCK) ||
                    (p1Pick == Generator.ROCK && p2Pick == Generator.LIZARD) || (p1Pick == Generator.LIZARD && p2Pick == Generator.SPOCK) ||
                    (p1Pick == Generator.SPOCK && p2Pick == Generator.SCISSORS) || (p1Pick == Generator.SCISSORS && p2Pick == Generator.LIZARD) ||
                    (p1Pick == Generator.LIZARD && p2Pick == Generator.PAPER) || (p1Pick == Generator.PAPER && p2Pick == Generator.SPOCK) ||
                    (p1Pick == Generator.SPOCK && p2Pick == Generator.ROCK) || (p1Pick == Generator.ROCK && p2Pick == Generator.SCISSORS) ) {

                System.out.println(player1.getName() + " won this round!");
                p1Wins++;
                System.out.println("GAME SCORE: " + player1.getName() + ": " + p1Wins + " ||| " + player2.getName() + ": " + p2Wins);
                System.out.println("####################################################");

            } else {
                System.out.println(player2.getName() + " won this round!");
                p2Wins++;
                System.out.println("GAME SCORE: " + player1.getName() + ": " + p1Wins + " ||| " + player2.getName() + ": " + p2Wins);
                System.out.println("####################################################");
            }

        }
        if (p1Wins > p2Wins){
            System.out.println("####################################################");
            System.out.println(player1.getName() + " WON THIS SHIT");
            System.out.println(player1.getName() + " won: " + p1Wins + " rounds.");
            System.out.println(player2.getName() + " won: " + p2Wins + " rounds.");
        } else {
            System.out.println("####################################################");
            System.out.println(player2.getName() + " WON THIS SHIT");
            System.out.println(player2.getName() + " won: " + p2Wins + " rounds.");
            System.out.println(player1.getName() + " won: " + p1Wins + " rounds.");
        }

    }





}
