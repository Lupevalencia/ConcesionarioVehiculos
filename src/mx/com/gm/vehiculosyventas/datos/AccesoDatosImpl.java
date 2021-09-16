
package mx.com.gm.vehiculosyventas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.vehiculosyventas.domain.*;
import mx.com.gm.vehiculosyventas.excepciones.*;


//No entiendo este error
public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existeVehiculo(String nombreFicheroVehiculo) throws AccesoDatosEx {
        var archivoVehiculo = new File(nombreFicheroVehiculo);
        return archivoVehiculo.exists();
       
    }

    @Override
    public List<Vehiculo> listarVehiculos(String nombreFicheroVehiculo) throws LecturaDatosEx {
        var archivoVehiculo = new File(nombreFicheroVehiculo);
        List<Vehiculo> vehiculos = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivoVehiculo));
             String linea = null;
             linea = entrada.readLine();
             while(linea != null){
                 
                 // linea = "seat;2000;"
                 //Para separar una cadena
                 String[] lineaArray = linea.split(";");
                // System.out.println(lineaArray.length);
            
                 Vehiculo vehiculo = new Vehiculo(lineaArray[0],lineaArray[1],lineaArray[2],Float.parseFloat(lineaArray[3]),lineaArray[4],Float.parseFloat(lineaArray[5]));
                 
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
    public boolean existeVenta(String nombreFicheroVenta) throws AccesoDatosEx {
        var archivoVenta = new File(nombreFicheroVenta);
        return archivoVenta.exists();
    }

    @Override
    public List<Ventas> listarVentas(String nombreFicheroVenta) throws LecturaDatosEx {
        var archivoVenta = new File(nombreFicheroVenta);
        List<Ventas> ventas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivoVenta));
             String linea = null;
             linea = entrada.readLine();
             while(linea != null){
                 
                 String[] lineaArray = linea.split(";");
                 //System.out.println(lineaArray.length);
            
                 Ventas venta = new Ventas(lineaArray[0],Float.parseFloat(lineaArray[1]),lineaArray[2],lineaArray[3],lineaArray[4]);
                 
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
    public void escribirVehiculo(Vehiculo vehiculo ,String nombreFicheroVehiculo, boolean anexar) throws EscrituraDatosEx {
        
            File archivoVehiculo = new File(nombreFicheroVehiculo); //Tmbn se puede pasar como File("vehiculos.txt")
        try {
            var salida = new PrintWriter(new FileWriter(archivoVehiculo,anexar));
           
            // TODO: aqui tenemos que guardar toda la info (marca, modelo, .... ) del vehiculo en el fichero
            
           salida.println(vehiculo.getCodigo() + ";" + " " + vehiculo.getMarca() + ";" + " " + vehiculo.getTipo() + ";" + " " + vehiculo.getModelo() + ";" + " " + vehiculo.getPatente() + ";" + " " + vehiculo.getKilometraje()); // TODO completar el resto de atributos
            
           salida.close();
            System.out.println("El Vehiculo se ha añadido correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepción al escribir Vehiculos " + ex.getMessage());
        }

    }

    @Override
    public void escribirVenta(Ventas venta, String nombreFicheroVenta, boolean anexar) throws EscrituraDatosEx {
        var archivoVenta = new File(nombreFicheroVenta);
        try {
            var salida = new PrintWriter(new FileWriter(archivoVenta,anexar));
            
            //HACER LO MISMO CON VENTA
            salida.println(venta.getCodigoVehiculoVendido() + ";" + " " + venta.getMontoVentas()
                    
            + ";" + " " + venta.getNombre() + ";" + " " + venta.getApellido() + ";" + " " + venta.getDni());
            
            salida.close();
            System.out.println("La venta se ha añadido correctamente = " + venta);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepción al escribir Ventas " + ex.getMessage());
        }
    }

    @Override
    public void crearVehiculo(String nombreFicheroVehiculo) throws AccesoDatosEx {
        var archivoVehiculo = new File(nombreFicheroVehiculo);
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
    public void crearVenta(String nombreFicheroVenta) throws AccesoDatosEx {
        var archivoVenta = new File(nombreFicheroVenta);
        try {
            var salida = new PrintWriter(new FileWriter(archivoVenta));
            salida.close();
            System.out.println("Se ha creado el archivo Ventas");
            
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepción al crear Ventas " + ex.getMessage());
        }
    }

    public void eliminarVehiculo(String codigoABorrar, String nombreFicheroVehiculo, String nombreFicheroVehiculoNuevo) throws LecturaDatosEx {
        var archivoVehiculo = new File(nombreFicheroVehiculo);
        try {
            var entrada = new BufferedReader(new FileReader(archivoVehiculo));
            String linea = null;
            linea = entrada.readLine();
            
            var archivoVehiculoNuevo = new File(nombreFicheroVehiculoNuevo);
            var salida = new PrintWriter(new FileWriter(archivoVehiculoNuevo));
            //String[] lineaArray = linea.split(";");
            //Vehiculo vehiculoABorrar = new Vehiculo(lineaArray[0],lineaArray[1],lineaArray[2],Float.parseFloat(lineaArray[3]),lineaArray[4],Float.parseFloat(lineaArray[5]));

            while(linea != null){
                String[] lineaArray = linea.split(";");
                if(!codigoABorrar.equals(lineaArray[0])){
                   //System.out.println("He pasado por aquí");
                   salida.println(linea); //toString para el objeto entero, aquí no es necesario pues va incluido
                          
                }
                linea = entrada.readLine();
            }
            salida.close();
            System.out.println("Se ha creado el nuevo archivo correctamente");
            
            //Ahora necesitamos renombrar el archivo nuevo y borrar el anterior
            
            archivoVehiculo.delete();
            System.out.println("El antiguo archivo se ha eliminado correctamente");
            
            archivoVehiculoNuevo.renameTo(archivoVehiculo);
            System.out.println("Archivo nuevo renombrado a su nombre inicial");
                    
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al borrar Vehiculo " + ex.getMessage());
        } catch (IOException ex) {
             ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al borrar Vehiculo " + ex.getMessage());
        }
    }

    @Override
    public String comprobarCodigoVehiculo(String codigo, String nombreFicheroVehiculo) throws LecturaDatosEx  {
        var archivoVehiculo = new File(nombreFicheroVehiculo);
        String resultado  = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivoVehiculo));
            String linea = null;
            linea = entrada.readLine();
            var indice = 1;
            while (linea != null){
                String[] lineaArray = linea.split(";");
                if (codigo != null && codigo.equalsIgnoreCase(lineaArray[0])) { 
                    resultado = "Codigo" + " " + linea + " " + "encontrado en el índice\n " + " " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
           throw new LecturaDatosEx("Excepcion al comprobar el código " + ex.getMessage());
        } catch (IOException ex) {
           ex.printStackTrace(); //arrojamos la posible excepción
           throw new LecturaDatosEx("Excepcion al comprobar el código " + ex.getMessage());
        }
        return resultado;
        
    }

}
