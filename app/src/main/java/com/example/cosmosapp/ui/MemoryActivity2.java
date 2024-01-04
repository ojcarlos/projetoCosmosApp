package com.example.cosmosapp.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cosmosapp.R;
import com.example.cosmosapp.business.CardBusiness;
import com.example.cosmosapp.business.GameBusiness;
import com.example.cosmosapp.entities.CardEntity;

import java.util.List;

public class MemoryActivity2 extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private List<CardEntity> cardList;
    private CardEntity card01 = null;
    private CardEntity card02 = null;
    private GameBusiness gameBusiness = new GameBusiness();

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
        this.mViewHolder.p1 = findViewById(R.id.p1);
        this.mViewHolder.p1.setBackground(getDrawable(R.drawable.background_button));
        this.mViewHolder.p2 = findViewById(R.id.p2);
    }


    public  void reveal0(View view)  {
        this.mViewHolder.mPlanetImg00.setImageResource(cardList.get(0).getImg());
        saveCard(0);

    }
    public  void reveal01(View view) {
        this.mViewHolder.mPlanetImg01.setImageResource(cardList.get(1).getImg());
        saveCard(1);

    }
    public  void reveal02(View view) {
        this.mViewHolder.mPlanetImg02.setImageResource(cardList.get(2).getImg());
        saveCard(2);
    }
    public  void reveal03(View view){
        this.mViewHolder.mPlanetImg03.setImageResource(cardList.get(3).getImg());
        saveCard(3);
    }
    public  void reveal04(View view){
        this.mViewHolder.mPlanetImg04.setImageResource(cardList.get(4).getImg());
        saveCard(4);
    }
    public  void reveal05(View view){
        this.mViewHolder.mPlanetImg05.setImageResource(cardList.get(5).getImg());
        saveCard(5);
    }
    public  void reveal06(View view){
        this.mViewHolder.mPlanetImg06.setImageResource(cardList.get(6).getImg());
        saveCard(6);
    }
    public  void reveal07(View view){
        this.mViewHolder.mPlanetImg07.setImageResource(cardList.get(7).getImg());
        saveCard(7);
    }
    public  void reveal08(View view){
        this.mViewHolder.mPlanetImg08.setImageResource(cardList.get(8).getImg());
        saveCard(8);
    }
    public  void reveal09(View view){
        this.mViewHolder.mPlanetImg09.setImageResource(cardList.get(9).getImg());
        saveCard(9);
    }
    public  void reveal10(View view){
        this.mViewHolder.mPlanetImg10.setImageResource(cardList.get(10).getImg());
       saveCard(10);
    }
    public  void reveal11(View view){
        this.mViewHolder.mPlanetImg11.setImageResource(cardList.get(11).getImg());
        saveCard(11);
    }
    public  void reveal12(View view){
        this.mViewHolder.mPlanetImg12.setImageResource(cardList.get(12).getImg());
        saveCard(12);
    }
    public  void reveal13(View view){
        this.mViewHolder.mPlanetImg13.setImageResource(cardList.get(13).getImg());
        saveCard(13);
    }
    public  void reveal14(View view){
        this.mViewHolder.mPlanetImg14.setImageResource(cardList.get(14).getImg());
        saveCard(14);
    }


    public  void reveal15(View view){
        this.mViewHolder.mPlanetImg15.setImageResource(cardList.get(15).getImg());
        saveCard(15);
    }
    private boolean verifyCards(CardEntity card){
        if (gameBusiness.verifyCard(card)){
            AlertDialog.Builder isTheSameCard = new AlertDialog.Builder(this);
            isTheSameCard.setTitle("Atenção");
            isTheSameCard.setMessage("Escolha uma carta diferente, esta já foi revelada");
            isTheSameCard.setNeutralButton("OK",null);
            isTheSameCard.create().show();
            return true;
        }
        return false;
    }

    private void saveCard(int i) {
        if (card01 == null) {
            card01 = cardList.get(i);
            if (verifyCards(card01)) {
                card01 = null;
            }
        } else {
            card02 = cardList.get(i);
            if (verifyCards(card02)) {
                card02 = null;
            }
        }
        controlCards();
    }

    private void changeCard(){
        if(card01.getId() == cardList.get(1).getId()){
            mViewHolder.mPlanetImg01.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(2).getId()){
            mViewHolder.mPlanetImg02.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(0).getId()){
            mViewHolder.mPlanetImg00.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(3).getId()){
            mViewHolder.mPlanetImg03.setImageResource(R.drawable.verso);
        }else if(card01.getId() == cardList.get(4).getId()){
            mViewHolder.mPlanetImg04.setImageResource(R.drawable.verso);
        } else if(card01.getId() == cardList.get(5).getId()){
            mViewHolder.mPlanetImg05.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(6).getId()){
            mViewHolder.mPlanetImg06.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(7).getId()){
            mViewHolder.mPlanetImg07.setImageResource(R.drawable.verso);
        }else if(card01.getId() == cardList.get(8).getId()){
            mViewHolder.mPlanetImg08.setImageResource(R.drawable.verso);
        } else if(card01.getId() == cardList.get(9).getId()){
            mViewHolder.mPlanetImg09.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(10).getId()){
            mViewHolder.mPlanetImg10.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(11).getId()){
            mViewHolder.mPlanetImg11.setImageResource(R.drawable.verso);
        }else if(card01.getId() == cardList.get(12).getId()){
            mViewHolder.mPlanetImg12.setImageResource(R.drawable.verso);
        } else if(card01.getId() == cardList.get(13).getId()){
            mViewHolder.mPlanetImg13.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(14).getId()){
            mViewHolder.mPlanetImg14.setImageResource(R.drawable.verso);
        }
        else if(card01.getId() == cardList.get(15).getId()){
            mViewHolder.mPlanetImg15.setImageResource(R.drawable.verso);
        }
        if(card02.getId() == cardList.get(1).getId()){
            mViewHolder.mPlanetImg01.setImageResource(R.drawable.verso);
        } else if(card02.getId() == cardList.get(2).getId()){
            mViewHolder.mPlanetImg02.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(0).getId()){
            mViewHolder.mPlanetImg00.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(3).getId()){
            mViewHolder.mPlanetImg03.setImageResource(R.drawable.verso);
        }else if(card02.getId() == cardList.get(4).getId()){
            mViewHolder.mPlanetImg04.setImageResource(R.drawable.verso);
        } else if(card02.getId() == cardList.get(5).getId()){
            mViewHolder.mPlanetImg05.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(6).getId()){
            mViewHolder.mPlanetImg06.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(7).getId()){
            mViewHolder.mPlanetImg07.setImageResource(R.drawable.verso);
        }else if(card02.getId() == cardList.get(8).getId()){
            mViewHolder.mPlanetImg08.setImageResource(R.drawable.verso);
        } else if(card02.getId() == cardList.get(9).getId()){
            mViewHolder.mPlanetImg09.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(10).getId()){
            mViewHolder.mPlanetImg10.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(11).getId()){
            mViewHolder.mPlanetImg11.setImageResource(R.drawable.verso);
        }else if(card02.getId() == cardList.get(12).getId()){
            mViewHolder.mPlanetImg12.setImageResource(R.drawable.verso);
        } else if(card02.getId() == cardList.get(13).getId()){
            mViewHolder.mPlanetImg13.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(14).getId()){
            mViewHolder.mPlanetImg14.setImageResource(R.drawable.verso);
        }
        else if(card02.getId() == cardList.get(15).getId()){
            mViewHolder.mPlanetImg15.setImageResource(R.drawable.verso);
        }

        if (gameBusiness.p1IsPlaying()){
            mViewHolder.p1.setBackground(null);
            this.mViewHolder.p2.setBackground(getDrawable(R.drawable.background_button));
        }
        else {
            mViewHolder.p2.setBackground(null);
            this.mViewHolder.p1.setBackground(getDrawable(R.drawable.background_button));
        }
        gameBusiness.changePlayer();
        card01 = null;
        card02 = null;



    }

    private void controlCards(){
        if (card01 != null && card02 != null){
            if(gameBusiness.isTheSameCard(card01,card02)){
                card02 = null;
                AlertDialog.Builder isTheSameCard = new AlertDialog.Builder(this);
                isTheSameCard.setTitle("Atenção");
                isTheSameCard.setMessage("Escolha uma carta diferente");
                isTheSameCard.setNeutralButton("OK",null);
                isTheSameCard.create().show();
            }
            else{
                boolean isEqual = gameBusiness.isTheSamePlanet(card01,card02);
                AlertDialog.Builder isTheSameCard = new AlertDialog.Builder(this);
                isTheSameCard.setCancelable(false);
                isTheSameCard.setTitle("Atenção");
                if(isEqual) {
                    isTheSameCard.setMessage("ganhou um ponto!!");
                    isTheSameCard.setNeutralButton("OK", null);
                    isTheSameCard.create().show();
                    gameBusiness.cardsRevealed(card01);
                    gameBusiness.cardsRevealed(card02);
                    int i = gameBusiness.addPoint();
                    if(gameBusiness.p1IsPlaying()){
                        mViewHolder.p1.setText("Player 01:  " + Integer.toString(i));
                    }
                    else {
                        mViewHolder.p2.setText("Player 02:  " + Integer.toString(i));
                    }
                    card01 = null;
                    card02 = null;
                }
                else {

                    isTheSameCard.setMessage("Errou!!!\n" +
                            "Vez do outro jogador!");
                    isTheSameCard.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            changeCard();
                        }
                    });
                    isTheSameCard.create().show();

                }


            }

        }
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
        TextView p1;
        TextView p2;

    }
}