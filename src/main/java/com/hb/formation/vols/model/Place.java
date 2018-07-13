package com.hb.formation.vols.model;

public class Place {

    private String numero;
    private double achat;
    private double vente;

    
    
    /**
     * @param numero
     * @param achat
     * @param vente
     */
    public Place(String numero, double achat, double vente) {
        super();
        this.numero = numero;
        this.achat = achat;
        this.vente = vente;
    }
    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }
    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * @return the achat
     */
    public double getAchat() {
        return achat;
    }
    /**
     * @param achat the achat to set
     */
    public void setAchat(double achat) {
        this.achat = achat;
    }
    /**
     * @return the vente
     */
    public double getVente() {
        return vente;
    }
    /**
     * @param vente the vente to set
     */
    public void setVente(double vente) {
        this.vente = vente;
    }
    
    
}
