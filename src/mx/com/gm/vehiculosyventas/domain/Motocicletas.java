
package mx.com.gm.vehiculosyventas.domain;


public class Motocicletas extends Vehiculo{
    private int velocidadMaxima;
    private int numeroAsientos;

    public Motocicletas(int velocidadMaxima, int numeroAsientos, int codigo, String marca, String tipo, int modelo, String patente, int kilometraje) {
        super(codigo, marca, tipo, modelo, patente, kilometraje);
        this.velocidadMaxima = velocidadMaxima;
        this.numeroAsientos = numeroAsientos;
    }
    
    //métodos

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motocicletas{velocidadMaxima=").append(velocidadMaxima);
        sb.append(", numeroAsientos=").append(numeroAsientos);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
