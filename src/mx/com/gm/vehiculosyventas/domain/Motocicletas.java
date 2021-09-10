
package mx.com.gm.vehiculosyventas.domain;


public class Motocicletas extends Vehiculo{
    private float velocidadMaxima;
    
    public Motocicletas(){
    }
    
    public Motocicletas(String codigo){
        this.codigo = codigo;
    
    }

    public Motocicletas(float velocidadMaxima, String codigo, String marca, String tipo, float modelo, String patente, float kilometraje) {
        super(codigo, marca, tipo, modelo, patente, kilometraje);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    //métodos

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motocicletas{velocidadMaxima=").append(velocidadMaxima);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
