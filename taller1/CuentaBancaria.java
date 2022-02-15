package taller1;

/**
 * Esta clase representa una cuenta bancaria y varios de sus atributos.
 * 
 * @author Oscar_Regino
 *
 */

public class CuentaBancaria {
	/**
	 * Representa la variable numero de cuenta de la cuenta Bancaria.
	 */

	private int accountNumber;

	/**
	 * Representa la variable esta activada la cuenta Bancaria.
	 */

	protected boolean activated;
	
	/**
	 * Representa la variable nombre de la persona de la cuenta Bancaria.
	 */	

	private String personName;
	
	/**
	 * Este metodo nos indica si la cuenta se encuentra activa. 
	 * @return true o false dependiendo si esta activa. 
	 */

	public boolean getActivated() {
		return activated;
	}
	
	/**
	 * Modifica la activacion de la cuenta en true o false. 
	 * @param activated recibe el parametro true o false. 
	 */

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
}
