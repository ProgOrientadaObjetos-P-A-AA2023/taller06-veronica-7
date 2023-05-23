/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Medico {
    private String nombreMedico;
    private String especialidad;
    private double sueldoM;
    
    
    public Medico(String nM, String e, double sM){
        nombreMedico = nM;
        especialidad = e;
        sueldoM = sM;
    }
    
    public void establecerNombreMedico(String c){
        nombreMedico = c;
    }
    
    public void establecerEspecialidad(String c){
        especialidad = c;
    }
    
    public void establecerSueldoM(double c){
        sueldoM = c;
    }
    
    public String obtenerNombreMedico(){
        return nombreMedico;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldoM(){
        return sueldoM;
    }
}
