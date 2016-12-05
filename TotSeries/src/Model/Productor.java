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
public class Productor {
    private String nom;
    private String identificacio;
    private int anyCreacio;
    public Productor(String name, String id){
        nom = name;
        identificacio = id;
    }
    
    @Override
    public String toString(){
        return "Nom: "+nom+", id: "+identificacio;
    }
}
