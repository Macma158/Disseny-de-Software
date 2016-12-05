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
public class Dades {
    private UserInfo userInfo;
    private Cataleg cataleg;
    
    public Dades(){
        userInfo = new UserInfo();
        cataleg = new Cataleg();
    }
    
    
    public boolean registre(Usuari usuari){
        return userInfo.registre(usuari);
    }
    
    public Usuari LogIn(String user, String password){
        return userInfo.LogIn(user, password);
    }
 
    public String valoracioUsuari(String userName){
        return userInfo.valoracioUsuari(userName);
    }
    
    public void addSerie(Serie serie){
        cataleg.addSerie(serie);
    }
    
    public Serie getSerie(int i){
        return cataleg.getSerie(i);
    }
    
    public void actualitzarValoracio(String valoracio){
        cataleg.actualitzarValoracio(valoracio);
    }
    
    public String mostrarMesValorats(){
        return cataleg.mostrarMesValorats();
    }
    
    public String mostrarCataleg(){
        return cataleg.toString();
    }
}
