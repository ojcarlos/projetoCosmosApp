package com.example.cosmosapp.business;

import com.example.cosmosapp.entities.PlanetEntity;
import com.example.cosmosapp.repository.PlanetRepository;

import java.util.List;

public class PlanetBusiness {
    public List<PlanetEntity> getList(){

        return new PlanetRepository().getList();
    }

    public PlanetEntity get(int id) {

        return new PlanetRepository().get(id);
    }


}
