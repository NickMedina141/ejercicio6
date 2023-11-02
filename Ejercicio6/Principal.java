
package Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static Sucursal sucursal1;
    public static Fabrica fabrica1;
    public static Instrumento instrumento1;
    public static Tipos tipos;
    public static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int opcion;
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
                    System.out.print("Eliga una opcion: ");
                    opcion = entrada.nextInt();
                    switch (opcion) {   
                case 1:
                    System.out.print("Ingrese el nombre de la sucursal que desea agregar: ");
                    entrada.nextLine();
                    String nombreSucursal = entrada.nextLine();
                    sucursal1 = new Sucursal(nombreSucursal);
                    fabrica1.agregarelementos(sucursal1);
                    System.out.println("Se a agregado la sucursal");
                    break;
                case 2:
                    System.out.print("Ingrese el Id del instrumento: ");
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
                    System.out.println("Ingrese el tipo de que es el instrumento: ");
//                    int opcion2 = entrada.nextInt();
//                    // revisar!!!
//                    switch (opcion2) {
//                        case 1:
//                            tipos = Tipos.PERCUSION;
//                            return tipos;
//                        case 2: 
//                            tipos = Tipos.VIENTO;
//                            return valor;
//                        case 3:
//                            valor = Tipos.CUERDA;
//                            return valor;
//                        default:
//                            System.out.println("Error");
//                            break;
//                    }
                    instrumento1 = new Instrumento(Id, precio, tipos.CUERDA);
                    sucursal1.agregarelementos(instrumento1);
                    System.out.println("Se ha registrado el instrumento");
                    break;
                    
                case 3:    
                    sucursal1.listarIntrumentos(); break;
                case 4:
                    sucursal1.instrumentosPorTipo(Tipos.CUERDA);
                    ArrayList<Instrumento> buscados = fabrica1.instrumentosPorTipo(Tipos.CUERDA);
                    for(Instrumento ins: buscados){
                        System.out.println(ins);
                    }
                    break;
                case 5:
                    fabrica1.listarSucursal();
                    break;
                case 6:
                    System.out.print("Ingrese el Id del instrumento que desea buscar: ");
                    String id = entrada.nextLine();
                    System.out.println("Lista de sucursales: "+sucursal1.getBuscarInstrumento(id));
                    
                    break;
                case 7:
                    System.out.print("Ingrese el Id del instrumento que desea eliminar: ");
                    String id2 = entrada.nextLine();
                    System.out.println("Se elimino el instrumento: "+(fabrica1.elimianrInstrumento(id2)));
                case  8: 
                    sucursal1.porInstrumentoPorTipo();
                   
                default:
                    throw new AssertionError();
                    
                    
            }
           
                    
        }
        
        



//        Sucursal s1 = new Sucursal("sucursal A");
//        Sucursal s2 = new Sucursal("sucursal B");
//        Sucursal s3 = new Sucursal("sucursal C");
//        
//        fabri1.agregarelementos(s1);
//        fabri1.agregarelementos(s2);
//        fabri1.agregarelementos(s3);
//        
//        //fabri1.listarSucursal();
//        
//        Instrumento ins1 = new Instrumento("COD123", 450000, Tipos.VIENTO);
//        Instrumento ins2 = new Instrumento("COD124", 460000, Tipos.PERCUSION);
//        Instrumento ins3 = new Instrumento("COD125", 470000, Tipos.CUERDA);
//        Instrumento ins4 = new Instrumento("COD126", 480000, Tipos.VIENTO);
//        Instrumento ins5 = new Instrumento("COD127", 490000, Tipos.VIENTO);
//        Instrumento ins6 = new Instrumento("COD128", 500000, Tipos.VIENTO);
//        
//        s1.agregarelementos(ins1);
//        s1.agregarelementos(ins2);
//        s2.agregarelementos(ins3);
//        s2.agregarelementos(ins4);
//        s3.agregarelementos(ins5);
//        s3.agregarelementos(ins6);
//        
////        System.out.println("\nSucursal 1 ");
////        s1.listarIntrumentos();
////        System.out.println("\nSucursal 2");
////        s2.listarIntrumentos();
////        System.out.println("\nSucursal 3");
////        s3.listarIntrumentos();
////        Tipos tipo1 = Tipos.VIENTO;
////        System.out.println("\ntipos:");
//        
//        
////        s1.instrumentosPorTipo(tipo1);
////        ArrayList<Instrumento> buscados = fabri1.instrumentosPorTipo(tipo1);
////        //s1.elimianrInstrumento("COD123");
////        for(Instrumento ins: buscados){
////            System.out.println(ins);
////            
////        }
////        System.out.println("\nBorrar\n");
////        Instrumento fueborrado = fabri1.elimianrInstrumento("COD126");
////        System.out.println("fue borrado: "+fueborrado);
////        for(Instrumento ins: buscados){
////            System.out.println(ins);
////            
////        }
//        
//        double[] porcentajes = fabri1.porInstrumentoPorTipo("sucursal A");
//        System.out.println("El porcentaje de instrumentos de Percursion es de -> " + porcentajes[0] +"%");
//        System.out.println("El porcentaje de instrumentos de Viento es de -> " + porcentajes[1]+"%");
//        System.out.println("El porcentaje de instrumentos de Cuerda es de -> " + porcentajes[2]+"%");

    }
}
