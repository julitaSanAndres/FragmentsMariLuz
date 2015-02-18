package com.mariluz.frangments_pueblos;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase auxiliar con el contenido del listado
 */
public class Lista_contenido {

	/** 
	 * Donde se guardan las entradas de la lista.
	 */
	public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
	
	/** 
	 * Donde se asigna el identificador a cada entrada de la lista
	 */
	public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
	
	/** 
	 * Creamos est�ticamente las entradas
	 */
	static {
		aniadirEntrada(new Lista_entrada("0",R.drawable.escuvilla, "VILLAMA�AN",
				"Villama��n es un municipio y localidad de Espa�a situado al sureste de la " +
				"provincia de Le�n, en la comunidad aut�noma de Castilla y Le�n. Se encuentra " +
				"en la vega del Esla, muy cerca de Valencia de Don Juan.Originariamente era " +
				"conocido como Villamagna, nombre que evolucion� hacia su actual versi�n, " +
				"Villama��n, aunque tambi�n se cree que su nombre pueda venir del �rabe, " +
				"Villamannan, haciendo referencia a los numerosos manantiales de la zona."));
		aniadirEntrada(new Lista_entrada("1",R.drawable.escuvalencia, "VALENCIA DE DON JUAN", 
				"Valencia de Don Juan es un municipio y localidad de la provincia de Le�n, en " +
				"la comunidad aut�noma de Castilla y Le�n, Espa�a. Est� situado en la Vega del " +
				"Esla, de la cual es su capital. Forman el municipio la propia Valencia de Don " +
				"Juan (llamada Coyanza en la Alta Edad Media), la localidad de Caba�as y otras " +
				"entidades menores como las urbanizaciones Valjunco y Miraguancha."));
		aniadirEntrada(new Lista_entrada("2",R.drawable.escusanta, "SANTA M� DEL PARAMO",
				"Santa Mar�a del P�ramo es un municipio4 y localidad de Espa�a situada en la " +
				"comarca del P�ramo, al sur de la provincia de Le�n, en el extremo noroccidental" +
				" de la comunidad aut�noma de Castilla y Le�n.Entre el Censo de 1857 y el " +
				"anterior de 1842, disminuye el t�rmino del municipio porque independiza a " +
				"Urdiales del P�ramo"));
		aniadirEntrada(new Lista_entrada("3",R.drawable.escuvalderas, "VALDERAS",
				"Valderas es un municipio y localidad de Espa�a situados al sur de la provincia " +
				"de Le�n, en la zona noroccidental de la comunidad aut�noma de Castilla y Le�n. " +
				"Ubicada junto al r�o Cea, se encuentra en la comarca natural de Tierra de " +
				"Campos."));
		aniadirEntrada(new Lista_entrada("4",R.drawable.escuvillademor, "VILLADEMOR", 
				"Villademor de la Vega es un municipio y localidad situado al sur de la " +
				"provincia de Le�n, comunidad aut�noma de Castilla y Le�n (Espa�a), con 390 " +
				"habitantes (INE 2013)."));
		aniadirEntrada(new Lista_entrada("5",R.drawable.esculaguna, "LAGUNA DE NEGRILLOS", 
				"Laguna de Negrillos, es un municipio y localidad de la comarca del P�ramo " +
				"Leon�s, en la provincia de Le�n, comunidad aut�noma de Castilla y Le�n, " +
				"Espa�a.En el municipio se encuentran las localidades de Laguna de Negrillos, " +
				"Caba�eros, Conforcos y Villamorico."));
		aniadirEntrada(new Lista_entrada("6",R.drawable.escuvaldevimbre, "VALDEVIMBRE",
				"Valdevimbre es un municipio3 y localidad de Espa�a situado en la comarca del " +
				"P�ramo, al sur de la provincia de Le�n, en el extremo noroccidental de la " +
				"comunidad aut�noma de Castilla y Le�n."));
	}

	
	/** A�ade una entrada a la lista
	 * @param entrada Elemento que a�adimos a la lista
	 */
	private static void aniadirEntrada(Lista_entrada entrada) {
		ENTRADAS_LISTA.add(entrada);
		ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
	}

	/**
	 * Representa una entrada del contenido de la lista
	 */
	public static class Lista_entrada {
		public String id;
		public int idImagen; 
		public String textoEncima; 
		public String textoDebajo; 
		  
		public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) { 
			this.id = id;
		    this.idImagen = idImagen; 
		    this.textoEncima = textoEncima; 
		    this.textoDebajo = textoDebajo; 
		}
	}
	
}
