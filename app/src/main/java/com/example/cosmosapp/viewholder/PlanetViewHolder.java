package com.example.cosmosapp.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cosmosapp.OnListClick;
import com.example.cosmosapp.R;
import com.example.cosmosapp.entities.PlanetEntity;

public class PlanetViewHolder extends RecyclerView.ViewHolder {

    TextView mPlanetName;
    public PlanetViewHolder(@NonNull View itemView) {

        super(itemView);
        this.mPlanetName =itemView.findViewById(R.id.planet_name);

    }
    public void bind (PlanetEntity planet, OnListClick onListClick){
        this.mPlanetName.setText(planet.getName());

        this.mPlanetName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onListClick.onClick(planet.getId());
            }
        });
    }
}
