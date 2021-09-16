
package mx.com.gm.vehiculosyventas.servicio;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.vehiculosyventas.datos.*;
import mx.com.gm.vehiculosyventas.domain.*;
import mx.com.gm.vehiculosyventas.excepciones.*;


public class ConcesionarioVehiculosImpl implements IConcesionarioVehiculos {
    private final IAccesoDatos datos;
    
    public ConcesionarioVehiculosImpl(){
         this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        
        
        boolean anexar = false;
        try {
            anexar = datos.existeVehiculo(NOMBRE_FICHERO_VEHICULO);
            datos.escribirVehiculo(vehiculo, NOMBRE_FICHERO_VEHICULO, anexar);
         
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        } catch (EscrituraDatosEx ex) {
           System.out.println("Error de escritura de datos");
           ex.printStackTrace();
           
        }
    }

    @Override
    public void agregarVenta(Ventas venta) {
        
        boolean anexar = false;
        try {
            anexar = datos.existeVenta(NOMBRE_FICHERO_VENTAS);
            datos.escribirVenta(venta, NOMBRE_FICHERO_VENTAS, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        } catch (EscrituraDatosEx ex) {
           System.out.println("Error de escritura de datos");
           ex.printStackTrace();
           
        }
    }

    @Override
    public void listarVehiculos() {
          try {
          var vehiculos = this.datos.listarVehiculos(NOMBRE_FICHERO_VEHICULO);
          for (var vehiculo: vehiculos) {
              System.out.println("Vehiculos " + vehiculo);
          }
       } catch (LecturaDatosEx ex) {
            System.out.println("Error de Lectura de datos");
            ex.printStackTrace();
        }
        
    }

    @Override
    public void listarVentas() {
          try {
          var ventas = this.datos.listarVentas(NOMBRE_FICHERO_VENTAS);
          for (var venta: ventas) {
              System.out.println("Ventas " + venta);
          }
       } catch (LecturaDatosEx ex) {
            System.out.println("Error de Lectura de datos");
            ex.printStackTrace();
        }
        
    }

    @Override
    public void eliminarVehiculo(String codigoABorrar) {
            try {
            datos.eliminarVehiculo(codigoABorrar, NOMBRE_FICHERO_VEHICULO, NOMBRE_FICHERO_AUXILIAR);
            System.out.println("El vehículo se ha eliminado con exito");
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de Lectura de datos");
            ex.printStackTrace();
        }
    }

    @Override
    public String comprobarCodigoVehiculo(String codigoAComprobar) {
        String resultado = null;
        try {
            resultado = this.datos.comprobarCodigoVehiculo(codigoAComprobar, NOMBRE_FICHERO_VEHICULO);
           // System.out.println("El codigo ha sido comprobado correctamente");
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de lectura de datos");
            ex.printStackTrace();
        }
       // System.out.println("resultado = " + resultado);
        return resultado;
    }

 }
  
