public class Player {
    private Hand hand;
    private int balance;

    public Player() {
        hand = new Hand();
        balance = 1000; // Starting balance for the player, adjust as needed
    }

    /**
     * Gets the player's current hand.
     * @return the player's hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Gets the player's current balance.
     * @return the player's balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Adjusts the player's balance by the given amount.
     * @param amount the amount to adjust the balance by (positive or negative)
     */
    public void adjustBalance(int amount) {
        balance += amount;
    }

    /**
     * Clears the player's hand (prepares for a new round).
     */
    public void clearHand() {
        hand.clear();
    }

    /**
     * Receives a card and adds it to the player's hand.
     * @param card the card to receive
     */
    public void receiveCard(Card card) {
        hand.addCard(card);
    }

    /**
     * Calculates the score of the player's hand.
     * @return the score of the player's hand
     */
    public int calculateScore() {
        return hand.getScore();
    }
}
