package com.example.cosmosapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cosmosapp.OnListClick;
import com.example.cosmosapp.R;
import com.example.cosmosapp.entities.PlanetEntity;
import com.example.cosmosapp.viewholder.PlanetViewHolder;

import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetViewHolder> {

    private List<PlanetEntity> mlist;
    private OnListClick onListClick;

    public PlanetAdapter(List<PlanetEntity> mlist, OnListClick listenner) {

        this.mlist = mlist;
        this.onListClick = listenner;
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.item_planet, parent, false);
        return new PlanetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        PlanetEntity planet = this.mlist.get(position);
        holder.bind(planet, onListClick);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
}
