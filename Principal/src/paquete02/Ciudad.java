/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Ciudad {
    private String nombreCiudad;
    private String nombreProvincia;
    
    
    public Ciudad(String nC, String nP){
        nombreCiudad = nC;
        nombreProvincia = nP;
    }
    
    public void establecerNombreCiudad(String c){
        nombreCiudad = c;
    }
    
    public void establecerNombreProvincia(String c){
        nombreProvincia = c;
    }
    
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
}


