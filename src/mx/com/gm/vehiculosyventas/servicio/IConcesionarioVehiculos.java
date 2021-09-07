
package mx.com.gm.vehiculosyventas.servicio;


public interface IConcesionarioVehiculos {
    String NOMBRE_VEHICULO = "vehiculos.txt";
    String NOMBRE_VENTAS = "ventas.txt";
    
    void agregarVehiculo(int codigo, String marca, String tipo, int modelo, String patente, int kilometraje);
    //dentro de cada tipo según el tipo, habrá que añadir dierentes atributos.
    void agregarVenta(int montoVentas, int codigoVehiculoVendido, String nombre, String apellido, String dni);
    void listarVehiculos();
    void listarVentas();
    void borrarVehiculo(String borrar); //Hacer lo mismo que para buscar pero necesitamos buscarlo, después borrarlo
    //Tengo que ver lo que hay que modificar
}
