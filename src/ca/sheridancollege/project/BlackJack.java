package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Anh Phan
 */
public class BlackJack extends Game {

    public BlackJack(String givenName) {
        super(givenName);
    }

    public void play() {
        String name = Helper.getString("What is your name? ");

        while (true) {
            Deck deck = new Deck(52); // Instanciating a deck

            BlackJackPlayer player = new BlackJackPlayer(name); // Instanciating a player
            BlackJackPlayer computer = new BlackJackPlayer("Computer"); // Instanciating a bot

            super.getPlayers().add(player); // Adding players to the players list
            super.getPlayers().add(computer);

            player.receiveCard(deck.deal()); // Dealing cards to the player
            player.receiveCard(deck.deal());

            computer.receiveCard(deck.deal()); // Dealing cards to the bot
            computer.receiveCard(deck.deal());

            while (computer.getPoints() < 17) { // Bot's moves
                computer.receiveCard(deck.deal());
            }
            while (true) { // Player's moves
                System.out.println(player.toString()); // Printing out the player's hand
                
                if (player.getCards().size() >= 5 || player.getPoints() > 21) { // Limit of a hand is 5 cards, and 21 points
                    break;
                }
                
                int choice = Helper.getNumber("Do you want to hit?(0/1)");
                if (choice != 1) {
                    break;
                }
                player.receiveCard(deck.deal()); // Adding a card to player's hand

            }

            this.declareWinner();
            if (Helper.getNumber("Do you want to play again?(0/1)") != 1) {
                break;
            }
            
            super.setPlayers(new ArrayList<>()); // Setting new players list
        }
    }

    public void declareWinner() {
        Player A = (BlackJackPlayer) super.getPlayers().get(0);
        Player B = (BlackJackPlayer) super.getPlayers().get(1);

        String msg = null;

        if (A.getPoints() > 21) {
            if (B.getPoints() > 21) {
                msg = "Both of you busted! Draw!";
            } else {
                msg = A.getPlayerID() + " busted! " + B.getPlayerID() + " win!";
            }
        } else if (B.getPoints() > 21) {
            msg = B.getPlayerID() + " Busted! " + A.getPlayerID() + " win!";
        } else {
            switch (((BlackJackPlayer) A).compareTo((BlackJackPlayer) B)) {
                case 0:
                    msg = "Draw";
                    break;
                case 1:
                    msg = A.getPlayerID() + " win! " + B.getPlayerID() + " Lost!";
                    break;
                case -1:
                    msg = B.getPlayerID() + " win! " + A.getPlayerID() + " Lost!";
                    break;
            }
        }
        System.out.println(A.toString());
        System.out.println("");
        System.out.println(B.toString());
        System.out.println("");
        System.out.printf("%s's points: %d --- %s's points: %d\n", A.getPlayerID(), A.getPoints(),
                B.getPlayerID(), B.getPoints());
        System.out.println("");
        System.out.println(msg);

    }

}
