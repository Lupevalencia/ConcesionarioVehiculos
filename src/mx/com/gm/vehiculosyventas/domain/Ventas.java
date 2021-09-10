
package mx.com.gm.vehiculosyventas.domain;


public class Ventas {
    float montoVentas;
    String codigoVehiculoVendido; //Este código es el mismo código que tiene vehículo
    String nombre;
    String apellido;
    String dni;
    
   public Ventas(){
   
   }
   
   public Ventas(String codigoVehiculoVendido){
       this.codigoVehiculoVendido = codigoVehiculoVendido;
   }
   
   public Ventas(float montoVentas, String codigoVehiculoVendido, String nombre, String apellido, String dni){
       this.montoVentas = montoVentas;
       this.codigoVehiculoVendido = codigoVehiculoVendido;
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
   }

   //métodos

    public float getMontoVentas() {
        return (float) this.montoVentas;
    }

    public void setMontoVentas(float montoVentas) {
        this.montoVentas = montoVentas;
    }

    public String getCodigoVehiculoVendido() {
        return this.codigoVehiculoVendido;
    }

    public void setCodigoVehiculoVendido(String codigoVehiculoVendido) {
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
