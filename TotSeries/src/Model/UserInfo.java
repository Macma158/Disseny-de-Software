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
public class UserInfo {
    private ArrayList<Usuari> usuaris;
    
    public UserInfo(){
        usuaris = new ArrayList<Usuari>();
    }
    
    public boolean registre(Usuari usuari){
        for(Usuari user: usuaris){
            if(user.getUser().equals(usuari.getUser())){
                return false;
            }
        }
        usuaris.add(usuari);
        return true;
    }
    
    public Usuari LogIn(String user, String password){
        for(Usuari usuari: usuaris){
            if(usuari.getUser().equals(user) && usuari.getPassword().equals(password)){
                return usuari;
            }
        }
        return null;
    }
    
    public String valoracioUsuari(String userName){
        for(Usuari usuari: usuaris){
            if(usuari.getUser().equals(userName)){
                return usuari.valoracionsUsuari();
            }
        }
        //no tractarem el cas pel que no existeix l'usuari
        return "";
    }
}
