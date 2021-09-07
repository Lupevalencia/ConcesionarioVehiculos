
package mx.com.gm.vehiculosyventas.datos;

import java.io.*;
import java.util.*;

                                                                                                  ;
import mx.com.gm.vehiculosyventas.domain.*;
import mx.com.gm.vehiculosyventas.excepciones.*;



public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existeVehiculo(String nombreVehiculo) throws AccesoDatosEx {
        var archivoVehiculo = new File(nombreVehiculo);
        return archivoVehiculo.exists();
       
    }

    @Override
    public List<Vehiculo> listarVehiculos(String nombreVehiculo) throws LecturaDatosEx {
        var archivoVehiculo = new File(nombreVehiculo);
        List<Vehiculo> vehiculos = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivoVehiculo));
             String linea = null;
             linea = entrada.readLine();
             while(linea != null){
                 var vehiculo = new Vehiculo(linea);
                 vehiculos.add(vehiculo);
                 linea = entrada.readLine();
             }
             entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar Vehiculos " + ex.getMessage());
            
        } catch (IOException ex) {
           ex.printStackTrace();
           throw new LecturaDatosEx("Excepción al listar Vehiculos " + ex.getMessage());
        }
        return vehiculos;
    }

    @Override
    public boolean existeVenta(String nombreVenta) throws AccesoDatosEx {
        var archivoVenta = new File(nombreVenta);
        return archivoVenta.exists();
    }

    @Override
    public List<Ventas> listarVentas(String nombreVenta) throws LecturaDatosEx {
        var archivoVenta = new File(nombreVenta);
        List<Ventas> ventas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivoVenta));
             String linea = null;
             linea = entrada.readLine();
             while(linea != null){
             var venta = new Ventas(linea);
                ventas.add(venta);
                linea = entrada.readLine();
             }
             entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar Ventas " + ex.getMessage());
            
        } catch (IOException ex) {
           ex.printStackTrace();
           throw new LecturaDatosEx("Excepción al listar Ventas " + ex.getMessage());
        }
        return ventas;
    }

    @Override
    public void escribirVehiculo(Vehiculo vehiculo, String nombreVehiculo, boolean anexar) throws EscrituraDatosEx {
        var archivoVehiculo = new File(nombreVehiculo);
        try {
            var salida = new PrintWriter(new FileWriter(archivoVehiculo,anexar));
            salida.println();
            salida.close();
            System.out.println("El vehiculo se ha añadido correctamente = " + vehiculo);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepción al escribir Vehiculos " + ex.getMessage());
        }
    }

    @Override
    public void escribirVenta(Ventas venta, String nombreVenta, boolean anexar) throws EscrituraDatosEx {
        var archivoVenta = new File(nombreVenta);
        try {
            var salida = new PrintWriter(new FileWriter(archivoVenta,anexar));
            salida.println();
            salida.close();
            System.out.println("La venta se ha añadido correctamente = " + venta);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepción al escribir Ventas " + ex.getMessage());
        }
    }

    @Override
    public void crearVehiculo(String nombreVehiculo) throws AccesoDatosEx {
        var archivoVehiculo = new File(nombreVehiculo);
        try {
            var salida = new PrintWriter(new FileWriter(archivoVehiculo));
            salida.close();
            System.out.println("Se ha creado el archivo Vehiculos");
            
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepción al crear Vehiculo " + ex.getMessage());
        }
    }

    @Override
    public void crearVenta(String nombreVenta) throws AccesoDatosEx {
        var archivoVenta = new File(nombreVenta);
        try {
            var salida = new PrintWriter(new FileWriter(archivoVenta));
            salida.close();
            System.out.println("Se ha creado el archivo Ventas");
            
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepción al crear Ventas " + ex.getMessage());
        }
    }

    @Override
    public void borrarVehiculo(String nombreVehiculo) throws LecturaDatosEx {
        var archivoVehiculo = new File(nombreVehiculo);
        try {
            var entrada = new BufferedReader(new FileReader(archivoVehiculo));
            String linea = null;
            linea = entrada.readLine();
            var archivoVehiculoNuevo = new File(nombreVehiculo);
            var salida = new PrintWriter(new FileWriter(archivoVehiculoNuevo));
            while(linea != null){
                if(nombreVehiculo != null && nombreVehiculo != linea){
                   
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al borrar Vehiculo " + ex.getMessage());
        } catch (IOException ex) {
             ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al borrar Vehiculo " + ex.getMessage());
        } 
}

}