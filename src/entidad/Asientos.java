
package entidad;


public class Asientos {
    
    //atributos
    private Espectador e;
    private String ubicacion;
    // falta verificar poible atributo de ocupado

    public Asientos() {
    }

    public Asientos(Espectador e, String ubicacion) {
        this.e = e;
        this.ubicacion = ubicacion;
    }

    public Espectador getE() {
        return e;
    }

    public void setE(Espectador e) {
        this.e = e;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Asientos{" + "e=" + e + ", ubicacion=" + ubicacion + '}';
    }
    
    
    
}
