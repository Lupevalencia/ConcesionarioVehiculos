
package mx.com.gm.vehiculosyventas.domain;


public class Autos extends Vehiculo {
    private int numeroAsientos;
    private int numeroPuertas;
    
    
    public Autos(int numeroAsientos, int numeroPuertas, int codigo, String marca, String tipo, int modelo, String patente, int kilometraje) {
        super(codigo, marca, tipo, modelo, patente, kilometraje);
        this.numeroAsientos = numeroAsientos;
        this.numeroPuertas = numeroPuertas;
    }
    
    //métodos

    public int getNumeroAsientos() {
        return this.numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autos{numeroAsientos=").append(numeroAsientos);
        sb.append(", numeroPuertas=").append(numeroPuertas);
        sb.append(", ").append(super.toString()); //para acceder también a la información padre
        sb.append('}');                                    //llamamos al método toString de la clase padre
        return sb.toString();
    }
    
    
}
