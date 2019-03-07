package com.bridgeit.oops;

public class DeckOfCard 
{
	public static void main(String[] args)
	{
		DeckOfCardUtil util=new DeckOfCardUtil();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] cards = util.getCards();
		String[] shuffleCards = util.shuffleCards(cards);
		util.distributedCards(shuffleCards, noOfPlayer, noOfCards);
	}
}
