package taller1;

/**
 * Esta clase representa una persona y varios de sus atributos. 
 * 
 * @author Oscar_Regino
 * 
 */

import java.util.Date;

public class Persona {

	/**
	 * Representa la variable nombre de la persona.
	 */

	public String name;
	/**
	 * Representa la variable el primer apellido de la persona.
	 */

	public String lastName1;
	/**
	 * Representa la variable el segundo de la persona.
	 */

	public String lastName2;
	/**
	 * Representa la variable fecha de nacimiento de la persona.
	 */

	public Date dateBirth;
	/**
	 * Representa la variable altura de la persona.
	 */

	public float height;
	/**
	 * Representa la variable peso de la persona.
	 */

	public float weight;

	/**
	 * Nombre de la persona.
	 * 
	 * @return el valor del campo nombre
	 */
	public String getName() {
		return name;
	}

	/**
	 * Modificar el valor nombre.
	 * 
	 * @param name valor nombre que va a modificar.
	 */
	public void setName(String name) {
		this.name = name;
	}

}
