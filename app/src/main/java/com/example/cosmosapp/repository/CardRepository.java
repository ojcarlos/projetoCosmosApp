package com.example.cosmosapp.repository;

import com.example.cosmosapp.R;
import com.example.cosmosapp.entities.CardEntity;
import com.example.cosmosapp.entities.PlanetEntity;

import java.util.ArrayList;
import java.util.List;

public class CardRepository {
    private List<CardEntity> mList;

    public CardRepository() {
        this.mList = new ArrayList<>();
        this.mList.add(new CardEntity(0, R.drawable.mercurio,0));
        this.mList.add(new CardEntity(1, R.drawable.mercuriom,0));
        this.mList.add(new CardEntity(2, R.drawable.venus,1));
        this.mList.add(new CardEntity(3, R.drawable.venusm,1));
        this.mList.add(new CardEntity(4, R.drawable.terra,2));
        this.mList.add(new CardEntity(5, R.drawable.terram,2));
        this.mList.add(new CardEntity(6, R.drawable.marte,3));
        this.mList.add(new CardEntity(7, R.drawable.martem,3));
        this.mList.add(new CardEntity(8, R.drawable.jupiter,4));
        this.mList.add(new CardEntity(9, R.drawable.jupiterm,4));
        this.mList.add(new CardEntity(10, R.drawable.saturno,5));
        this.mList.add(new CardEntity(11, R.drawable.saturnom,5));
        this.mList.add(new CardEntity(12, R.drawable.urano,6));
        this.mList.add(new CardEntity(13, R.drawable.uranom,6));
        this.mList.add(new CardEntity(14, R.drawable.netuno,7));
        this.mList.add(new CardEntity(14, R.drawable.netunom,7));
    }

    public List<CardEntity> getmList() {
        return mList;
    }

}
