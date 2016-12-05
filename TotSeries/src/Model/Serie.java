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
public class Serie {
    private String titol;
    private String descripcio;
    private Productor productora;
    private ArrayList<Artista> artistes;
    private ArrayList<Temporada> temporades;
    
    public Serie(String tit,String desc,Productor prod, ArrayList<Artista> artists, ArrayList<Temporada> temp){
        titol = tit;
        descripcio = desc;
        productora = prod;
        artistes = artists;
        temporades = temp;
    }
    
    public Serie(String tit,String desc,Productor prod, ArrayList<Artista> artists){
        titol = tit;
        descripcio = desc;
        productora = prod;
        artistes = artists;
        temporades = new ArrayList<Temporada>();
    }
    
    public Serie(String tit, String desc){
        titol = tit;
        descripcio = desc;
    }
    
    public void addActors(Artista artis){
        artistes.add(artis);
    }
    
    public void addProductor(Productor prod){
        productora = prod;
    }
    
    public void afegirTemporada(Temporada temp){
        temporades.add(temp);
    }
    
    public Temporada getTemporada(int i){
        return temporades.get(i);
    }
    
    public int getNumeroTemporades(){
        return temporades.size();
    }
    
    public String getTitol(){
        return titol;
    }
    public String getDescripcio(){
        return descripcio;
    }
    public Productor getProductor(){
        return productora;
    }
    public String getArtistes(){
        String str = "";
        for(Artista art: artistes){
            str+= art+"\n";
        }
        return str;
    }
    
    public String getTemporades(){
        String str = "";
        int i = 1;
        for(Temporada temp: temporades){
            str+= temp.contingutTemporada()+"\n";
        }
        return str;
    }
    
    /*
    toString per mostrar pel cataleg
    */
    public String getInformacioSerie(){
        return "Titol: "+titol+" Numero Temporades: "+this.getNumeroTemporades();
    }
    /*
    informacio de la serie
    */
    public String toString(){
        return "Titol: "+titol+"\nDescripcio: "+descripcio+"\nproductora: "+
                productora+"\nArtistes: "+getArtistes()+"\nTemporades: "+getTemporades();
    }
    
}
