package taller1;

/**
 * Esta clase representa una paquete y varios de sus atributos.
 * 
 * @author Oscar_Regino
 *
 */

public class Paquete {
	/**
	 * Representa la variable direccion del paquete.
	 */
	protected String address;

	/**
	 * Representa la variable enviado del paquete.
	 */

	private boolean sent;
	/**
	 * Representa la variable peso del paquete.
	 */

	private double weight;
	
	/**
	 * Este metodo nos indica si el pauqete fue enviado o no
	 * @return verdadero o falso si fue enviado o no
	 */

	public boolean getSent() {
		return sent;
	}
	
	/**
	 * Modifica el campo enviado 
	 * @param sent true or false if the packed is send. 
	 */

	public void setSent(boolean sent) {
		this.sent = sent;
	}
	
	/**
	 * Este metodo nos da el peso del paquete. 
	 * @return peso del paquete
	 */

	public double getWeight() {
		return weight;
	}
	
	/**
	 * Modifica el valor del peso del paquete. 
	 * @param weight peso del paquete. 
	 */

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
