package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Anh Phan
 * @modifier Zahra Arshad
 */
public class BlackJack extends Game {

    public BlackJack(String givenName) {
        super(givenName);
    }

    public void play() {
        String name = Helper.getString("Welcome to Blackjack!\nWhat is your name?\n--> ");

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

                int choice = Helper.getNumber("Do you want to hit?(No - 0/Yes - 1)\n-->");
                if (choice != 1) {
                    break;
                }
                player.receiveCard(deck.deal()); // Adding a card to player's hand

            }

            this.declareWinner();
            if (Helper.getNumber("Do you want to play again?(No - 0/Yes - 1)\n-->") != 1) {
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
                msg = A.getPlayerID() + " Busted! " + B.getPlayerID() + " Wins!";
            }
        } else if (B.getPoints() > 21) {
            msg = B.getPlayerID() + " Busted! " + A.getPlayerID() + " Wins!";
        } else {
            switch (((BlackJackPlayer) A).compareTo((BlackJackPlayer) B)) {
                case 0:
                    msg = "Draw";
                    break;
                case 1:
                    msg = A.getPlayerID() + " wins! " + B.getPlayerID() + " Lost!";
                    break;
                case -1:
                    msg = B.getPlayerID() + " wins! " + A.getPlayerID() + " Lost!";
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
