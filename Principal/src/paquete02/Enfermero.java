/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Enfermero {
    private String nombreEnfermero;
    private String tipo;
    private double sueldoE;
    
    
    public Enfermero(String nE, String t, double sE){
        nombreEnfermero = nE;
        tipo = t;
        sueldoE = sE;
    }
    
    public void establecerNombreEnfermero(String c){
        nombreEnfermero = c;
    }
    
    public void establecerTipo(String c){
        tipo = c;
    }
    
    public void establecerSueldoE(double c){
        sueldoE = c;
    }
    
    public String obtenerNombreEnfermero(){
        return nombreEnfermero;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public double obtenerSueldoE(){
        return sueldoE;
    }
}
