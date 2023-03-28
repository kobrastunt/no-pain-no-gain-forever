/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deposito;

/**
 *
 * @author serra
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    
    String getNombre(){
        return nombre;
    }
    
    void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    String getCuenta(){
        return cuenta;
    }
    
    void setCuenta(String cuenta){
        this.cuenta=cuenta;
    }
    
    double getSaldo(){
        return saldo;
    }
    
    void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    double getTipoInterés(){
        return tipoInterés ;
    }
    
    void setTipoInterés(double tipoInterés){
        this.tipoInterés=tipoInterés;
    }
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
