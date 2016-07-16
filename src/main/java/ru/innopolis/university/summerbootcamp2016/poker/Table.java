package ru.innopolis.university.summerbootcamp2016.poker;

import java.util.ArrayList;
import java.util.List;

public class Table {
    List<Card> cardsOnTable = new ArrayList<Card>();
    public final int id = 1;

    public void takeCard(Deck thisDeck){
        Card nextCard = thisDeck.getCard(id);
        cardsOnTable.add(nextCard);
        Game.amountCardsTable++;
    }

    public void takeFlop(Deck thisDeck){
        takeCard(thisDeck);
        takeCard(thisDeck);
        takeCard(thisDeck);
    }

    public void showTable(){
        for(int i=0;i<cardsOnTable.size();i++){
            System.out.printf("%s   %s\n",cardsOnTable.get(i).getSuit(),cardsOnTable.get(i).getValue());
        }
    }

}
