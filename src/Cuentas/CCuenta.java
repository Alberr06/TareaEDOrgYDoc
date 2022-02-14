/**
 * CCuenta
 * 
 * 
 * @since 14-02-2022
 * @author Alberto
 */
package Cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
	 * Constructor
	 */
    public CCuenta()
    {
    }
    
    /**
	 * Constructor
	 * 
	 * @param nom
	 * @param cue
	 * @param sal
	 * @param tipo
	 */

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
	 * @return the nombre
	 */
    public String getNombre() {
		return nombre;
	}

    /**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the tipoInteres
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres the tipoInteres to set
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	/**
	 * @return the saldo
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * @param cantidad
	 * @throws Exception
	 * Si se puede ingresar suma al saldo la cantidad a ingresar sino lanza una excepcion
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
	 * @param cantidad
	 * @throws Exception
	 * Si se puede retirar resta al saldo la cantidad a retirar sino lanza una excepcion
	 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
