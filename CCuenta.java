/** @author david*/
/** @version 3-2.0*/



public class CCuenta {

	private float cantidad;				/** @param cantidad */
    private String nombre;				/** @param nombre */ 
    private String cuenta; 				/** @param cuenta */ 
    private double saldo; 				/** @param saldo */
    private double tipoInteres;			 /** @param tipo de interés*/

    public CCuenta() 					/** metodo*/
    {
    }

    
    public CCuenta(String nom, String cue, double sal, double tipo) /** metodo*/
    {
        setNombre(nom); 					/** @param nombre */
        setCuenta(cue);					 	/** @param cuenta */
        setSaldo(sal); 						/** @param saldo */
    }

    public double estado() 
    {
        return getSaldo();					/**@return devuelve saldo*/
    }

    public void ingresar(double cantidad) throws Exception /** metodo*/
    {
        if (cantidad<0) 
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);		/**@return devuelve saldo nuevo*/
    }

    public void retirar(double cantidad) throws Exception/** metodo*/
    {
        if (cantidad <= 0)				/**metodo*/
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return the nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInteres
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
