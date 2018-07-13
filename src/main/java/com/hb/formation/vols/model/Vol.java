package com.hb.formation.vols.model;

import java.util.List;

public class Vol {

    private int id;
    private String depart;
    private String arrivee;
    private List<Place> places;

    
    
    /**
     * @param id
     * @param depart
     * @param arrivee
     * @param places
     */
    public Vol(int id, String depart, String arrivee, List<Place> places) {
        super();
        this.id = id;
        this.depart = depart;
        this.arrivee = arrivee;
        this.places = places;
    }
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the depart
     */
    public String getDepart() {
        return depart;
    }
    /**
     * @param depart the depart to set
     */
    public void setDepart(String depart) {
        this.depart = depart;
    }
    /**
     * @return the arrivee
     */
    public String getArrivee() {
        return arrivee;
    }
    /**
     * @param arrivee the arrivee to set
     */
    public void setArrivee(String arrivee) {
        this.arrivee = arrivee;
    }
    /**
     * @return the places
     */
    public List<Place> getPlaces() {
        return places;
    }
    /**
     * @param places the places to set
     */
    public void setPlaces(List<Place> places) {
        this.places = places;
    }

}
