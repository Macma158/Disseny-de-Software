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
public class Artista {
    private String nom;
    private String nacionalitat;
    
    public Artista(String name, String nacio){
        nom = name;
        nacionalitat = nacio;
    }
    
    public String toString(){
        return "Nom: "+nom+", Nacionalitat: "+nacionalitat;
    }
}
