package com.example.cosmosapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cosmosapp.R;
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

        List<PlanetEntity> planetEntityList = new PlanetRepository().getList();

        this.mViewHolder.mRecyclerPlanets = findViewById(R.id.recycler_planets);
    }

    private static class ViewHolder{
        RecyclerView mRecyclerPlanets;
    }
}