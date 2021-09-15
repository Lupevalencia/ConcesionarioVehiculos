
package mx.com.gm.vehiculosyventas.domain;


public class Ventas {
    
    String codigoVehiculoVendido; //Este código es el mismo código que tiene vehículo
    float montoVentas;
    String nombre;
    String apellido;
    String dni;
    
   public Ventas(){
   
   }
   
   public Ventas(String codigoVehiculoVendido){
       this.codigoVehiculoVendido = codigoVehiculoVendido;
   }
   
   public Ventas(String codigoVehiculoVendido, float montoVentas, String nombre, String apellido, String dni){
       this.codigoVehiculoVendido = codigoVehiculoVendido;
       this.montoVentas = montoVentas;
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
   }

   //métodos

    public String getCodigoVehiculoVendido() {
        return this.codigoVehiculoVendido;
    }

    public void setCodigoVehiculoVendido(String codigoVehiculoVendido) {
        this.codigoVehiculoVendido = codigoVehiculoVendido;
    }

    public float getMontoVentas() {
        return this.montoVentas;
    }

    public void setMontoVentas(float montoVentas) {
        this.montoVentas = montoVentas;
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
        return "Ventas{" + "codigoVehiculoVendido=" + codigoVehiculoVendido + ", montoVentas=" + montoVentas + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }

    
    
}
