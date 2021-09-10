
package mx.com.gm.vehiculosyventas.servicio;

import mx.com.gm.vehiculosyventas.domain.*;


public interface IConcesionarioVehiculos {
    String NOMBRE_FICHERO_VEHICULO = "vehiculos.txt";
    String NOMBRE_FICHERO_VENTAS = "ventas.txt";
    
    String NOMBRE_FICHERO_AUXILIAR ="auxiliar.txt"; //para el método borrar
            
   
    
     void agregarVehiculo(Vehiculo vehiculo);
    //dentro de cada tipo según el tipo, habrá que añadir dierentes atributos. con un objeto pasarselo.
    void agregarVenta(Ventas venta);
    //int montoVentas, int codigoVehiculoVendido, String nombre, String apellido, String dni
    void listarVehiculos();
    void listarVentas();
    //void borrarVehiculo(String borrar); //leer y crear otro fichero
}
