package ca.sheridancollege.project;

/**
 *
 * @author Anh Phan
 */
public class BlackJack extends Game {

    public BlackJack(String givenName) {
        super(givenName);
    }

    public void play() {
        Deck deck = new Deck(52);

        super.getPlayers().add(new BlackJackPlayer(Helper.getString("What is your name? ")));
        super.getPlayers().add(new BlackJackPlayer("Computer"));

        Player player = super.getPlayers().get(0);
        Player computer = super.getPlayers().get(1);
    }

    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
