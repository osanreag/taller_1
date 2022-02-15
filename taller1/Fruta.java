package taller1;

import java.util.ArrayList;

/**
 * Esta clase representa una fruta y varios de sus atributos.
 * 
 * @author Oscar_Regino
 *
 */

public class Fruta {

	/**
	 * Representa la variable nombre de la fruta.
	 */

	public String name;

	/**
	 * Representa la variable peso promedio de la fruta.
	 */
	private float averageWeight;
	/**
	 * Representa la una lista de colores de la fruta.
	 */

	public ArrayList colors;

	/**
	 * Colores de las frutas
	 * 
	 * @return devuelve una lista de colores.
	 */

	public ArrayList getColors() {
		return colors;
	}

	/**
	 * modificar colores
	 * 
	 * @param colors color que modifica la lista de colores
	 */

	public void setColor(ArrayList colors) {
		this.colors = colors;
	}

}
