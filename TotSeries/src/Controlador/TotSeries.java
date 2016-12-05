/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Administrador;
import Model.Dades;
import Model.Episodi;
import Model.Serie;
import Model.Usuari;

/**
 *
 * @author Daniel
 */
public class TotSeries {
    private Dades dades;
    private TotSeriesDataManager dataManager;
    private boolean admin, logat;
    private Usuari sesio;
    public TotSeries(){
        dades = new Dades();
        admin = logat = false;
        sesio = null;
        TotSeriesDataManager dataManager = new TotSeriesDataManager(dades);
	dataManager.obtenirDades("data/TotSeries.xml");
    }
    
    public boolean getAdmin(){
        return admin;
    }
    
    public boolean getLogat(){
        return logat;
    }
    
    
    
    public boolean registre(Usuari usuari){
        logat = dades.registre(usuari);
        return logat;
    }
    
    /*
    retorna l'intent de log in, guarda la sesio si n'hi ha
    */
    public boolean LogIn(String user, String password){
        sesio = dades.LogIn(user, password);
        if(sesio == null){
            return false;
        }
        logat = true;
        if(sesio instanceof Administrador){
            admin = true;
        }
        return true;
    }
    
    /*
    surt de la sesio
    */
    public void LogOff(){
        logat = false;
        admin = false;
        sesio = null;
    }
    
    /*
    Mostra les valoracions d'un usuari
    */
    public String valoracioUsuari(String userName){
        return dades.valoracioUsuari(userName);
    }
    
    /*
    Afegeix una nova serie
    */
    public void addSerie(Serie serie){
        dades.addSerie(serie);
    }
    
    /*
    Retorna una serie
    */
    public Serie getSerie(int i){
        return dades.getSerie(i);
    }
    
    /*
    Reprodueix un episodi, rep una valoracio i actualitza les valoracions
    */
    public void reproduir(Episodi episodi){
        //no tenim un mode de reproduccio
        System.out.println("ESTOY REPRODUCIENDO :D");
        System.out.println("ESTOY HE ACABADO :D");
        //si l'usuari ha valorat
        
    }
    /*
    Mostra el top 5 de valoracions d'episodis
    */
    public String mostrarMesValorats(){
        return dades.mostrarMesValorats();
    }
    
    /*
    Mostra el llistat de series
    */
    public String mostrarCataleg(){
        return dades.mostrarCataleg();
    }
}
