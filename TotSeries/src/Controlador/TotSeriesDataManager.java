package Controlador;

import Model.Actor;
import Model.Administrador;
import Model.Artista;
import Model.Dades;
import Model.Director;
import Model.Episodi;
import Model.Productor;
import Model.Serie;
import Model.Temporada;
import Model.Usuari;

/**
 * Data manager per TotSeries. Crea les estructures de dades necessàries 
 * per a manegar l'aplicació de gestió de TotSeries.
 * 
 */
public class TotSeriesDataManager {

	/* -------------------------------------------------------------------
	 * Metodes a implementar per vosaltres. En aquests metodes creareu els
	 * vostres objectes a partir de la informacio obtinguda del fitxer XML
	 * 
	 * Podeu esborrar els prints si voleu. Tambe podeu canviar el tipus de
	 * dades que retorna el metode, es a dir que sou lliures de
	 * modificar-ho al gust, excepte les crides inicials que es fan.
	 * -------------------------------------------------------------------
	 */
        Dades dades;
        Serie serie;
        Temporada temporada;
        Episodi episodi;
        Administrador admin;
        Usuari client;
        Productor productor;
        Artista artista;
        
        
        TotSeriesDataManager(Dades d){
            dades = d;
            serie = null;
            temporada = null;
            episodi = null;
            admin = null;
            client = null;
            productor = null;
            artista = null;
        }
	/**
	 * Obté les dades del fitxer XML passat per paràmetre
	 * 
	 * @param nomFitxer ruta del fitxer XML del que obtenir les dades
	 */
	public void obtenirDades(String nomFitxer) {
		TotSeriesXMLParser parser = new TotSeriesXMLParser(this);
		parser.parse(nomFitxer);
	}

	/**
	 * Crea una nova serie a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id de la serie. El podeu utilitzar o no
	 * @param title títol de la serie
         * @param desc descripcio de la serie
	 */
	
	public void crearSerie(String id, String title, String desc) {		

		if(serie != null){
                    dades.addSerie(serie);
                }
                if(temporada != null){
                    serie.afegirTemporada(temporada);
                    temporada = null;
                }
                serie = new Serie(title, desc);
	}
        
        /**
	 * Crea una nova temporada a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param numTemporada numero de la temporada
	 * @param numEpisodis numero d'episodis
         * 
	 */
	
	public void crearTemporada(String numTemporada, String numEpisodis) {		

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'una nova temporada.
		 */
                if(temporada != null){
                    serie.afegirTemporada(temporada);
                }
		temporada = new Temporada(numTemporada);

	}
        
        /**
	 * Crea una nova temporada a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param title titol de lepisodi
	 * @param duration duració de l'episodi
         * @param idioma idioma de l'episodi V.O.
         * @param description sinopsi de l'episodi
         * @param data data d'estrena de l'episodi
         * 
	 */
	
	public void crearEpisodi(String title, String duration, String idioma, String description, String data) {		

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'una nou episodi.
		 */

                episodi= new Episodi(title, duration, idioma, description, data);
                temporada.afegirEpisodi(episodi);
                
	}

	/**
	 * Crea un nou artista a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id del artista. El podeu utilitzar o no
	 * @param nom nom del artista
	 * @param tipus tipus (director\actor) del artista
	 * @param idSerie serie a la qual treballa. El podeu utilitzar o no
         * @param nacionalitat 
	 */

	public void crearArtista(String id, String nom, String tipus, String idSerie, String nacionalitat) {

		/* TODO: Aqui feu el necessari per a crear els artistes per a la serie
		 */
                if(tipus.equals("director"))
                    artista = new Director(nom, nacionalitat);
                else if(tipus.equals("actor"))
                    artista = new Actor(nom, nacionalitat);
                serie.addActors(artista);
	}
	
		
	/**
	 * Crea productora del fitxer XML
	 * 
	 * @param id id de la productora
	 * @param nom nom de la productora
	 * @param idSerie id de la serie que va fer. El podeu utilitzar o no
	 */
	public void crearProductora (String id, String nom, String idSerie) {

		/* TODO: Aqui feu el necessari per a crear les productores per a les series
		 */

		productor = new Productor(nom, id);
                serie.addProductor(productor);
	}

	/**
	 * Crea una valoracio a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id de la valoracio. El podeu utilitzar o no
	 * @param client identificador del client. El podeu utilitzar o no
	 * @param episodi identificador de la serie. El podeu utilitzar o no
	 * @param puntuacio puntuacio donada al episodi
	 * @param data data en la que es va fer la puntuacio
	 */
	
	public void crearValoracio(String id, String client, String episodi, String puntuacio, String data) {

		/* TODO: A partir d'aqui creeu la valoracio
		 */
                
                /*
                no hi han valoracions
                */
	}

	/**
	 * Crea un nou admin a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id del administrador
	 * @param nom nom del administrador
	 * @param usuari usuari del administrador
	 * @param password password del administrador
	 */
	public void crearAdmin(String id, String nom, String usuari, String password) {

		/* TODO: Creeu aqui el vostre admin
		 */

		admin = new Administrador(usuari, password, nom);
                dades.registre(admin);
	}

	/**
	 * Crea un nou client a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id del client
	 * @param nom nom del client
	 * @param dni dni del client
	 * @param adreca adreça del client
	 * @param usuari usuari al sistema del client
	 * @param password password del client
	 * @param vip true si el client es vip. false si no
	  */

	public void crearClient(String id, String nom, String dni, String adreca, String usuari, String password, String vip) {

		/* TODO: Creeu aqui el vostre client
		 */
                if(vip.equals("true"))
                    client = new Usuari(usuari, password, nom, true);
                else
                    client = new Usuari(usuari, password, nom, false);
                dades.registre(client);
		
	}
}
