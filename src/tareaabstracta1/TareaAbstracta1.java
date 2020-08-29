/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaabstracta1;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
abstract class Sensor{
    private String nombreSensor;
    private String codigo;
    private int voltaje;
    private int presion;
    private double intensidad;
    
    public Sensor(String nombre, String codigo, int voltaje, int presion, double intensidad){
        System.out.println("\n***** Integrando los datos, de los sensores MAP y MAF *****");
        this.nombreSensor = nombre;
        this.codigo= codigo;
        this.voltaje = voltaje;
        this.presion=presion;
        this.intensidad=intensidad;
    }
    
    
    public void DatosDelSensor(){
        System.out.println(" "+this.nombreSensor+" "+this.codigo+" "
        +this.voltaje+" "+this.presion+" "+this.intensidad);
    }
    
    public String toString(){
        return nombreSensor+" "+codigo+" "+voltaje+" "+presion+" "+intensidad;
    }
    
    public String getNombreSensor(){
        return nombreSensor;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String nueva){
        codigo = nueva;
    }
    
    public int getVoltaje(){
        return voltaje;
    }
    
    public int getPresion(){
        return presion;
    }
    
    public double getIntensidad(){
        return intensidad;
    }
    
}  

class Resistencia extends Sensor{
    private double resistencia;
    
    public Resistencia(String nombre, String codigo, int voltaje, int presion, double intensidad, double resistencia){
        super(nombre, codigo, voltaje, presion, intensidad);
        setResistencia(resistencia);
    }
    
    public void MAP(){
        System.out.println("\nIntegrado los datos del sensor MAP con código: "+getCodigo());
        System.out.println("Dentro del Método MAP de la clase Resistencia");
        System.out.println("Fórmula de la Resistencia: voltaje= "+getVoltaje()+" / intensidad= "+getIntensidad());
        System.out.println("Enviando Resistencia al sensor "+getNombreSensor()+"con: "+getResistencia()+" ohmios");
        
    }
    
    public double getResistencia(){
        return resistencia;
    }
    
    public void setResistencia(double nuevo){
        if(nuevo>=0.0)
            resistencia=nuevo;
    }
    
}


class Potencia extends Sensor{
    private double potencia;
    
    public Potencia(String nombre, String codigo, int voltaje, int presion, double intensidad, double potencia){
        super(nombre, codigo, voltaje, presion, intensidad);
        setPotencia(potencia);
    }
    
    public void MAF(){
        System.out.println("\nIntegrado los datos del sensor MAF con código: "+getCodigo());
        System.out.println("Dentro del Método MAF de la clase Potencia");
        System.out.println("Fórmula de la potencia: voltaje= "+getVoltaje()+" * intensidad= "+getIntensidad());
        System.out.println("Enviando Potencia al sensor "+getNombreSensor()+" con: "+getPotencia()+" watts");
        
    }
    public double getPotencia(){
        return potencia;
    }
    
    public void setPotencia(double nuevo){
        if(nuevo>=0.0)
            potencia=nuevo;
    }
    
}
public class TareaAbstracta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE ");
        System.out.println("\t\tSEDE LATACUNGA");
        System.out.println("Integrantes: William Taco y Dario Chisaguano");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Asignatura: Programación [7450]");
        System.out.println("----------------------------------------------------------");
        
        Resistencia ObjetoSensor = new Resistencia(" MAP "," ABC2545 ",12,125,0.2,60.0);
        Potencia ObjetoSensor2 = new Potencia("MAF","DFG2646",11,110,0.9,9.9);
        
        System.out.println("**Llamada a MAP usando la referencia"
                + " de la clase Sensor**");
        ObjetoSensor.MAP();
        System.out.println("----------------------------------------------------------");
        System.out.println("**Llamada a MAF usando la referencia"
                + " de la clase Sensor**");
        ObjetoSensor2.MAF();
    }
    
}
