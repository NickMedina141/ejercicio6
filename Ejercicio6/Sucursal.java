
package Ejercicio6;

import static ejercicioPOO.principal.entrada;
import java.util.ArrayList;


public class Sucursal {
    public static Tipos tipo;
    private String nombreSucursal;
    private ArrayList<Instrumento> instrumentos;

    public Sucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
        this.instrumentos  = new ArrayList<Instrumento>();
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombre) {
        this.nombreSucursal = nombre;
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public void listarIntrumentos(){
        for(Instrumento instrumento1: instrumentos){
            System.out.println(instrumento1);
           
        }
    }
    public void agregarelementos(Instrumento instrumento1){
        this.instrumentos.add(instrumento1);
    }
    
    public ArrayList instrumentosPorTipo(Tipos tipos){
        ArrayList<Instrumento> encontrados = new ArrayList<Instrumento>();
        for(Instrumento ins1: instrumentos){
            if(ins1.getTipo() == tipos){
                
                encontrados.add(ins1);
            }
        }
        return encontrados;
    }
    
    
    public Instrumento eliminarInstrumento(String Id){
        Instrumento borrarInstrumento = buscarInstrumento(Id);
        this.instrumentos.remove(borrarInstrumento);
        return borrarInstrumento;
    }
    
    private Instrumento buscarInstrumento(String Id){
        int i=0;
        
        Instrumento encontrado = null;
        while(i < instrumentos.size() && !this.instrumentos.get(i).getId().equals(Id)){
            i++;
        }
        if(i < instrumentos.size()){
            encontrado = this.instrumentos.get(i);
        }
        return encontrado;
    }
    
    public Instrumento getBuscarInstrumento(String id){
        return buscarInstrumento(id);
    }
            
    public double[] porInstrumentoPorTipo(){
        int valor =Tipos.values().length;
        double[] porcentajes = new double[valor];
        for(Instrumento ins: instrumentos){
            porcentajes[ins.getTipo().ordinal()]++;
        }
        conversion(porcentajes);
        return porcentajes;
    }

    private void conversion(double[] porcentajes){
        for(int i=0; i< porcentajes.length; i++){
            porcentajes[i] = (porcentajes[i] * 100) / instrumentos.size();
        }
    }
    
    
    @Override
    public String toString() {
        return "Informacion de Sucursal: " + "\nnombre:" + nombreSucursal + "\nInstrumentos: " + instrumentos;
    }

    
}
