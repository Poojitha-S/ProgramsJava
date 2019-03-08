package com.bridgeit.oops;

public class DeckOfCardUsingQueue
{
	public static void main(String[] args) 
	{
		DeckOfCardUtil deckOfCardUtil=new DeckOfCardUtil();
		int noOfPlayer = 4;
		int noOfCards = 9;
		String[] init = deckOfCardUtil.getCards();
		String[] shuffleCards = deckOfCardUtil.shuffleCards(init);
		String[][] distributedShuffle =deckOfCardUtil.distributedCards(shuffleCards, noOfPlayer, noOfCards);
		System.out.println("----------------------------AFTER SORTING-------------------------------");		
		deckOfCardUtil.deckOfCardsQueue(distributedShuffle, noOfPlayer, noOfCards);
    }
}
	 

		
	
	
		
	

