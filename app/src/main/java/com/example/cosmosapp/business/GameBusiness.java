package com.example.cosmosapp.business;

import com.example.cosmosapp.entities.CardEntity;

import java.util.ArrayList;
import java.util.List;

public class GameBusiness {

    private List<CardEntity> aux = new ArrayList<>();
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
}
