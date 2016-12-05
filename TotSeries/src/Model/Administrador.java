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
public class Administrador extends Usuari{
    
    public Administrador(String user, String pass, String name) {
        super(user, pass, name);
    }
    
    public String toString(){
        return "Nom: "+this.getNom()+" Usuari: "+this.getUser();
    }
}
