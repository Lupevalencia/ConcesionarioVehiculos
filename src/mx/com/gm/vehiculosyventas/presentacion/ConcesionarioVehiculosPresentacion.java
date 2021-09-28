
package mx.com.gm.vehiculosyventas.presentacion;
import java.util.Scanner;
import mx.com.gm.vehiculosyventas.domain.*;
import mx.com.gm.vehiculosyventas.servicio.ConcesionarioVehiculosImpl;
import mx.com.gm.vehiculosyventas.servicio.IConcesionarioVehiculos;



public class ConcesionarioVehiculosPresentacion {
    public static void main(String[] args) {
        //Si al crear un objeto no le hemos definido el constructor vacío, es necesario pasarle los parámetros 
        //que le hemos pasado al constructor que hemos creado
        //También hay que importar los paquetes correspondientes
        
       // Autos auto = new Autos(3);
        //System.out.println("El numero de puertas es: " + auto.getNumeroPuertas());
        //Cómo queremos que pida por teclado los datos utilizamos:   var Scanner = new Scanner(System.in);
       
        //Creamos objetos
        //Autos auto = new Autos();
        //System.out.println("auto = " + auto);
        //Camionetas camioneta = new Camionetas();
        //System.out.println("camioneta = " + camioneta);
        //Motocicletas motocicleta = new Motocicletas();
        //System.out.println("motocicleta = " + motocicleta);
        //Vehiculo vehiculo = new Vehiculo();
        //System.out.println("vehiculo = " + vehiculo);
        
        //Ventas venta = new Ventas();
        //System.out.println("venta = " + venta);
        
       var opcion = -1;
       var scanner = new Scanner(System.in);
       
       IConcesionarioVehiculos concesionario = new ConcesionarioVehiculosImpl();
        
        
       while(opcion != 0){
            System.out.println("Elige una opcion : \n"
                    
            + "1. Añadir Vehiculo\n"
            + "2. Añadir Venta\n"
            + "3. Listar Vehiculos\n"
            + "4. Listar Ventas\n"
            + "5. Borrar Vehiculo\n"
            + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1:
                    //Para el nombre no hace falta validar porque podemos poner números,letras..
                    System.out.println("Introduce el codigo del vehiculo que desea añadir: ");
                    String codigoVehiculo = scanner.nextLine();
                    
                    String marcaVehiculo = "1234";
                    while(!marcaVehiculo.matches("^[A-Za-z ]*$")){
                        System.out.println("Introduce la marca del vehiculo: ");
                        marcaVehiculo = scanner.nextLine();
                     }
                    
                     String tipoVehiculo = " ";
                     while(!tipoVehiculo.equalsIgnoreCase("Autos") && !tipoVehiculo.equalsIgnoreCase("Camionetas") && !tipoVehiculo.equalsIgnoreCase("Motocicletas") ){
                        System.out.println("Introduce el tipo de vehiculo: (Autos/Camionetas/Motocicletas) ");
                        tipoVehiculo = scanner.nextLine();
                     }
                    
                    String modeloVehiculoString = " ";
                    while(concesionario.comprobarNumeroTeclado(modeloVehiculoString)){
                        System.out.println("Introduce el modelo del vehiculo: ");
                        modeloVehiculoString = scanner.nextLine();
                    }
                    float modeloVehiculo = Float.parseFloat(modeloVehiculoString);
                    
                    //Puede introducir para este campo números y letras...
                    System.out.println("Introduce la patente del vehiculo: ");
                    String patenteVehiculo = scanner.nextLine();
                    
                    String kmsString = " ";
                    while(concesionario.comprobarNumeroTeclado(kmsString)){
                        System.out.println("Introduce los kms del vehiculo: ");
                        kmsString = scanner.nextLine();
                    }
                    float kms = Float.parseFloat(kmsString);
                    

               //     while(scanner.nextLine() != null){
                //        if(scanner.nextLine() == "Autos"){
                  //          System.out.println("Introduce el numero de puertas que tiene: " + numeroPuertas);
                    //        break;
                    //}
                   // }
                    
                    Vehiculo vehiculoAInsertar = new Vehiculo(codigoVehiculo, marcaVehiculo, tipoVehiculo , modeloVehiculo, patenteVehiculo, kms);
                    
                    concesionario.agregarVehiculo(vehiculoAInsertar);
                    
                    //var codigo = scanner.nextLine();
                    //concesionario.agregarVehiculo(codigo, marca, tipo, opcion, patente, opcion);
                    break;
                case 2:
                    //Ya tenemos un método que nos comprueba la cadena que introducimos por teclado
                    System.out.println("Introduce el codigo del vehiculo para la venta que desea añadir: ");
                    String codigoAComprobar = scanner.nextLine();
                    String resultado = null;
                    resultado = concesionario.comprobarCodigoVehiculo(codigoAComprobar);
                     
                    //Creo que aquí podíamos haber hecho un witch
                    if(resultado != null){
                        String montoString = " ";
                        while(concesionario.comprobarNumeroTeclado(montoString)){
                            System.out.println("Introduce la monto de la venta");
                            montoString = scanner.nextLine();
                        }
                        float montoVenta = Float.parseFloat(montoString);

                        String nombreVenta = "1234";
                        while(!nombreVenta.matches("^[A-Za-z ]*$")){
                            System.out.println("Introduce el nombre de la venta que desea añadir: ");
                            nombreVenta = scanner.nextLine();
                        }
                        
                        String apellidoVenta = "1234";
                        while(!apellidoVenta.matches("^[A-Za-z ]*$")){
                            System.out.println("Introduce el apellido de la venta que desea añadir: ");
                            apellidoVenta = scanner.nextLine();
                        }
                        
                        //El dni tiene tanto números y letras..
                        System.out.println("Introduce el dni de la venta que desea añadir: ");
                        String dniVenta = scanner.nextLine();
                    
                        Ventas ventaAInsertar = new Ventas(codigoAComprobar, montoVenta, nombreVenta, apellidoVenta, dniVenta);
                    
                        concesionario.agregarVenta(ventaAInsertar);
                    }else{
                        System.out.println("ERROR: el codigo no existe. Vuelve a insertar un nuevo codigo para añadir su venta ");
                    }
                    
                    break;
                case 3:
                    System.out.println("La lista de Vehiculos añadidos es la siguiente: ");
                    concesionario.listarVehiculos();
                    break;
                case 4:
                    System.out.println("La lista de Ventas añadidas es la siguiente: ");
                    concesionario.listarVentas();
                    break;
                case 5:
                    System.out.println("Introduce el codigo del vehiculo que desea borrar: ");
                    String codigoABorrar = scanner.nextLine();
                    
                    String resultadoBorrar = null;
                    resultadoBorrar = concesionario.comprobarCodigoVehiculo(codigoABorrar);
                    
                    if(resultadoBorrar != null){
                        concesionario.eliminarVehiculo(codigoABorrar);
                    }else{
                        System.out.println("ERROR: el codigo no existe. Vuelve a insertar un nuevo codigo para eliminar el vehiculo que desea ");   
                    }
                    break;
                case 0:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }

        }

    }
    
}
