
package entidad;


public class Pelicula {
    //atributos
    private String titulo;
    private int duracionM;
    private int edadMin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracionM, int edadMin, String director) {
        this.titulo = titulo;
        this.duracionM = duracionM;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionM() {
        return duracionM;
    }

    public void setDuracionM(int duracionM) {
        this.duracionM = duracionM;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionM=" + duracionM + ", edadMin=" + edadMin + ", director=" + director + '}';
    }
    
    
}
