/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Daniel
 */
import Controlador.TotSeries;
import Model.Episodi;
import Model.Usuari;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    TotSeries totSeries;
    Menu(){
        totSeries = new TotSeries();
        frontPage();
    }
    static private enum noRegistratFPOpcions {
        REGISTRAR_USUARIO,LOGIN,CATALEG,SORTIR
    };
    static private enum registratFPOpcions {
        LOGOUT,
        CATALEG,
        SORTIR,
    };
    static private enum adminFPOpcions {
        LOGOUT,
        CATALEG,
        BUSCAR_USUARI,
        SORTIR,
    };
    static private enum cOpcions {
        MOSTRAR_CATALEG,
        SERIE,
        MES_VALORATS,
        SORTIR,
    };
    static private enum sOpcions {
        MOSTRAR_SERIE,
        TEMPORADA,
        SORTIR
    };
    static private enum tOpcions {
        System.out.println("\n(1) Mostrar temporada");
        System.out.println("(2) Veure veure Episodi");
        System.out.println("(3) Sortir");
        System.out.println("-----------------------");
        return sc.nextInt();
    };
    static private enum noRegistratEOpcions {
        MOSTRAR_EPISODI,
        SORTIR
    };
    static private enum registratEOpcions {
        MOSTRAR_EPISODI,
        REPRODUIR,
        SORTIR
        me cago en tu estampa
    };
    static private enum uOpcions {
        BSCAR_USUARI,
        SORTIR
    };

    public void frontPage() {
        Episodi episodi = totSeries.getSerie(0).getTemporada(0).getEpisodi(0);
        Usuari user;
        int opcio;
        Scanner sc;
        sc = new Scanner(System.in);
        if(totSeries.getAdmin()){
            opcio = adminFPOpcions(sc);
        }
        else if (totSeries.getLogat()){
            opcio = registratFPOpcions(sc);
        }
        else{
            opcio = noRegistratFPOpcions(sc);
        }
        while (opcio!=5) {
            // tractar element
            switch (opcio) {
                case 1: // registre
                    System.out.println(" User name: ");
                    String userN= sc.nextLine();
                    System.out.println(" Password: ");
                    String pass=sc.nextLine();
                    System.out.println(" Nom: ");
                    String name=sc.nextLine();
                    System.out.println(" Nacionalitat: ");
                    String nacio= sc.nextLine();
                    System.out.println(" Data de naixement: ");
                    String dataN=sc.nextLine();
                    user = new Usuari(userN, pass, name, nacio, dataN);
                    if(!totSeries.registre(user))
                        System.out.println(" Error: Usuari ja existent ");
                    else
                        System.out.println(" Usuari registrat ");
                    break;
                case 2: // veure cataleg
                    System.out.print(totSeries.mostrarCataleg());
                    break;

                case 3: // veure episodi
                    totSeries.reproduir(episodi);
                    System.out.println("Vols valorar l'episodi? (y/n) ");
                    String lol= sc.nextLine();
                    if(lol.equals("y")){
                        int vot = sc.nextInt();
                        episodi.valorar(vot);
                    }
                    break;
                case 4: // veure mes valorats
                    System.out.print(totSeries.mostrarMesValorats());
                default:
                    System.out.println("opcio erronia");
                    break;
            }

            // obtencio seguent element
            opcio = menuOpcions(sc);
        }
        System.out.println("Programa acabat correctament!");
    } 
    public void menuCataleg(){
        
    }
    public void menuSerie(){
        
    }
    public void menuTemporada(){
        
    }
    public void menuEpisodi(){
        
    }
    public void menuUsuaris(){
        
    }
    
}