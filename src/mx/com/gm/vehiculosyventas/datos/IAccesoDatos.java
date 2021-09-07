
package mx.com.gm.vehiculosyventas.datos;

import java.util.List;
import mx.com.gm.vehiculosyventas.domain.Vehiculo;
import mx.com.gm.vehiculosyventas.domain.Ventas;
import mx.com.gm.vehiculosyventas.excepciones.AccesoDatosEx;
import mx.com.gm.vehiculosyventas.excepciones.EscrituraDatosEx;
import mx.com.gm.vehiculosyventas.excepciones.LecturaDatosEx;

public interface IAccesoDatos {
    boolean existeVehiculo(String nombreVehiculo) throws AccesoDatosEx;
    
    List<Vehiculo> listarVehiculos(String nombreVehiculo) throws LecturaDatosEx;
    
    boolean existeVenta(String nombreVentas) throws AccesoDatosEx;
    
    List<Ventas> listarVentas(String nombreVenta) throws LecturaDatosEx;
    
    
    void escribirVehiculo(Vehiculo vehiculo, String nombreVehiculo, boolean anexar) throws EscrituraDatosEx;
    //DEBO ESCRIBIR EL MÉTODO DE CADA TIPO DE VEHÍCULO
    void escribirVenta(Ventas venta, String nombreVenta, boolean anexar) throws EscrituraDatosEx;
    
    //String buscarVehiculo(String nombreVehiculo, String buscarVehiculo) throws LecturaDatosEx;
    
    void crearVehiculo(String nombreVehiculo) throws AccesoDatosEx;
    void crearVenta(String nombreVenta) throws AccesoDatosEx;
    
    void borrarVehiculo(String nombreVehiculo)throws LecturaDatosEx;

    public void escribir(Vehiculo vehiculo, String NOMBRE_VEHICULO, boolean anexar);
    
}
