
package mx.com.gm.vehiculosyventas.domain;


public class Autos extends Vehiculo {
    private int numeroPuertas; //Podíamos haber puesto como atributo el color tmbn
    
    public Autos(){
    }
    
    public Autos(String codigo){
    }
    
    public Autos(int numeroPuertas, String codigo, String marca, String tipo, float modelo, String patente, float kilometraje) {
        super(codigo, marca, tipo, modelo, patente, kilometraje);
        this.numeroPuertas = numeroPuertas;
    }
    
    
    //métodos

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
        sb.append("Autos{numeroPuertas=").append(numeroPuertas);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

 
    
}
