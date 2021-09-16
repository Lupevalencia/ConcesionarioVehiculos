
package mx.com.gm.vehiculosyventas.servicio;

import mx.com.gm.vehiculosyventas.domain.*;


public interface IConcesionarioVehiculos {
    String NOMBRE_FICHERO_VEHICULO = "vehiculos.txt";
    String NOMBRE_FICHERO_VENTAS = "ventas.txt";
    
    String NOMBRE_FICHERO_AUXILIAR ="auxiliar.txt"; //para el método borrar
            
   
    
    void agregarVehiculo(Vehiculo vehiculo);
    void agregarVenta(Ventas venta);
   
    void listarVehiculos();
    void listarVentas();
    
    void eliminarVehiculo(String codigoABorrar); //leer y crear otro fichero
    
    String comprobarCodigoVehiculo(String codigoAComprobar);
}
