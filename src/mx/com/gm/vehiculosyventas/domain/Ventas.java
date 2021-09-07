
package mx.com.gm.vehiculosyventas.domain;


public class Ventas {
    int montoVentas;
    int codigoVehiculoVendido;
    String nombre;
    String apellido;
    String dni;
    
   public Ventas(){
   
   }
   
   public Ventas(int montoVentas, int codigoVehiculoVendido, String nombre, String apellido, String dni){
       this.montoVentas = montoVentas;
       this.codigoVehiculoVendido = codigoVehiculoVendido;
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
   }

    public Ventas(String linea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   //métodos

    public int getMontoVentas() {
        return this.montoVentas;
    }

    public void setMontoVentas(int montoVentas) {
        this.montoVentas = montoVentas;
    }

    public int getCodigoVehiculoVendido() {
        return this.codigoVehiculoVendido;
    }

    public void setCodigoVehiculoVendido(int codigoVehiculoVendido) {
        this.codigoVehiculoVendido = codigoVehiculoVendido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
   
    //toString

    @Override
    public String toString() {
        return "Ventas{" + "montoVentas=" + montoVentas + ", codigoVehiculoVendido=" + codigoVehiculoVendido + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
    
}
