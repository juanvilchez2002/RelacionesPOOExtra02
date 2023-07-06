
package entidad;

import java.util.ArrayList;

public class Cine {
    //atributos
    private Pelicula pelicula;
    private int precio;
    private Asientos[][] sala;
    private ArrayList<String> disponible;

    public Cine(Pelicula pelicula, int precio, Asientos[][] sala) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.sala = sala;
    }

    public Cine(Pelicula pelicula, int precio, Asientos[][] sala, ArrayList<String> disponible) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.sala = sala;
        this.disponible = disponible;
    }

    public ArrayList<String> getDisponible() {
        return disponible;
    }

    public void setDisponible(ArrayList<String> disponible) {
        this.disponible = disponible;
    }
    
    

    public Cine() {
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Asientos[][] getSala() {
        return sala;
    }

    public void setSala(Asientos[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", precio=" + precio + ", sala=" + sala + ", disponible=" + disponible + '}';
    }
    
}
