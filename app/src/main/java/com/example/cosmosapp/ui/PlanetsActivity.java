package com.example.cosmosapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cosmosapp.R;
import com.example.cosmosapp.business.PlanetBusiness;
import com.example.cosmosapp.constants.PlanetsConstants;
import com.example.cosmosapp.entities.PlanetEntity;

import java.io.Console;

public class PlanetsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planets);


        this.mViewHolder.mPlanetName = findViewById(R.id.planet_name);
        this.mViewHolder.mPlanetImg = findViewById(R.id.planet_img);
        this.mViewHolder.mPlanetInformation = findViewById(R.id.planet_information);
        this.getData();


    }

    private static class ViewHolder{
        TextView mPlanetName;
        ImageView mPlanetImg;
        TextView mPlanetInformation;

    }

    private  void getData(){
        Bundle bundle = getIntent().getExtras();
        int id = bundle.getInt(PlanetsConstants.PLANET_ID);
        PlanetEntity planet = new PlanetBusiness().get(id);

        this.mViewHolder.mPlanetName.setText(planet.getName());
        this.mViewHolder.mPlanetImg.setImageResource(planet.getImg());
        this.mViewHolder.mPlanetInformation.setText(planet.getInformation());

    }
}