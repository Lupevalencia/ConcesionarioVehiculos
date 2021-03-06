
package mx.com.gm.vehiculosyventas.domain;


public class Camionetas extends Vehiculo{
    private int numeroAsientos;
    
    public Camionetas(){
    }

    
    public Camionetas(String codigo){
        this.codigo = codigo;
    }
    
    public Camionetas(int numeroAsientos, String codigo, String marca, String tipo, float modelo, String patente, float kilometraje) {
        super(codigo, marca, tipo, modelo, patente, kilometraje);
        this.numeroAsientos = numeroAsientos;
    }

    //métodos
    public int getNumeroAsientos() {
        return this.numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camionetas{numeroAsientos=").append(numeroAsientos);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
