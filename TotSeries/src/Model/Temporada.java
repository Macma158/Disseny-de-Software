/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Temporada {
    private String numeroTemporada;
    private ArrayList<Episodi> episodis;
    
    public Temporada(String numero, ArrayList<Episodi> epis){
        numeroTemporada = numero;
        episodis = epis;
    }
    
    public Temporada(String numero, Episodi ep){
        numeroTemporada = numero;
        episodis = new ArrayList<Episodi>();
        episodis.add(ep);
    }
    
    public Temporada(String numero){
        numeroTemporada = numero;
    }
    
    public void afegirEpisodi(Episodi ep){
        episodis.add(ep);
    }
    public int getNumeroEpisodis(){
        return episodis.size();
    }
    
    public String getTemp(){
        return numeroTemporada;
    }
    
    public Episodi getEpisodi(int i){
        return episodis.get(i);
    }
    
    /*
    versio toString per mostrar en series
    */
    public String contingutTemporada(){
        return numeroTemporada+" "+getNumeroEpisodis()+" episodis";
    }
    
    /*
    per mostrar tots els episodis de la temporada
    */
    public String toString(){
        String str="";
        for(Episodi ep: episodis){
            str+= ep+"\n";
        }
        return str;
    }
}
