/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Esta clase simula el comportamiento de un cajero, en el cual puedes retirar o ingresar dinero,
 * además de comprobar el sueldo actual  
 * @version 2.0
 * @author Carolina
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
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
     *
     * @param nom asiganr un nombre 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     *
     * @return el nombre 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     *
     * @return el estado de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * El método ingresar lo que hace es controlar que no introduzcas un número negativo, 
     * al final del  método hace una suma del saldo que tenias mas la cantidad que acabas de ingresar, 
     * con lo cual podras verificar el saldo que tienes despues de cada operación. 
     * @param cantidad pueden ser numeros decimales 
     * @throws Exception lanza una excepcion si la cantidad a ingresar es negativa 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * El método retirar no te permite retirar números negativos o retitrar más 
     * dinero del que optas.También hace la resta entre el saldo que tiene sy el que has retirado para obtener el saldo actual.  
     * @param cantidad pueden ser números decimales 
     * @throws Exception lanza una excepcion en forma de mensaje si el número introducido en negativo 
     * o si la cantidad a retirar es mayor al sueldo que tienes.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     *
     * @return la cuenta etablecida 
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     *
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta la cuenta establecida
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo el salddo establecido 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}