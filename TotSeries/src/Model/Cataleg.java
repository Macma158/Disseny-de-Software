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
public class Cataleg {
    private ArrayList<String> mesValorats;
    private ArrayList<Serie> series;
    
    public Cataleg(){
        mesValorats = new ArrayList<String>();
        series = new ArrayList<Serie>();
    }
    
    public void addSerie(Serie serie){
        series.add(serie);
    }
    
    public Serie getSerie(int i){
        return series.get(i);
    }
    
    public void actualitzarValoracio(String valoracio){
        //agafa la nota i episodi d'aquesta
        String numero = valoracio.substring(11, 14);
        String episodi = valoracio.substring(14);
        float val = Float.parseFloat(numero);
            
        //comproba si ja es a la llista i l'elimina
        for(int i=0; i<mesValorats.size(); i++){
            String episodi2 = mesValorats.get(i).substring(14);
            if(episodi.equals(episodi2)){
                mesValorats.remove(i);
            }
        }
        mesValorats.add(valoracio);
        //permuta els valors desde el final, fins que arriba a la seva posicio
        for(int i = mesValorats.size()-2; i>-1; i--){
            String numero2 = mesValorats.get(i).substring(11, 14);
            float val2 = Float.parseFloat(numero2);
            if(val>val2){
                String temp;
                temp = mesValorats.get(i);
                mesValorats.set(i, valoracio);
                mesValorats.set(i+1, temp);
            }
        }
    }
    
    public String mostrarMesValorats(){
        String str="";
        int j = mesValorats.size();
        if(mesValorats.size()>5);
            j=5;
        for(int i = 0; i<j; i++){
            str+=mesValorats.get(i)+"\n";
        }
        return str;
    }
    
    public String toString(){
        String str = "";
        for(Serie serie: series){
            str+= "Titol: "+serie.getTitol()+"  "+serie.getNumeroTemporades()+" Temporades ";
        }
        return str;
    }
}
