/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deposito;
//Esto es un comentario para poder realizar un commit con este cambio como ejemplo//
/**
 *
 * @author serra
 */
public class CCuenta {
/**
 *Esta clase almacena el nombre del titular, numero de cuenta, su saldo y tipo de interés
 * También permite la realización de ingresos y retirada de saldo
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 *
 * Este es el contructor, parámetros vacios
 */
    public CCuenta()
    {
    }
/**
 *Este constructor si que posee parámetros.
 * @param nom, nombre del titular.
 * @param cue, número de cuenta.
 * @param sal, saldo inicial.
 * @param tipo, tipo de interés.
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
/**
 *Devuelve saldo de la cuenta
 * @return retorna el saldo.
 */
    public double estado()
    {
        return saldo;
    }
/**
 *Devuelve nombre del titular.
 * @return retorna el titular
 *
 */  
    String getNombre(){
        return nombre;
    }
/**
 *Establece nombre del titular.
 *@return nombre del titular.
 */   
    void setNombre(String nombre){
        this.nombre=nombre;
    }
 /**
 *Devuelve el número de cuenta.
 *@return número cuenta.
 *
 */
    String getCuenta(){
        return cuenta;
    }
 /**
 *Establece el número de cuenta.
 *@return número cuenta.
 */   
    void setCuenta(String cuenta){
        this.cuenta=cuenta;
    }
 /**
 /Devuelve el saldo actual de la cuenta.
 * @return saldo actual.
 */
    double getSaldo(){
        return saldo;
    }
/**
 *Establece saldo actual de la cuenta.
 *@return saldo actual.
 */    
    void setSaldo(double saldo){
        this.saldo=saldo;
    }
/**
 *Devuelve el tipo de interés.
 *@return tipo de interés.
 */    
    double getTipoInterés(){
        return tipoInterés ;
    }
/**
 *Establece el tipo de interés.
 *@return tipo de interés.
 */    
    void setTipoInterés(double tipoInterés){
        this.tipoInterés=tipoInterés;
    }
/**
 *Ingreso en la cuenta.
 *@param cantidad, ingreso.
 *
 */    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 *retirar saldo de la cuenta.
 *@param cantidad, retirada de saldo.
 *
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
