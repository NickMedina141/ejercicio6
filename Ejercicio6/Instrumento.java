
package Ejercicio6;


public class Instrumento {
    private String Id;
    private double precio;
    private Tipos tipo;
    
    public Instrumento(String Id, double precio, Tipos tipo) {
        this.Id = Id;
        this.precio = precio;
        this.tipo = tipo;
        
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\nInformacion de instrumento:" + "\nId: " + Id + "\nprecio: " + precio + "\ntipo: " + tipo;
    }
    
    
}
