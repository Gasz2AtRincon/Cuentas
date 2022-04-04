package cuentas;

/**
 * clase CCuenta que representa el estado de la cuenta corriente de un usuario.
 * @author gasz2
 * @version 1.0
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructoir por defecto, inicializa cada una de las viariables
     * 
     */
    public CCuenta()
    {
        nombre = "";
        cuenta = "";
        saldo = 0;
        tipoInteres = 0;
    }

    /**
     * Constructor con valores
     * 
     * @param nom nombre del titular de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo inicial
     * @param tipo tipo de interés asociado a la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
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
     * Recupera el saldo actual de la cuenta.
     * 
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Incrementa el saldo actual en la cantidad indicada.
     * 
     * @param cantidad cantidad a ingresar. Debe ser mayor o igual a cero.
     * @throws Exception en caso de que la cantidad indicada sea menor que cero.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Decrementa el saldo actual en la cantiodad indicada.
     * 
     * @param cantidad cantidad a retirar. Debe ser mayor que cero.
     * @throws Exception En caso de que la cantidad indicada sea menor o igual cero.
     *         También en caso de que el saldo sea menor que la cantidad indicada.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
