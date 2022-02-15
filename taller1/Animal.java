package taller1;

/**
 * Esta clase representa un animal y vario de sus atributos.
 * 
 * @author Oscar_Regino
 *
 */

public class Animal {
	/**
	 * Representa la variable nombre del Animal.
	 */

	public String name;

	/**
	 * Representa la variable tipo del Animal.
	 */

	public String type;

	/**
	 * Representa la variable edad del Animal.
	 */

	public int age;
	
	/**
	 * Este metodo nos devuelve el valor del campo nombre. 
	 * @return el nombre del animal
	 */

	public String getName() {
		return name;
	}
	/**
	 * Modifica el nombre del animal. 
	 * @param name String del nuevo nombre. 
	 */

	public void setName(String name) {
		this.name = name;
	}

}
