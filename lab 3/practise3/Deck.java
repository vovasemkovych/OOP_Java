package com.tasks3.carddeck;



public class Deck {

	Card[] deck;

    int index;

    

	// Constructor	

	public Deck(){

	    index = 35;

		int i = -1;

		this.deck = new Card[Suit.values.length * Rank.values.length];

	    for (Suit suit: Suit.values) {

	        for (Rank rank: Rank.values) {

	            deck[++i] = new Card(rank,suit);

	        }

	    }

	}

	



    public void shuffle() {

    	Card tmpCard;

    	int q = (int) (Math.random()*300+700);

    	for (int n=0; n<q; n++){

    		int l = (int) (Math.random()*32);

    		int m = (int) (Math.random()*(36-l)+l);

    		tmpCard = this.deck[m];

    		this.deck[m] = this.deck[m-l];

    		this.deck[m-l] = tmpCard;

    	}

    }



    public void order() {

		index = 35;

    	int i = -1;

		this.deck = new Card[Suit.values.length * Rank.values.length];

	    for (Suit suit: Suit.values) {

	        for (Rank rank: Rank.values) {

	            deck[++i] = new Card(rank,suit);

	        }

	    }

    }

    

    public boolean hasNext() {

    	return index > -1;

    }

    



    public Card drawOne() {

    	if (index >= 0)

        	return this.deck[index--];

        else return null;

    }

    

    public void deckPrn(){

    	System.out.println("---Cards in deck-"+(index+1)+"---");

	    for (int j=0; j<index+1; j++){

			System.out.print("|");

			System.out.print(this.deck[j].getSuit().getName());

			System.out.print(" ");

			System.out.println(this.deck[j].getRank().getName());

	    }

    }

	

    public void cardPrn(Card crd){

    	if (crd != null){

    		System.out.print(crd.getSuit().getName());

    		System.out.print(" ");

    		System.out.println(crd.getRank().getName());

    	}

    	else System.out.println("Card is NULL");

    }

    

    

	public static void main(String[] args) {

				

		Deck dk1 = new Deck();



		dk1.shuffle();

		dk1.deckPrn();

		//dk1.order();

		//dk1.cardPrn(dk1.deck[10]);

		/*

		for (int t=0; t<36; t++){

			dk1.cardPrn(dk1.drawOne());

			System.out.println("----------------------");	

		}

		System.out.println(dk1.hasNext());

		dk1.deckPrn();

		*/

	}

    

}