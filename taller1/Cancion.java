package taller1;

/**
 * Esta clase representa una cancion y varios de sus atributos.
 * 
 * @author Oscar_Regino
 *
 */
public class Cancion {

	/**
	 * Representa la variable nombre de la cancion.
	 */
	public String name;

	/**
	 * Representa la variable nombre del cantante de la cancion.
	 */
	public String Singer;

	/**
	 * Representa la variable precio de la cancion.
	 */
	private double price;

	/**
	 * Nos indica el precio de la cancion
	 * 
	 * @return devuelve el valor actual de la cancion
	 */

	public double getPrice() {
		return price;
	}

	/**
	 * Modifica el valor de la cancion
	 * 
	 * @param price nuevo valor de la cancion.
	 */

	public void setPrice(double price) {
		this.price = price;
	}
}
