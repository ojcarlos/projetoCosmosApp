package com.example.cosmosapp.business;

import com.example.cosmosapp.entities.CardEntity;
import com.example.cosmosapp.entities.Player;

import java.util.ArrayList;
import java.util.List;

public class GameBusiness {

    private List<CardEntity> aux = new ArrayList<>();
    private Player p1 = new Player(1);
    private Player p2 = new Player(2);
    private Player currentPlayer = p1;
    public boolean isTheSamePlanet(CardEntity card01, CardEntity card02){
        return card01.equals(card02);
    }
    public boolean isTheSameCard(CardEntity card01, CardEntity card02){
        return  card01.getId() == card02.getId();
    }
    public void cardsRevealed(CardEntity card){
        aux.add(card);
    }

    public  boolean verifyCard(CardEntity card){
        for (int i = 0; i < aux.size(); i++) {
            if(this.isTheSameCard(card, aux.get(i))){
                return true;
            }

        }
        return false;
    }

    public void changePlayer(){
        if (currentPlayer.equals(p1)){
            currentPlayer = p2;
        }
        else {
            currentPlayer = p1;
        }
    }

    public boolean p1IsPlaying(){
       return currentPlayer.equals(p1);


    }

    public int addPoint(){
        int i;
        if (currentPlayer.equals(p1)){
            i = p1.getScore() + 1;
            p1.setScore(i);
        }
        else {
            i = p2.getScore() + 1;
            p2.setScore(i);
        }
        return i;
    }
}
