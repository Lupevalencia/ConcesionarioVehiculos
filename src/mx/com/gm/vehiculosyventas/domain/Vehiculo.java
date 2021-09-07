//CLASE PADRE VEHÍCULO
package mx.com.gm.vehiculosyventas.domain;


public class Vehiculo {  //Así podrán acceder a las clases hijas
    protected int codigo;
    protected String marca;
    protected String tipo; //Auto, Camioneta o Motocicleta
    protected int modelo; //Hace referencia al año del coche
    protected String patente; //Hace referencia a la matricula
    protected int kilometraje;
    
    //Constructor vacio
      public Vehiculo(){
          
      }
      //Inicializamos
      public Vehiculo(int codigo, String marca, String tipo, int modelo, String patente, int kilometraje){
          this.codigo = codigo;
          this.marca = marca;
          this.tipo = tipo;
          this.modelo = modelo;
          this.patente = patente;
          this.kilometraje = kilometraje;
      }

    public Vehiculo(String linea) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
      //métodos

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", patente=" + patente + ", kilometraje=" + kilometraje + '}';
    }
    
    
   
}
