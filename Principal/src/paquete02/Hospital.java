/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Hospital {
    private String nombreHospital;
    private String direccionHospital;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private double sueldoTotal;

    private Medico[] medicos;
    private Enfermero[] enfermeros;
    
    // Parametros
    public Hospital(String nomH, String direc, Ciudad ciu, int numE, 
            Medico[] med, Enfermero[]enf){
        nombreHospital = nomH;
        direccionHospital = direc;
        ciudad = ciu;
        numeroEspecialidades = numE;
        medicos = med;
        enfermeros = enf;
        
    }
    
    public void establecerNombreHospital(String c){
        nombreHospital = c;
    }
    
    public void establecerDireccionHospital(String c){
        direccionHospital = c;
    }
    
    public void establecerCiudad(Ciudad c){
        ciudad = c;
    }
    
    public void establecerNumeroEspecialidades(int c){
        numeroEspecialidades = c;
    }
    
    
    public void establecerSueldoTotal(){
        double suma1 = 0;
        double suma2 = 0;
        for(int i=0; i < obtenerMedicos().length; i++){
            suma1  = suma1 + obtenerMedicos()[i].obtenerSueldoM();
        }
        for(int j=0; j < obtenerEnfermeros().length; j++){
            suma1  = suma1 + obtenerEnfermeros()[j].obtenerSueldoE() ;
        }
        
        sueldoTotal = suma1 + suma2;
    }
    
    
    public void establecerMedicos(Medico[] c){ // arreglo de numero de medicos
        medicos = c;
    }
    
    public void establecerEnfermeros(Enfermero[] c){ // arreglo de numero de enfermeros.
        enfermeros = c;
    }
 
    
    public String obtenerNombreHospital(){
        return nombreHospital;
    }
    
    public String obtenerDireccionHospital(){
        return direccionHospital;
    }
    
    public Ciudad obtenerCiudad(){
        return ciudad;
    }
    
    public int obtenerNumeroEspecialidades(){
        return numeroEspecialidades;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    
    public Medico[] obtenerMedicos(){
        return medicos;
    }
    
    public Enfermero[] obtenerEnfermeros(){
        return enfermeros;
    }
    
    
    @Override
    public String toString() {
        String cadena = "Cadena Hospitalaria.\n";
        cadena = String.format("HOSPITAL %S\n Direccion: %s\n "
                + "Ciudad: %s\n Provincia: %s\n Numero de especialidades: %d\n ",
                obtenerNombreHospital(), 
                obtenerDireccionHospital(),
                obtenerCiudad().obtenerNombreCiudad(), 
                obtenerCiudad().obtenerNombreProvincia(), 
                obtenerNumeroEspecialidades());
        
        cadena = String.format("%s\n Listado de médicos:\n", cadena);
        
        for (int i = 0; i < obtenerMedicos().length; i++) {
            cadena = String.format("%s %s - %.2f - %s\n", 
                    cadena,
                    obtenerMedicos()[i].obtenerNombreMedico(),
                    obtenerMedicos()[i].obtenerSueldoM(),
                    obtenerMedicos()[i].obtenerEspecialidad());
        }

        cadena = String.format("%s\n Listado de enfermeros(as)\n", cadena);
        
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("%s %s - %.2f - %s\n", 
                    cadena,
                    obtenerEnfermeros()[i].obtenerNombreEnfermero(),
                    obtenerEnfermeros()[i].obtenerSueldoE(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        
        cadena = String.format("%s\nTotal del sueldo a pagar por mes: %.2f",
                cadena, obtenerSueldoTotal());
        return cadena;
    }
}


