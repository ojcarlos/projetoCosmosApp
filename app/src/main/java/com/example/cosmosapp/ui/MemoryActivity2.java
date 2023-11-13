package com.example.cosmosapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cosmosapp.R;
import com.example.cosmosapp.business.CardBusiness;
import com.example.cosmosapp.entities.CardEntity;

import java.util.List;

public class MemoryActivity2 extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private List<CardEntity> cardList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memory_activity_2);
        cardList = new CardBusiness().getRandomList();

        this.mViewHolder.mPlanetImg00 = findViewById(R.id.img0);
        this.mViewHolder.mPlanetImg01 = findViewById(R.id.img01);
        this.mViewHolder.mPlanetImg02 = findViewById(R.id.img02);
        this.mViewHolder.mPlanetImg03 = findViewById(R.id.img03);
        this.mViewHolder.mPlanetImg04 = findViewById(R.id.img04);
        this.mViewHolder.mPlanetImg05 = findViewById(R.id.img05);
        this.mViewHolder.mPlanetImg06 = findViewById(R.id.img06);
        this.mViewHolder.mPlanetImg07 = findViewById(R.id.img07);
        this.mViewHolder.mPlanetImg08 = findViewById(R.id.img08);
        this.mViewHolder.mPlanetImg09 = findViewById(R.id.img09);
        this.mViewHolder.mPlanetImg10 = findViewById(R.id.img10);
        this.mViewHolder.mPlanetImg11 = findViewById(R.id.img11);
        this.mViewHolder.mPlanetImg12 = findViewById(R.id.img12);
        this.mViewHolder.mPlanetImg13 = findViewById(R.id.img13);
        this.mViewHolder.mPlanetImg14 = findViewById(R.id.img14);
        this.mViewHolder.mPlanetImg15 = findViewById(R.id.img15);
    }
    public  void reveal0(View view){
        this.mViewHolder.mPlanetImg00.setImageResource(cardList.get(0).getImg());
    }
    public  void reveal01(View view){
        this.mViewHolder.mPlanetImg01.setImageResource(cardList.get(1).getImg());
    }
    public  void reveal02(View view){
        this.mViewHolder.mPlanetImg02.setImageResource(cardList.get(2).getImg());
    }
    public  void reveal03(View view){
        this.mViewHolder.mPlanetImg03.setImageResource(cardList.get(3).getImg());
    }
    public  void reveal04(View view){
        this.mViewHolder.mPlanetImg04.setImageResource(cardList.get(4).getImg());
    }
    public  void reveal05(View view){
        this.mViewHolder.mPlanetImg05.setImageResource(cardList.get(5).getImg());
    }
    public  void reveal06(View view){
        this.mViewHolder.mPlanetImg06.setImageResource(cardList.get(6).getImg());
    }
    public  void reveal07(View view){
        this.mViewHolder.mPlanetImg07.setImageResource(cardList.get(7).getImg());
    }
    public  void reveal08(View view){
        this.mViewHolder.mPlanetImg08.setImageResource(cardList.get(8).getImg());
    }
    public  void reveal09(View view){
        this.mViewHolder.mPlanetImg09.setImageResource(cardList.get(9).getImg());
    }
    public  void reveal10(View view){
        this.mViewHolder.mPlanetImg10.setImageResource(cardList.get(10).getImg());
    }
    public  void reveal11(View view){
        this.mViewHolder.mPlanetImg11.setImageResource(cardList.get(11).getImg());
    }
    public  void reveal12(View view){
        this.mViewHolder.mPlanetImg12.setImageResource(cardList.get(12).getImg());
    }
    public  void reveal13(View view){
        this.mViewHolder.mPlanetImg13.setImageResource(cardList.get(13).getImg());
    }
    public  void reveal14(View view){
        this.mViewHolder.mPlanetImg14.setImageResource(cardList.get(14).getImg());
    }
    public  void reveal15(View view){
        this.mViewHolder.mPlanetImg15.setImageResource(cardList.get(15).getImg());
    }

    private static class ViewHolder{
        ImageView mPlanetImg00;
        ImageView mPlanetImg01;
        ImageView mPlanetImg02;
        ImageView mPlanetImg03;
        ImageView mPlanetImg04;
        ImageView mPlanetImg05;
        ImageView mPlanetImg06;
        ImageView mPlanetImg07;
        ImageView mPlanetImg08;
        ImageView mPlanetImg09;
        ImageView mPlanetImg10;
        ImageView mPlanetImg11;
        ImageView mPlanetImg12;
        ImageView mPlanetImg13;
        ImageView mPlanetImg14;
        ImageView mPlanetImg15;


    }
}