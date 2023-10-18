package com.example.cosmosapp.repository;

import com.example.cosmosapp.R;
import com.example.cosmosapp.entities.PlanetEntity;

import java.util.ArrayList;
import java.util.List;

public class PlanetRepository {

    private List<PlanetEntity> mList;

    public PlanetRepository() {
        this.mList = new ArrayList<>();
        this.mList.add(new PlanetEntity(0, "Mercurio", "- É o menor planeta do Sistema Solar. \n" +
                "- É um pouco maior que a Lua. \n" +
                "- É o planeta mais perto do Sol, mas não é o mais quente.\n" +
                "- Pode ser visto a olho nu.\n" +
                "- Um dia em Mercúrio dura 59 dias na Terra.\n" +
                "- Um ano em Mercúrio dura 88 dias na Terra.\n" +
                "- O astro recebeu o nome do deus romano Mercúrio, que era encarregado de levar as mensagens de Júpiter.\n" +
                "- O símbolo astronômico de Mercúrio é uma versão estilizada do caduceu de Hermes.\n" +
                "- Mercúrio não tem nenhuma lua."
                , R.drawable.mercurio));
        this.mList.add(new PlanetEntity(1, "Venus", "É o planeta mais quente do Sistema Solar.\n" +
                "Sua atmosfera é bem densa: Ela prende o calor lá dentro e isso faz Vênus ser super quente.\n" +
                "Vênus gira na direção oposta da Terra e da maioria dos outros planetas.\n" +
                "Seu tamanho é bem parecido com o da Terra.\n" +
                "Um dia em Vênus dura 243 dias na Terra.\n" +
                "Um ano em Vênus dura 225 dias na Terra.\n"
                , R.drawable.venus));

    }


    public PlanetEntity get(int id) {
        return this.mList.get(id);
    }

    public List<PlanetEntity> getList() {
        return this.mList;
    }
}
