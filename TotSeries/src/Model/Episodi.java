/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Daniel
 */
public class Episodi {
    private String titol, duracio, idiomaOriginal, descripcio, dataEmisio;
    private float valoracio;
    private int votos;
    
    public Episodi(String tit, String dura,String idiO,String desc,String data){
        titol = tit;
        duracio = dura;
        idiomaOriginal = idiO;
        descripcio = desc;
        dataEmisio = data;
        valoracio = 0;
        votos = 0;
    }
    
    public void valorar(int val){
        calcValoracio(val);
    }
    
    private void calcValoracio(int val){
        valoracio = ((valoracio * votos)+val)/(votos+1);
        votos++;
    }
    public String getTitol(){
        return titol;
    }
    
    public String getDuracio(){
        return duracio;
    }
    public String getIdioma(){
        return idiomaOriginal;
    }
    public String getDescripcio(){
        return descripcio;
    }
    public String getDataE(){
        return dataEmisio;
    }
    public float getValoracio(){
        return valoracio;
    } 
    
    /*
    per mostrar tota la informacio de l'episodi
    */
    public String getInformacio(){
        return "Titol: "+titol+"\nDuracio: "+duracio+"\nValoracio: "+valoracio+"\nIdiomaOriginal: "+idiomaOriginal+
                "\nDescripcio: "+descripcio+"\nData Emisio: "+dataEmisio;
    }
    /*
    per demanar una llista d'episodis d'una temporada no mostrare informacio mes profunda sobre aquest
    */
    public String toString(){
        return titol+" "+duracio+" valoracio: "+valoracio;
    }
}
