package com.hb.formation.vols.datas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.hb.formation.vols.model.Place;
import com.hb.formation.vols.model.Vol;

public class Vols {

    private final static Vols INSTANCE = new Vols();
    
    private List<Vol> datas;

    /**
     * @return the instance
     */
    public static Vols getInstance() {
        return INSTANCE;
    }

    /**
     * private Constructor
     */
    private Vols() {
        this.datas = new ArrayList<Vol>();
        this.datas.add(new Vol(1, "Paris", "Clermont", Collections.<Place> emptyList()));
        this.datas.add(new Vol(2, "Paris", "Rio", Arrays.asList(
                new Place("10A", 1200, 2300),
                new Place("10B", 1200, 0))));
    }

    /**
     * @return the datas
     */
    public List<Vol> getDatas() {
        return datas;
    }
    
    public Vol getVol(int id) {
        System.out.println("getVol: " + id);
        return this.datas.stream().filter(v -> v.getId() == id).findFirst().orElse(null);
    }
    
}
