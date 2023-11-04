
package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static Sucursal sucursal1;
    public static Fabrica fabrica1 = new Fabrica();
    public static Instrumento instrumento1;
    public static Tipos tipos;
    public Sucursal sucursal2;
    
    public static void main(String[] args){
            while (true){
                
            System.out.println(
                    """
                    -------------------------------------------
                    |menu de opciones                         |
                    -------------------------------------------
                    |1. Agregar sucursal                      |
                    |2. Agregar instrumento en sucursal       |
                    |3. Listar los instrumentos               |
                    |4. Listar instrumentos por tipo          |
                    |5. Listar las sucursales                 |
                    |6. Buscar instrumento                    |
                    |7. Borrar instrumento                    | 
                    |8. porcentajes de intrumentos por tipo   |
                    -------------------------------------------
                    """);
                    Scanner entrada = new Scanner(System.in);
                    System.out.print("Eliga una opcion: ");
                    int opcion = entrada.nextInt();
                    switch (opcion) {   
                case 1: // revisar
                    System.out.print("Ingrese el nombre de la sucursal que desea agregar: ");
                    entrada.nextLine();
                    String nombreSucursal = entrada.nextLine();
                    sucursal1 = new Sucursal(nombreSucursal);
                    fabrica1.agregarelementos(sucursal1);
                    System.out.println("Se a agregado la sucursal");
                    break;
                case 2:
                    System.out.print("Ingrese el Id del instrumento: ");
                    entrada.nextLine();
                    String Id = entrada.nextLine();
                    System.out.print("Ingrese el precio del instrumento: ");
                    double precio = entrada.nextDouble();
                    
                    System.out.println(
                            """
                        Tipos de instrumento:
                        1. Percusion
                        2. Viento
                        3. Cuerda
                        """);
                    System.out.print("Ingrese el tipo de que es el instrumento: ");
                    int opcion2 = entrada.nextInt();
                    switch (opcion2) {
                        case 1:
                            tipos = Tipos.PERCUSION;
                             break;
                        case 2: 
                            tipos = Tipos.VIENTO;
                            break;
                        case 3:
                            tipos = Tipos.CUERDA;
                            break;
                        default:
                            System.out.println("Error");
                            break;
                    }
                    instrumento1 = new Instrumento(Id, precio, tipos);
                    sucursal1.agregarelementos(instrumento1);
                    System.out.println("Se ha registrado el instrumento");
                    break;
            case 3:
                    sucursal1.listarIntrumentos();
                    break;
            case 4:
                    sucursal1.instrumentosPorTipo(tipos);
                    ArrayList<Instrumento> buscados = fabrica1.instrumentosPorTipo(tipos);
                    for(Instrumento ins: buscados){
                        System.out.println(ins);
                    }
                    break;
                case 5: // solo se puede usar bien cuando acada sucursal se le haya añadido un instrumento
                    fabrica1.listarSucursal();
                    break;
                case 6: // revisar
                    System.out.print("Ingrese el Id del instrumento que desea buscar: ");
                    entrada.nextLine();
                    String id = entrada.nextLine();
                    System.out.println("Instrumento: "+sucursal1.getBuscarInstrumento(id));
                    break;
                case 7: // Bien 
                    System.out.print("Ingrese el Id del instrumento que desea eliminar: ");
                    entrada.nextLine();
                    String id2 = entrada.nextLine();
                    System.out.println("Se elimino el instrumento: "+(instrumento1 = fabrica1.elimianrInstrumento(id2)));
                    fabrica1.listarSucursal();
                    break;
                case  8:
                    System.out.print("Ingrese el nombre de la socursal: ");
                    String nombreSucursal1 = entrada.nextLine();
                    double[] porcentajes = fabrica1.porInstrumentoPorTipo(nombreSucursal1);
                    // revisar
                    
                        System.out.println("El porcentaje de instrumentos de percusion es de: "+ porcentajes[0]+"%");
                        System.out.println("El porcentaje de instrumentos de viento es de: "+ porcentajes[1]+"%");
                        System.out.println("El porcentaje de instrumentos de cuerda es de: "+ porcentajes[2]+"%");
                    break;
                
                default:
                    System.out.println("Error");
                    throw new AssertionError();
                    
                    
                    }
                    
                    
        }
    }
}