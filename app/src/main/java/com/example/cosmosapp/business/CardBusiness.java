package com.example.cosmosapp.business;

import androidx.annotation.Nullable;

import com.example.cosmosapp.entities.CardEntity;
import com.example.cosmosapp.repository.CardRepository;

import java.util.Collections;
import java.util.List;

public class CardBusiness {
    public List<CardEntity> getRandomList(){
        List<CardEntity> mlist = new CardRepository().getmList();
        Collections.shuffle(mlist);
        return mlist;
    }


}
