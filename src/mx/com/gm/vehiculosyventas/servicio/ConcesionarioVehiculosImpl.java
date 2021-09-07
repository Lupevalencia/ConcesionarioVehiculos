
package mx.com.gm.vehiculosyventas.servicio;

import mx.com.gm.vehiculosyventas.datos.AccesoDatosImpl;
import mx.com.gm.vehiculosyventas.datos.IAccesoDatos;
import mx.com.gm.vehiculosyventas.domain.Vehiculo;
import mx.com.gm.vehiculosyventas.excepciones.AccesoDatosEx;


public class ConcesionarioVehiculosImpl implements IConcesionarioVehiculos {
    private final IAccesoDatos datos;
    
    public ConcesionarioVehiculosImpl(){
         this.datos = new AccesoDatosImpl();
    }
    

    @Override
    public void agregarVehiculo(int codigo, String marca, String tipo, int modelo, String patente, int kilometraje) {
        Vehiculo vehiculo = new Vehiculo(nombreVehiculo);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_VEHICULO);
            datos.escribir(vehiculo, NOMBRE_VEHICULO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void agregarVenta(int montoVentas, int codigoVehiculoVendido, String nombre, String apellido, String dni) {
        
    }

    @Override
    public void listarVehiculos() {
        
    }

    @Override
    public void listarVentas() {
        
    }

    @Override
    public void borrarVehiculo(String borrar) {
       
    }
    
}
