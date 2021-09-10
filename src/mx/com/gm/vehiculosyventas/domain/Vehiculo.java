//CLASE PADRE VEHÍCULO
package mx.com.gm.vehiculosyventas.domain;


public class Vehiculo {  //Así podrán acceder a las clases hijas
    protected String codigo;
    protected String marca;
    protected String tipo; //Auto, Camioneta o Motocicleta
    protected float modelo; //Hace referencia al año del coche
    protected String patente; //Hace referencia a la matricula
    protected float kilometraje;
    
    //Constructor vacio
      public Vehiculo(){
          
      }
      //Inicializamos
      public Vehiculo(String codigo, String marca, String tipo, float modelo, String patente, float kilometraje){
          this.codigo = codigo;
          this.marca = marca;
          this.tipo = tipo;
          this.modelo = modelo;
          this.patente = patente;
          this.kilometraje = kilometraje;
      }
      //métodos

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
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

    public float getModelo() {
        return this.modelo;
    }

    public void setModelo(float modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public float getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", patente=" + patente + ", kilometraje=" + kilometraje + '}';
    }
    
    
   
}
