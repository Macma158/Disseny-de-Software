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
public class Usuari {
    private boolean vip;
    private String userName;
    private String password;
    private String nom;
    private String nacionalitat;
    private String dataNaixement;
    private float saldo;
    private ArrayList<String> valoracions;
    
    /*
    Constructor usuaris normals
    */
    public Usuari(String user, String pass, String name, String nacio, String dataN){
        userName = user;
        password = pass;
        nom = name;
        nacionalitat = nacio;
        dataNaixement = dataN;
        vip = false;
        saldo = 0;
        valoracions = new ArrayList<String>();
    }
    
    public Usuari(String user, String pass, String name, boolean vi){
        userName = user;
        password = pass;
        nom = name;
        nacionalitat = "NONE";
        dataNaixement = "NONE";
        vip = vi;
        saldo = 0;
        valoracions = new ArrayList<String>();
    }
    
    /*
    Constructor admins
    */
    public Usuari(String user, String pass, String name){
        userName = user;
        password = pass;
        nom = name;
    }
    
    /*
    Afegir nova valoracio usuari
    */
    public void valoracio(String valoracio){
        valoracions.add(valoracio);
    }
    
    /*
    Canviar condicio vip
    */
    public void vip(){
        vip = !vip;
    }
    
    /*
    Afegeix carrec al total a pagar
    */
    public void cargo(float cargo){
        saldo =+ cargo;
    }
    
    /*
    Realitza el pagament
    */
    public void pagament(){
        //nu se que tiene que haber aqui o como tendran que pagar :(
    }
    
    public String getNom(){
        return nom;
    }
    
    /*
    Retorna el nom d'usuari
    */
    public String getUser(){
        return userName;
    }
    
    /*
    Retorna la contrasenya
    */
    public String getPassword(){
        return password;
    }
    
    /*
    Mostra les valoracions de l'usuari
    */
    public String valoracionsUsuari(){
        String val = "";
        for(String element: valoracions){
            val+=element+"\n";
        }
        return val;
    }
    
    /*
    Mostra informacio de l'usuari
    */
    @Override
    public String toString(){
        return "Nom: "+nom+", Nacionalitat: "+nacionalitat+", Data Naixement: "+dataNaixement+
                "\n valoracions: "+valoracionsUsuari();
    }
}
