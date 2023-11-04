
package Ejercicio6;

import arrays.borrador2;
import java.util.ArrayList;


public class Fabrica {
    private ArrayList<Sucursal> sucursales;
    
    
    public Fabrica(){
        this.sucursales = new ArrayList<Sucursal>();
    }
    
    public void agregarelementos(Sucursal sucursal){
        sucursales.add(sucursal);
    }
    
    public void listarSucursal(){
        for(Sucursal sucursales1: sucursales){
            System.out.println(sucursales1.getNombreSucursal());
            sucursales1.listarIntrumentos();
        }
    }
    
    public double[] porInstrumentoPorTipo(String nombreSucursal){
        double[] porcentajes = new double[Tipos.values().length];
        // buscar una sucursal
        Sucursal sucursalEncontrada = buscarSucursal(nombreSucursal);
        if(sucursalEncontrada != null){
           porcentajes = sucursalEncontrada.porInstrumentoPorTipo();
        }
        return porcentajes;
    }
    
    private Sucursal buscarSucursal(String nombreSucursal){
        int i=0;
        Sucursal encontrado = null;
        while(i < sucursales.size() && !this.sucursales.get(i).getNombreSucursal().equals(nombreSucursal)){
            i++; // si no existe returno una sucursal null
        }
        if(i < sucursales.size()){
            encontrado = this.sucursales.get(i); // lo encuentro 
        }
        return encontrado;
    }
    
        public ArrayList instrumentosPorTipo(Tipos tipos){
        ArrayList<Instrumento> encontrados = new ArrayList<Instrumento>();
        for(Sucursal suc: sucursales){
            encontrados.addAll(suc.instrumentosPorTipo(tipos));
           
        }
        return encontrados;
    }
        
    public Instrumento elimianrInstrumento(String Id){
        Instrumento borrar = null;
        int i=0 ;
        while(i < sucursales.size() && borrar == null){
            borrar = sucursales.get(i).eliminarInstrumento(Id);
            i++;
        }
        return borrar;
      } 
    
    
}
