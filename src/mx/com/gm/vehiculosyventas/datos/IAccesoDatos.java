
package mx.com.gm.vehiculosyventas.datos;

import java.util.List;
import mx.com.gm.vehiculosyventas.domain.*;

import mx.com.gm.vehiculosyventas.excepciones.*;


public interface IAccesoDatos {
    boolean existeVehiculo(String nombreFicheroVehiculo) throws AccesoDatosEx;
    
    List<Vehiculo> listarVehiculos(String nombreFicheroVehiculo) throws LecturaDatosEx;
    
    boolean existeVenta(String nombreFicheroVenta) throws AccesoDatosEx;
    
    List<Ventas> listarVentas(String nombreFicheroVenta) throws LecturaDatosEx;
    
    
    void escribirVehiculo(Vehiculo vehiculo ,String nombreFicheroVehiculo, boolean anexar) throws EscrituraDatosEx;
    //Creo que no necesito la clase padre Vehiculo
    
    void escribirVenta(Ventas venta, String nombreFicheroVentas, boolean anexar) throws EscrituraDatosEx;
    
    void crearVehiculo(String nombreFicheroVehiculo) throws AccesoDatosEx;
    void crearVenta(String nombreFicheroVenta) throws AccesoDatosEx;
    
    void eliminarVehiculo(String codigoABorrar, String nombreFicheroVehiculo, String nombreFicheroVehiculoNuevo)throws LecturaDatosEx;
    
}
