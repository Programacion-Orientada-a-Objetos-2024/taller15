
package paquete1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;
    
    public void establecerNotas(ArrayList<Nota> ns){
        notas = ns;
    
    }
    
    public ArrayList<Nota> obtenerNotas(){
        return notas;
    
    }
    
    public void establecerMejorNota(){
        
    }
    
    
    public void establecerPeorNota(){
        peorNota = 5.0;
    }
    
    public void establecerPromedio(){
        double suma = 0;
        for (int i = 0; i < notas.size(); i++) {
            suma = suma + notas.get(i).obtenerValor();
        }
        
        promedio = suma / notas.size();
        
        System.out.println("-------------------: : "+ promedio);
    }
    
    
    public double obtenerMejorNota(){
        return mejorNota;
    }
    
    public double obtenerPeorNota(){
        return peorNota;
    }
    
    public double obtenerPromedio(){
        return peorNota;
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    
    

}
