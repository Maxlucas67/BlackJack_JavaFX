public class Dealer {
    private Hand hand;

    public Dealer() {
        hand = new Hand();
    }

    /**
     * Gets the dealer's current hand.
     * @return the dealer's hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Clears the dealer's hand (prepares for a new round).
     */
    public void clearHand() {
        hand.clear();
    }

    /**
     * Receives a card and adds it to the dealer's hand.
     * @param card the card to receive
     * @param faceUp true if the card should be face up, false if face down
     */
    public void receiveCard(Card card, boolean faceUp) {
        card.setFaceUp(faceUp); // Set face up status of the card
        hand.addCard(card);
    }

    /**
     * Determines if the dealer should hit based on game rules.
     * @return true if the dealer should hit, false otherwise
     */
    public boolean shouldHit() {
        // Implement logic for when dealer should hit (e.g., hit until 17)
        return hand.getScore() < 17;
    }

    /**
     * Calculates the score of the dealer's hand.
     * @return the score of the dealer's hand
     */
    public int calculateScore() {
        return hand.getScore();
    }
}
