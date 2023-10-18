package com.example.cosmosapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cosmosapp.R;
import com.example.cosmosapp.adapter.PlanetAdapter;
import com.example.cosmosapp.business.PlanetBusiness;
import com.example.cosmosapp.entities.PlanetEntity;
import com.example.cosmosapp.repository.PlanetRepository;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlanetEntity planet = new PlanetEntity();

        List<PlanetEntity> planetEntityList = new PlanetBusiness().getList();

        this.mViewHolder.mRecyclerPlanets = findViewById(R.id.recycler_planets);

        PlanetAdapter adapter = new PlanetAdapter(planetEntityList);

        this.mViewHolder.mRecyclerPlanets.setAdapter(adapter);

        this.mViewHolder.mRecyclerPlanets.setLayoutManager(new LinearLayoutManager(this));
    }

    private static class ViewHolder{
        RecyclerView mRecyclerPlanets;
    }
}