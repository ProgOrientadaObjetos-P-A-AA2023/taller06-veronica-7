/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paquete02.*;
/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Medico.
        int cantidadMedicos;
        String nombreMedico;
        String especialidad;
        double sueldoMedico;
        Medico[] medico1;
        
        // Enfermero.
        int cantidadEnfermeros;
        String nombreEnfermero;
        String contrato;
        double sueldoEnfermeros;
        Enfermero[] enfermero1;
        
        
        System.out.println("Ingrese el nombre del Holpital:");
        String nombreH = entrada.nextLine();
        
        System.out.println("Ingrese la dirección:");
        String direc = entrada.nextLine();
        
        System.out.println("Ingrese la Ciudad en al que se encuentra:");
        String ciud = entrada.nextLine();
        
        System.out.println("Ingrese la provinvia de la ciudad:");
        String prov = entrada.nextLine();
        
        System.out.println("Ingrese el número de especialidades:");
        int numEsp = entrada.nextInt();
        
        Ciudad ciudad1 = new Ciudad(ciud, prov);
        
        // Arreglo de enfermeros y medicos.
        System.out.println("Ingrese la cantidad de Medicos del Hospital:");
        cantidadMedicos = entrada.nextInt();
        
        medico1 = new Medico[cantidadMedicos];
        
        entrada.nextLine();
        
        for(int i=0; i < cantidadMedicos; i++){
            System.out.println("Ingrese el nombre del Medico["+(i+1)+"]:");
            nombreMedico = entrada.next();
            System.out.println("Ingrese la especialidad:");
            especialidad = entrada.next();
            System.out.println("Ingrese el sueldo mensual:");
            sueldoMedico = entrada.nextDouble();
            
            // Se guardan los datos ingresados por teclado en el 
            // arreglo de medicos.
            medico1[i] = new Medico(nombreMedico, especialidad, sueldoMedico);
        }
        
        System.out.println("Ingrese la cantidad de Enfermer@s del Hospital");
        cantidadEnfermeros = entrada.nextInt();
        
        enfermero1 = new Enfermero[cantidadEnfermeros];
        
        entrada.nextLine();
        
        for(int i=0; i < cantidadEnfermeros; i++){
            System.out.println("Ingrese el nombre del Enfermer@["+(i+1)+"]:");
            nombreEnfermero = entrada.next();
            System.out.println("Ingrese el tipo de contrato del enfermero:");
            contrato = entrada.next();
            System.out.println("Ingrese el sueldo mensual:");
            sueldoEnfermeros = entrada.nextDouble();
            
            // Se guardan los datos ingresados por teclado en el 
            // arreglo de enfermeros.
            enfermero1[i] = new Enfermero(nombreEnfermero, contrato,
                    sueldoEnfermeros);
        }
        
        Hospital h1 = new Hospital(nombreH, direc, ciudad1, numEsp, 
                medico1, enfermero1);
        // Se llama al método que realizan el cálculo del sueldo total.
        h1.establecerSueldoTotal();
        System.out.printf("\n%s\n", h1);

    }
    
}